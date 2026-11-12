import java.awt.image.ImagingOpException;

public class Main {

    public static void main(String[] args) {
        System.out.println("----- ASCENSÃO -----");
        System.out.println("Bem-vindo ao mundo dos monstros!");

        int escolha = 0;

        while (escolha < 1 || escolha > 5) {

            System.out.println("");
            System.out.println("Escolha seu monstro");
            System.out.println("1 - Lobo");
            System.out.println("2 - Vampiro");
            System.out.println("3 - Sereia");
            System.out.println("4 - Mago");
            System.out.println("5 - Fada");

            escolha = Integer.parseInt(
                    IO.readln("Escolha seu personagem: ")
            );

            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        Monstro jogador = null;

        switch (escolha) {

            case 1:
                jogador = new Lobo("Scott", 49, 100, 28);
                break;

            case 2:
                jogador = new Vampiro("Dracula", 86, 100, 31);
                break;

            case 3:
                jogador = new Sereia("Nanda", 99, 100, 35);
                break;

            case 4:
                jogador = new Mago("PatoLino", 67, 100, 23);
                break;

            case 5:
                jogador = new Fada("Flora", 154, 100, 38);
                break;
        }

        if (jogador != null) {

            System.out.println("");
            System.out.println("Você escolheu: " + jogador.getNome());
            System.out.println("Vida: " + jogador.getVida());
            System.out.println("Nivel de poder: " + jogador.getNivelPoder());
            System.out.println("Esteja pronto para a batalha!");



            Monstro inimigo = new Vampiro("Morgana", 44, 98, 87);
            System.out.println("");
            System.out.println("Um inimigo apaeceu!!!");
            System.out.println("O seu adversário será: " + inimigo.getNome());
            System.out.println("Vida do adversário: " + inimigo.getVida());
            System.out.println("Nivel de poder do seu adversário: " + inimigo.getNivelPoder());

            int acao = 0;

            while (jogador.getVida() > 0 && inimigo.getVida() > 0) {
                System.out.println("");
                System.out.println("---BATALHA---");

                System.out.println(jogador.getNome() + " | Vida: " + jogador.getVida());
                System.out.println(inimigo.getNome() + " | Vida: " + inimigo.getVida());

                System.out.println("");
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Atacar");
                System.out.println("2 - Defender");
                System.out.println("3 - Poder especial");

                acao = Integer.parseInt(IO.readln("Escolha sua ação: "));

                if (acao < 1 || acao > 4) {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }


                switch (acao) {

                    case 1:
                        jogador.ataque(inimigo);
                        break;

                    case 2:
                        jogador.defesa(inimigo);
                        break;

                    case 3:
                        jogador.poderEspecial();
                        break;

                }



                if (inimigo.getVida() < 0) {
                    inimigo.setVida(0);
                }

                if (inimigo.getVida() > 0) {

                    System.out.println("");
                    System.out.println("---VEZ DO INIMIGO---");

                    if (inimigo.getVida() < 30) {
                        inimigo.defesa(jogador);
                    } else {
                        inimigo.ataque(jogador);
                    }
                }

                    if (jogador.getVida() < 0) {
                        jogador.setVida(0);
                    }
                }

            System.out.println("");


            if (jogador.getVida() > 0) {
                System.out.println("VOCÊ VENCEU A FASE 1!");
                System.out.println("");


                jogador.setVida(jogador.getVida() + 30);
                System.out.println("Você descansou e recuperou +30 de vida! (Vida atual: " + jogador.getVida() + ")");


                Arma recompensa = new Arma("Lâmina da Ascensão", 15);
                jogador.equiparArma(recompensa);


                Monstro chefeFinal = new Vampiro("Asta", 12, 90, 22);
                System.out.println("");
                System.out.println("--- FASE 2: O TRONO DA ASCENSÃO ---");
                System.out.println("");
                System.out.println("O chefe final apareceu: " + chefeFinal.getNome());
                System.out.println(" Vida do chefe final: " + chefeFinal.getVida());

                while (jogador.getVida() > 0 && chefeFinal.getVida() > 0) {
                    System.out.println("--- BATALHA FINAL (FASE 2) ---");
                    System.out.println(jogador.getNome() + " | Vida: " + jogador.getVida());
                    System.out.println(chefeFinal.getNome() + " | Vida: " + chefeFinal.getVida());

                    System.out.println("O que deseja fazer?");
                    System.out.println("1 - Atacar");
                    System.out.println("2 - Defender");
                    System.out.println("3 - Poder especial");

                    acao = Integer.parseInt(IO.readln("Escolha sua ação: "));

                    if (acao < 1 || acao > 3) {
                        System.out.println("Opção inválida! Tente novamente.");
                        continue;
                    }


                    switch (acao) {
                        case 1:
                            jogador.ataque(chefeFinal);
                            break;
                        case 2:
                            jogador.defesa(chefeFinal);
                            break;
                        case 3:
                            jogador.poderEspecial();
                            break;
                    }


                    if (chefeFinal.getVida() > 0) {
                        System.out.println("\n--- VEZ DO INIMIGO ---");
                        if (chefeFinal.getVida() < 30) {
                            chefeFinal.defesa(jogador);
                        } else {
                            chefeFinal.ataque(jogador);
                        }
                    }
                }
            }


            if (jogador.getVida() > 0) {
                System.out.println(" PARABÉNS! VOCÊ FINALIZOU O JOGO! ");
            } else {
                System.out.println(" VOCÊ FOI DERROTADO! FIM DE JOGO.");
            }



            }



        }

    }

