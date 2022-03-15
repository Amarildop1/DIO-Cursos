package src;

import java.time.LocalDate;


public class Mentoria extends Conteudo{
    private LocalDate data;
    
    public Mentoria(){

    }


    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nData: " + data + "\n";
    }

    @Override
    public int calcularXP() {
        return XP_PADRAO + 20;
    }
    
    
   
    
} //Final da class Mentoria
