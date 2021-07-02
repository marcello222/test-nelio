package exercicio1;

/*ler os valores da largura e altura de um retangulo.
   Em seguida, mostrar na tela o valor de sua area, perimetro
   e diagonal.
 */
public class Retangulo {


        public double largura;
        public double altura;


        public double area() {
            return largura * altura;
        }

        public double perimetro(){
            return 2 * (largura + altura);
        }

        public double diagonal() {
            return Math.sqrt(largura * largura + altura * altura);
        }
}

