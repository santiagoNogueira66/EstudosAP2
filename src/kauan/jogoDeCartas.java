package kauan;

public class jogoDeCartas {
    public static void main(String[] args) {
        cartaComum cartaComum = new cartaComum();
        cartaMagica cartaMagica = new cartaMagica();
        cartaEspecial cartaEspecial = new cartaEspecial();
        cartaEspecial.jogar();
        cartaComum.jogar();
        cartaEspecial.jogar();
    }
}
