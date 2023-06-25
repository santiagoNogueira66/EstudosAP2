package kauan;

public final class leao implements animal{
    @Override
    public void emetirSom() {
        System.out.println("o leão está rugindo");
    }

    @Override
    public void mover() {
        System.out.println("o leão está correndo");
    }
}
