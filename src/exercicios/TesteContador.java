package exercicios;

public class TesteContador {
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {
    imprimirValor();
    Contador.IncrementarContador();
    imprimirValor();
    Contador.ZerarContador();
    imprimirValor();
    Contador.IncrementarContador();
    Contador.IncrementarContador();
    Contador.IncrementarContador();
    imprimirValor();
    Contador c1 = new Contador();
    Contador c2 = new Contador();
    Contador c3 = new Contador();
    imprimirValor();
    }
}
