package src;

public abstract class Conteudo {

    protected static final int XP_PADRAO = 20;

    private String titulo;
    private String descricao;

    public abstract int calcularXP();


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}//Final da class Conteudo
