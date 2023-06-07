import java.util.Scanner;

public class SegundoTeste {
    public static void main(String[] args) throws Exception {
        Scanner text = new Scanner (System.in); // Entrada pelo teclado

        String name;
        int age;

        System.out.println("My second program in JAVA!"); //println já com quebra de linha

        System.out.println("What is your name");
        name = text.nextLine();
        System.out.println("Welcome " + name);

        System.out.println("How old are you?");
        age = text.nextInt();
        System.out.println("You are " + age + " years old");

        text.close();
    }
}
