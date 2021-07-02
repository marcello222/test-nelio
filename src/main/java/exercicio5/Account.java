package exercicio5;


public class Account {

    private int numero;//numero
    private String titular;//titular
    private double saldo;//saldo


    public Account(int numero, String saldo) {
        this.numero = numero;
        this.titular = saldo;
    }

    public Account(int numero, String saldo, int depositoInicial) {
        this.numero = numero;
        this.titular = saldo;
        deposit(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }


    public String getHolder() {
        return titular;
    }

    public void setHolder(String saldo) {
        this.titular = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double montante) {
        saldo += montante;

    }

    public void withdraw(double montante){
        saldo -= montante + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + numero
                + ", Holder: "
                + titular
                + ", Balance: $ "
                + String.format("%.2f", saldo);
    }
}
