package vetor.exercicio;

import java.text.ParseException;
import java.util.Scanner;

/*A dona de um pensionato possui dez quartos para alugar para estudantes,
        sendo esses quartos identificados pelos números 0 a 9.
        Fazer um programa que inicie com todos os dez quartos vazios,e depois
        leia uma quantidade N representando o número de estudantes que vão
        alugar quartos(N pode ser de 1 a 10).Em seguida,registre o aluguel dos
        N estudantes.Para cada registro de aluguel,informar o nome e email do
        estudante,bem como qual dos quartos ele escolheu(de 0 a 9).Suponha
        que se ja escolhido um quarto vago. Ao final,seu programa deve imprimir
        um relatório de todas ocupações do pensionato,por ordem de quarto,
        conforme exemp
*/
public class Program {


    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Alugar[] vect = new Alugar[10];

        System.out.print("Quantos quartos serão alugados? ");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Alugar #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();
            vect[room] = new Alugar(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados sâo: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }


}

