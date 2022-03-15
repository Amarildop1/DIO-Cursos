package src;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Developer {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluindos = new LinkedHashSet<>();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluindos() {
        return conteudosConcluindos;
    }
    public void setConteudosConcluindos(Set<Conteudo> conteudosConcluindos) {
        this.conteudosConcluindos = conteudosConcluindos;
    }


    public void inscreverEmBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);    
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        
        if(conteudo.isPresent()){
            this.conteudosConcluindos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");        
        }
    }

    public double calcularTotalXP(){
        return this.conteudosConcluindos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();    
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.conteudosInscritos);
        hash = 41 * hash + Objects.hashCode(this.conteudosConcluindos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Developer other = (Developer) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.conteudosConcluindos, other.conteudosConcluindos);
    }


}//Final da class Developer
