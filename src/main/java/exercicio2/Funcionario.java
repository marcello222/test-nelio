package exercicio2;

/*Ler os dados de um funcionario(nome, salario bruto e imposto).
Em seguida, mostrar os dados do funcionario(nome e salario liquido).
Em seguida, aumentar o salario do funcionario com base em uma porcentagem dada
(somente o salario bruto é afetado pela porcentagem) e mostrar novamente os dados
do funcionario.
 */

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;


    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void incrementoDeSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return nome + ", $" + String.format("%.2f", salarioLiquido());
    }
}
