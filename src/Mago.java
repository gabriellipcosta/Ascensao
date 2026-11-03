<<<<<<< HEAD
public class Mago extends Monstro {

    public Mago(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);
=======
public class Mago extends Monstro{




    public Mago(String nome, int defesa, int vida, int nivelPoder) {
        super(nome, defesa, vida, nivelPoder);

>>>>>>> 427828be6397848e7e3f6196b1cd7b983290ff29
    }

    @Override
    public void poderEspecial() {
        IO.println("O mago está usando seu feitiço!");
    }
}
