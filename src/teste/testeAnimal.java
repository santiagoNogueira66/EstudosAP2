package teste;

public class testeAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        gato.dormir();//gato tá dormindo
        gato.emitirSom(); //gato tá miando
        cachorro.emitirSom();//cachorro latindo
        cachorro.dormir();//cachorrro tá dormindo
    }
}
