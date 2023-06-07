package exemplo_classe_caneta;

public class Caneta {
    String marca;
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;

    void riscar() {
        if(this.tampa == true) {
            System.out.println("Erro! A caneta esta tampada, nao tem como riscar. ");
        } else if (carga == 0) {
            System.out.println("A caneta esta sem carga, nao tem como riscar");
        } else {
            System.out.println("Pode riscar tudo");
        }
    }

    void tampar() {
        this.tampa = true ;
    }

    void destampar() {
        this.tampa = false;
    }

    void estado() {
        System.out.println("Essa caneta e da marca: " + this.marca); //this funciona como auto referência
        System.out.println("Essa caneta e do modelo: " + this.modelo);
        System.out.println("Essa caneta e da cor: " + this.cor);
        System.out.println("Essa caneta tem a ponta: " + this.ponta);
        System.out.println("Essa caneta esta com a carga em: " + this.carga + "%");
        System.out.println("Essa caneta esta: " + this.tampa);
    }
}
