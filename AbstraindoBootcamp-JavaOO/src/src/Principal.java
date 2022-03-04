package src;

import java.time.LocalDate;


public class Principal {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada à Objetos com Java");
        curso1.setDescricao("Aulas de Java atualizadas");
        curso1.setCargaHoraria(40);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript e POO");
        curso2.setDescricao("Aulas de Javascript");
        curso2.setCargaHoraria(40);
        
        System.out.println("\n=============== Bootcamp ===============");
        System.out.println(curso1);
        System.out.println(curso2);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Entrando no mercado com Java");
        mentoria.setDescricao("Programação com Java");
        mentoria.setData(LocalDate.now());
        
        System.out.println(mentoria);
        
    }//Final do método main
}//Final da class Principal
