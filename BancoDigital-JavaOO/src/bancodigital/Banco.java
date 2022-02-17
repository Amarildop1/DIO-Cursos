package bancodigital;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    
    public Banco(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
    
}
