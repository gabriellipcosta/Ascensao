import java.awt.image.ImagingOpException;

public class Main {

    public static void main(String[] args) {
        IO.println("----- ASCENSÃO -----");
        IO.println("Bem-vindo ao mundo dos monstros!");

        int escolha = 0;

        while (escolha < 1 || escolha > 5) {

            IO.println("");
            IO.println("Escolha seu monstro");
            IO.println("1 - Lobo");
            IO.println("2 - Vampiro");
            IO.println("3 - Sereia");
            IO.println("4 - Mago");
            IO.println("5 - Fada");

            escolha = Integer.parseInt(
                    IO.readln("Escolha seu personagem: ")
            );

            if (escolha < 1 || escolha > 5) {
                IO.println("Opção inválida! Tente novamente.");
            }
        }

        Monstro jogador = null;

        switch (escolha) {

            case 1:
                jogador = new Lobo("Scott", 10, 100, 10);
                break;

            case 2:
                jogador = new Vampiro("Dracula", 10, 100, 10);
                break;

            case 3:
                jogador = new Sereia("Nanda", 10, 100, 10);
                break;

            case 4:
                jogador = new Mago("PatoLino", 10, 100, 10);
                break;

            case 5:
                jogador = new Fada("Flora", 10, 1000, 4000);
                break;
        }

        if (jogador != null) {

            IO.println("");
            IO.println("Você escolheu: " + jogador.getNome());
            IO.println("Vida: " + jogador.getVida());
            IO.println("Esteja pronto para a batalha!");


            Monstro inimigo = new Vampiro("Morgana", 44, 98, 87);
            IO.println("");
            IO.println("Um inimigo apaeceu!!!");
            IO.println("O seu adversário será: " + inimigo.getNome());
            IO.println("Vida do adversário: " + inimigo.getVida());

            int acao = 0;

            while (jogador.getVida() >0 && inimigo.getVida() > 0){
                IO.println("");
                IO.println("---BATALHA---");





            }
        }















    }


}
