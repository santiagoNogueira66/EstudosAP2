package exe03ChatGpt;

public class JogoDeCartas {
    public static void main(String[] args) {
        cartaComum cartaComum = new cartaComum();
        cartaEspecial cartaEspecial = new cartaEspecial();
        cartaMagica cartaMagica = new cartaMagica();
        cartaComum.jogar();
        cartaEspecial.jogar();
        cartaMagica.jogar();
    }
}
