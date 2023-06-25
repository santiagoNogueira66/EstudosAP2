package calc;

import calc.calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
    iprimirtela(calculadora.somar(1,2));
    iprimirtela(calculadora.subtrair(2,1));
    iprimirtela(calculadora.dividir(4,2));
    iprimirtela(calculadora.multiplicar(2,3));
    iprimirtela(calculadora.potencia(2,3));
    }
    static  void iprimirtela(int num){
        System.out.println(num);
    }
}
