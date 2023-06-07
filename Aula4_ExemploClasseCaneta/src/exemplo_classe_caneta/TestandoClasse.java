package exemplo_classe_caneta;

public class TestandoClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando classes dentro do JAVA");

        Caneta caneta1 = new Caneta();

        caneta1.marca = "BIC";
        caneta1.modelo = "Cristal";
        caneta1.cor = "Preta";
        caneta1.ponta = 0.5f;
        caneta1.carga = 0;
        caneta1.tampar();
        caneta1.riscar();
        caneta1.estado();

        System.out.println("_________________________");

        Caneta caneta2 = new Caneta();

        caneta2.marca = "Faber Castell";
        caneta2.modelo = "Prateado";
        caneta2.cor = "Azul";
        caneta2.ponta = 0.7f;
        caneta2.carga = 10;
        caneta2.riscar();
        caneta2.estado();

    }
}
