package bancodigital;

public abstract class Conta {

    private static final int AGENCIA_SEDE = 111;
    private static int SEQUENCIA_CONTA = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int agencia, int numero, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public static int getSEQUENCIA_CONTA() {
        return SEQUENCIA_CONTA;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }    
    
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    public void imprimirDadosDaConta(){
        System.out.println(String.format("Agência: %d ", this.agencia));
        System.out.println(String.format("Número: %d ", this.numero));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
    }
}
