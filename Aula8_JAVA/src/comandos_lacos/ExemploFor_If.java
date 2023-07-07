package comandos_lacos;
import java.util.Scanner;

public class ExemploFor_If {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;

        Scanner entrada = new Scanner(System.in);

        for(int n = 1; n <= 10; n++) {
            System.out.println(("Entre com um numero qualquer: "));
            int number = entrada.nextInt();
            
            if(number % 2 == 0) {
                System.out.println(number + ": Esse numero e par");
                par += 1; //par = par + 1;
            } else {
                System.out.println(number + ": Esse numero e impar");
                impar = impar + 1; //impar += 1;
            }
        }

        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares" + impar);

        entrada.close();
    }
}
