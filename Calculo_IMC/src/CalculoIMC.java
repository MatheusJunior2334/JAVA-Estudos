import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = entrada.nextDouble();

        double calculo;
        calculo = peso/Math.pow(altura, 2);

        System.out.println("Seu IMC e de: " + calculo);

        if (calculo < 18.5) {
            System.out.println("Voce esta abaixo do peso");
        } else if ((calculo >= 18.5) && (calculo < 25)) {
            System.out.println("Voce esta com o peso ideal");
        } else if ((calculo >= 25) && (calculo < 30)) {
            System.out.println("Voce esta levemente acima do peso");
        } else if ((calculo >= 30) && (calculo < 35)) {
            System.out.println("Voce esta com obesidade de Grau I");
        } else if ((calculo >= 35) && (calculo < 40)) {
            System.out.println("Voce esta com obesidade de Grau II");
        } else {
            System.out.println("Voce esta com obesidade morbida");
        }

        entrada.close();
    }
}
