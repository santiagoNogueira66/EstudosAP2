package cursoUndemy;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Carro();
        Veiculo v3 = new Moto();
        v1.acelerar();//o veiculo está acelerando
        v2.acelerar();//o carro está acelerando
        v3.acelerar();//a moto está acelerando
    }
}
