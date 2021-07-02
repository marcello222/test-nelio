package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entrar retangulo, altura e largura");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

        sc.close();
    }
}
