package exemplo_caixa_eletronico;

public class CaixaEletronico {
    public static void main(String[] args) {
        System.out.println("Exemplo de caixa eletronico - usando metodo construtor");

        Conta numero_conta = new Conta ("Eleanor", 5230);
        numero_conta.Iniciar();
    }
}
