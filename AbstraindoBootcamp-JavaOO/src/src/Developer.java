package src;

import java.util.LinkedHashSet;
import java.util.Objects;
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
    
    }

    public void progredir(){
    
    }

    public void calcularTotalXP(){
    
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
