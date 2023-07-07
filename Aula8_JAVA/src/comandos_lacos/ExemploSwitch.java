package comandos_lacos;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        System.out.println("Dia da semana");

        Scanner entrada = new Scanner(System.in);

        int DiaSemana = 0;
        String NomeDia;

        System.out.println("Digite um numero e veja qual o dia da semana ele se refere: ");
        DiaSemana = entrada.nextInt();

        switch(DiaSemana) {
            case 1:
            NomeDia = "Domingo";
            break;

            case 2:
            NomeDia = "Segunda-feira";
            break;

            case 3:
            NomeDia = "Terca-feira";
            break;

            case 4:
            NomeDia = "Quarta-feira";
            break;
            
            case 5:
            NomeDia = "Quinta-feira";
            break;

            case 6:
            NomeDia = "Sexta-feira";
            break;

            case 7:
            NomeDia = "Sabado";
            break;

            default:
            NomeDia = "Dia Invalido";
        }

        System.out.println(NomeDia);

        entrada.close();
    }
}
