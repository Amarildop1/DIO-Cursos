package bancodigital;

public class Principal {
    
    public static void main(String[] args) {
        Conta contaCorrente1 = new ContaCorrente();
        Conta contaCorrente2 = new ContaCorrente();
        Conta contaCorrente3 = new ContaCorrente();
        
        Conta contaPoupanca1 = new ContaPoupanca();
        Conta contaPoupanca2 = new ContaPoupanca();
        
        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
        contaCorrente3.imprimirExtrato();
        
        System.out.println("======================================");
        
        contaPoupanca1.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
        
        System.out.println("======================================");
        
        contaPoupanca1.depositar(500);
        contaCorrente1.depositar(800);
        contaCorrente1.transferir(600, contaPoupanca1);
        
        contaPoupanca1.imprimirExtrato();
        contaCorrente1.imprimirExtrato();
        
        
    }
}
