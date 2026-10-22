public abstract class Monstro {
    private String nome;
    private int defesa;
    private int vida;
    private int nivelPoder;

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

    public void ataque(Monstro inimigo){
        IO.println(getNome() + " está atacando " + inimigo.getNome() + "!!!!" );

        int dano = getNivelPoder();
        inimigo.setVida(inimigo.getVida() - dano);

        IO.println(inimigo.getNome() + " recebeu " + dano + " de dano!");

    }

    public void defesa(Monstro inimigo){
        IO.println("!seu personagem está defendendo!");
    }

    public void poderEspecial() {
        IO.println("O monstro está usando seu poder especial!");
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





