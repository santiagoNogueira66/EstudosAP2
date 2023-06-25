package padrão;

public class TesteMInhaCalculadora {
    public static void main(String[] args) {
        /*MinhaCalculadora calc = new MinhaCalculadora();
        int soma1 = calc.soma(1,2);
        System.out.println(soma1);
        int som2 = calc.soma(1,2);
        System.out.println(som2);
        int soma3 = calc.soma(1,3);
        System.out.println(soma3);
    */
        MinhaCalculadora.soma(1,2);
        MinhaCalculadora.soma(3.5, 4.8);
        MinhaCalculadora.soma(1,4);

    }

}
