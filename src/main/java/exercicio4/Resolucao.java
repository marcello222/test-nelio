package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Dolar dolar = new Dolar();
        System.out.println("Nome: ");
        dolar.nome = sc.nextLine();
        System.out.println("Valor comprado em dolar: ");
        dolar.dolar = sc.nextDouble();

        System.out.println("O valor em reais pago foi: " + dolar.conversaoDolar());
        System.out.println("O valor em reais pago com desconto: " + (dolar.conversaoDolar()- dolar.descontadoImposto()));




        sc.close();





    }
}