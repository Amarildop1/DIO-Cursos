package bancodigital;

public class Principal {
    
    public static void desenhaLinha(){
        System.out.println("=========================================");
    }
    
    public static void main(String[] args) {
        
        Banco b1 = new Banco("\t\tBanco Br1");
        
        Principal.desenhaLinha(); // Separar bloco de texto
        System.out.println(b1.getNome());
        System.out.println(".........................................");
        
        Cliente cliente1 = new Cliente("John", "123456789");
        Cliente cliente2 = new Cliente("Maria", "321321321");
        Cliente cliente3 = new Cliente("Joana", "987987456");

        Conta contaCorrente1 = new ContaCorrente(cliente1);
        Conta contaCorrente2 = new ContaCorrente(cliente2);
        Conta contaCorrente3 = new ContaCorrente(cliente3);
        
        Conta contaPoupanca1 = new ContaPoupanca(cliente1);
        Conta contaPoupanca2 = new ContaPoupanca(cliente2);
        
        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
        contaCorrente3.imprimirExtrato();
        
        Principal.desenhaLinha(); // Separar bloco de texto
        
        contaPoupanca1.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
        
        Principal.desenhaLinha(); // Separar bloco de texto
        
        contaPoupanca1.depositar(500);
        contaCorrente1.depositar(800);
        contaCorrente1.transferir(600, contaPoupanca1);
        
        contaPoupanca1.imprimirExtrato();
        contaCorrente1.imprimirExtrato();
        
        Principal.desenhaLinha(); // Separar bloco de texto
        
    }
}
