public class Lobo extends Monstro{


    public Lobo(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);

    }

    @Override
    public void poderEspecial() {
        IO.println("O lobo está usando seu uivo supersônico!");
    }
}
