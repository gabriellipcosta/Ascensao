public class Sereia extends Monstro{


    public Sereia(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);

    }


    @Override
    public void poderEspecial() {
        IO.println("Seu adversario está com lentidão!");
    }
}
