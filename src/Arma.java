public class Arma {
    public String nome;
    public int bonusPoder;

    public Arma(String nome, int bonusPoder) {
        this.nome = nome;
        this.bonusPoder = bonusPoder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBonusPoder() {
        return bonusPoder;
    }

    public void setBonusPoder(int bonusPoder) {
        this.bonusPoder = bonusPoder;
    }
}
