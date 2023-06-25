package exercicios;

public class Contador {
static int contador;
public Contador(){
    contador++;
}
public static void IncrementarContador(){
    contador++;
}
public static double ZerarContador(){
    return contador = 0;
}
public static int obterValor(){
    return contador;
}

}
