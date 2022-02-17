package bancodigital;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("\n***** Extrato da Conta Corrente ***** ");
        super.imprimirDadosDaConta();
    }
    
}
