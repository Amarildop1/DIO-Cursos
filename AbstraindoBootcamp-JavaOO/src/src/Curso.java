package src;


public class Curso extends Conteudo {
    private int cargaHoraria;
    
    public Curso(){

    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nCarga Horária: " + cargaHoraria + "\n";
    }

    @Override
    public int calcularXP() {
        return XP_PADRAO * cargaHoraria;

    }
    
    
    
    
} //Final da class Curso
