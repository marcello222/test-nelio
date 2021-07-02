package exercicio4;

public class Dolar {

    public String nome;
    public double dolar;
    public double real = 3.10;
    public double imposto = 4 / 100;

    public double conversaoDolar(){
        return dolar * real;
    }

    public double descontadoImposto(){
        return conversaoDolar() - imposto;

    }



}
