public class Fada extends Monstro {

    public Fada(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);
    }

    @Override
    public void poderEspecial() {
        IO.println("Seu poder está causando danos no adversário!");
    }
}
