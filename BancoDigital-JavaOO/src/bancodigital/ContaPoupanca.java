package bancodigital;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\n***** Extrato da Conta Poupança ***** ");
        super.imprimirDadosDaConta();
    }
}
