import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) throws Exception {
        Scanner nota = new Scanner (System.in);
        float n1, n2, n3, n4, average;

        System.out.println("Digite a primeira nota: ");
        n1 = nota.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = nota.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = nota.nextFloat();

        System.out.println("Digite a quarta nota: ");
        n4 = nota.nextFloat();

        average = (n1 + n2 + n3 + n4) / 4;

        System.out.printf("A media das notas inseridas foi de: %.2f ", average);

        if (average >= 7) {
            System.out.println("Voce foi aprovado!");
        } else {
            System.out.println("Você foi reprovado");
        }

        nota.close();
    }
}
