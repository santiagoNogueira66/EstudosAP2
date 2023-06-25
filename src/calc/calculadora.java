package calc;

public class calculadora {
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    public static int subtrair(int num1 , int num2){
        return num1 - num2;
    }
    public static int multiplicar(int num1, int num2 ){
        return num1*num2;
    }
    public static int dividir(int num1 , int num2){
        return num1/num2;
    }
    public static int potencia(int num1, int num2) {
        double resultado = Math.pow(num1, num2);
        return (int) resultado;
    }
}
