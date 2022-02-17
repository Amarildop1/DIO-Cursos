package bancodigital;

public class ContaPoupanca extends Conta{

//    public ContaPoupanca(int agencia, int numero, double saldo, Cliente cliente) {
//        super(agencia, numero, saldo, cliente);
//    }


    public void imprimirExtrato(){
        System.out.println(" ***** Extrato da Conta Poupança ***** ");
        super.imprimirDadosDaConta();
    }
}
