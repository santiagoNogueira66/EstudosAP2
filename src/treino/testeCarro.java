package treino;

public class testeCarro {
    public static void main(String[] args) {
        carro carro = new carro();
       carro.setMarca("fiat");
       carro.setModelo("uno");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
    }
}
