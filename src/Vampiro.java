public class Vampiro extends Monstro {

    public Vampiro(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);
    }

    @Override
    public void poderEspecial() {
        System.out.println("O vampiro está hipnotizando seu adversário!");
    }

}
