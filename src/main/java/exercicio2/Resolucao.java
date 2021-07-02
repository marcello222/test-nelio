package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario);
        System.out.println();
        System.out.print("Qual porcentagem do incremento do salario? ");

        double porcentagem = sc.nextDouble();
        funcionario.incrementoDeSalario(porcentagem);

        System.out.println();
        System.out.println("Updated data: " + funcionario);
        sc.close();

    }
}
