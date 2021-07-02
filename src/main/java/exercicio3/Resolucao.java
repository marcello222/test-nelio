package exercicio3;


import java.util.Locale;
import java.util.Scanner;

public class Resolucao {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("atividade1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("atividade2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("atividade3: ");
        aluno.nota3 = sc.nextDouble();
        System.out.print("atividade4: ");
        aluno.nota4 = sc.nextDouble();

        System.out.println();
        double porcentagem = 40;
        System.out.println("nota final das atividades: " + aluno.notaFinalAtividades(porcentagem));

        System.out.println();
        System.out.print("provaN2: ");
        aluno.provaN2 = sc.nextDouble();

        double porcentagemProva = 60;
        System.out.println("nota final da prova: " + aluno.notaFinalProva(porcentagemProva));

        System.out.println();
        System.out.println("Total da média é: "
                        + (aluno.notaFinalProva(porcentagemProva)
                        + aluno.notaFinalAtividades(porcentagem)));

        sc.close();
    }

}