public class Mago extends Monstro{




    public Mago(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);

    }

    @Override
    public void poderEspecial() {
        IO.println("O mago está usando seu feitiço!");
    }
}
