public abstract class Monstro {
<<<<<<< HEAD

=======
>>>>>>> 427828be6397848e7e3f6196b1cd7b983290ff29
    private String nome;
    private int defesa;
    private int vida;
    private int nivelPoder;

<<<<<<< HEAD

=======
>>>>>>> 427828be6397848e7e3f6196b1cd7b983290ff29
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

<<<<<<< HEAD
    public void ataque(){
        IO.println("Seu personagem está atacando!!");
    }

    public void defesa(){
        IO.println("Seu personagem ta defendendooo!!");

    }

    public void poderEspecial(){
        IO.println("O monstro esta usando seu poder especial");
    }
}
=======
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





>>>>>>> 427828be6397848e7e3f6196b1cd7b983290ff29
