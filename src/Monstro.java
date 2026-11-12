public abstract class Monstro implements Combate{

    private String nome;
    private int defesa;
    private int vida;
    private int nivelPoder;
    private Arma equipar;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public Monstro(String nome, int defesa, int vida, int nivelPoder) {
        this.nome = nome;
        this.defesa = defesa;
        this.vida = vida;
        this.nivelPoder = nivelPoder;
    }

    public void equiparArma (Arma arma){
        this.equipar= arma;
        this.nivelPoder += arma.getBonusPoder();
        System.out.println(getNome() + " equipou a arma " + arma.nome + " (+" + arma.getBonusPoder() + " de poder)!");
    }

    public void ataque(Monstro inimigo) {

        System.out.println(getNome() + " está atacando " + inimigo.getNome() + "!!!!");

        int dano = getNivelPoder();

        inimigo.setVida(inimigo.getVida() - dano);

        System.out.println(inimigo.getNome() + " recebeu " + dano + " de dano!");
    }

    public void defesa(Monstro inimigo) {
        System.out.println(getNome() + " está defendendo o ataque de " + inimigo.getNome() + "!");

        int danoReduzido = inimigo.getNivelPoder() - getDefesa();
        if (danoReduzido < 0) {
            danoReduzido = 0;
        }

        setVida(getVida() - danoReduzido);
        System.out.println(getNome() + " defendeu e recebeu apenas " + danoReduzido + " de dano!");
    }

    public void poderEspecial() {
        System.out.println("O monstro está usando seu poder especial!");
    }

    @Override
    public String toString() {
        return "Monstro{" +
                "nome='" + nome + '\'' +
                ", defesa=" + defesa +
                ", vida=" + vida +
                ", nivelPoder=" + nivelPoder +
                '}';
    }
}
