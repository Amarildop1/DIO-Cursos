package src;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\n==================== Conteúdos ====================");
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada à Objetos com Java");
        curso1.setDescricao("Aulas de Java atualizadas");
        curso1.setCargaHoraria(40);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript e POO");
        curso2.setDescricao("Aulas de Javascript");
        curso2.setCargaHoraria(40);

        System.out.println(curso1);
        System.out.println(curso2);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Entrando no mercado com Java");
        mentoria.setDescricao("Programação com Java");
        mentoria.setData(LocalDate.now());
        
        System.out.println(mentoria);
        
        System.out.println("\n==================== Bootcamp ====================");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("O bootcamp Java Developer vai te ensinar do zero ao avançado.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Developer devJohn = new Developer();
        devJohn.setNome("John John");
        devJohn.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devJohn.getConteudosInscritos());
        
        devJohn.progredir();
        System.out.println("Conteúdos Concluídos: " + devJohn.getConteudosConcluindos());
        
        Developer devAnna = new Developer();
        devAnna.setNome("Anna Júlia");
        devAnna.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devAnna.getConteudosInscritos());
        devAnna.progredir();
        System.out.println("Conteúdos Concluídos: " + devAnna.getConteudosConcluindos());

        System.out.println("\n==================== FINAL ====================");
        
    }//Final do método main
}//Final da class Principal
