package exercicio3;


public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    public double provaN2;

    public double notaFinalAtividades(double porcentagem) {
        return (nota1 + nota2 + nota3 + nota4) / 4 * (porcentagem / 100);
    }

    public double notaFinalProva(double porcentagemProva){
        return provaN2 * (porcentagemProva / 100);
    }


}