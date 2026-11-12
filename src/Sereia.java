public class Sereia extends Monstro {

    public Sereia(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);
    }

    @Override
    public void poderEspecial() {
        System.out.println("Seu adversário está com lentidão!");
    }
}