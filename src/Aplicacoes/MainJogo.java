import java.util.Scanner;
import java.util.Random;

public class MainJogo {



    static Random aleatorio = new Random();
    static Scanner leitor = new Scanner(System.in);
    static String personagem;
    static int decisao1 = 0, decisao2 = 0, decisao3 = 0, decisao4 = 0;
    static int vidaJogador = 15;
    static int vidaGeorge = 15;

    public static void main(String[] args) {

        introducao();
        salaDeEstar();

    }

    /*Funcao de inicio do jogo com o texto contando a historia que pedindo o nome do personagem para o jogador */
    static void introducao() {

        System.out.println("  $$$$$$\\                      $$\\                       $$\\                     $$\\ $$\\ \n"
                + "$$  __$$\\                     \\__|                      $$ |                    $$ |$$ |\n"
                + "$$ /  $$ | $$$$$$\\   $$$$$$\\  $$\\ $$$$$$$\\   $$$$$$$\\ $$$$$$\\          $$$$$$\\  $$ |$$ |\n"
                + "$$$$$$$$ |$$  __$$\\  \\____$$\\ $$ |$$  __$$\\ $$  _____|\\_$$  _|         \\____$$\\ $$ |$$ |\n"
                + "$$  __$$ |$$ /  $$ | $$$$$$$ |$$ |$$ |  $$ |\\$$$$$$\\    $$ |           $$$$$$$ |$$ |$$ |\n"
                + "$$ |  $$ |$$ |  $$ |$$  __$$ |$$ |$$ |  $$ | \\____$$\\   $$ |$$\\       $$  __$$ |$$ |$$ |\n"
                + "$$ |  $$ |\\$$$$$$$ |\\$$$$$$$ |$$ |$$ |  $$ |$$$$$$$  |  \\$$$$  |      \\$$$$$$$ |$$ |$$ |\n"
                + "\\__|  \\__| \\____$$ | \\_______|\\__|\\__|  \\__|\\_______/    \\____/        \\_______|\\__|\\__|\n"
                + "          $$\\   $$ |                                                                    \n"
                + "          \\$$$$$$  |                                                                    \n"
                + "           \\______/                \n ");

        System.out.println("Insira o nome do personagem: \n");
        personagem = leitor.next();

        System.out.println("\nA família Craig, uma das mais ricas da cidade de Detroit estava longe de ser uma família exemplar.");
        System.out.println("Os irmãos George Craig e " + personagem + " Donovan-Craig sempre viveram em pé de guerra");
        System.out.println("até mesmo contra seus pais, mas, o pior ainda estaria por vir.");
        System.out.println("A mãe, Josephine Craig, uma pessoa completamente rancorosa e vaidosa ");
        System.out.println("tenta fazer da vida de seu enteado, " + personagem + ", um inferno");
        System.out.println(", ela não suporta o fato de que ele convive com eles na mesma casa e usufrui de toda a riqueza.");
        System.out.println("PRESSIONE [ENTER]\n");
        leitor.nextLine();
        leitor.nextLine();

        System.out.println("Após uma terrível discussão familiar, " + personagem);
        System.out.println("vai ao quarto do pai e o encontra morto em sua cama. ");
        System.out.println("Ao sair do quarto, percebe que policiais chegaram e escuta sua madrasta conversando com eles.");
        System.out.println("PRESSIONE [ENTER]\n");
        leitor.nextLine();

        System.out.println("- Não sabemos o que aconteceu, ontem discutimos e… aquele filho dele… " + personagem + "…");
        System.out.println("eu não aguento mais - Diz Josephine aos prantos.");
        System.out.println("- Calma minha senhora, descobriremos quem foi e começaremos por ele !");
        System.out.println("- afirma o policial, tendo como principal suspeito " + personagem + ".");
        System.out.println("PRESSIONE [ENTER]\n");
        leitor.nextLine();
    }

    /*Funcao para mostrar opcoes ao jogador, cada opcao com um case especifico e cada case ha uma funcao com determinado objetivo
    descritos nos comentarios acima deles */
    static void salaDeEstar() {

        do {
            System.out.println("===============================================\n");
            System.out.println("\nJunte três pistas e prove sua inocência\n");
            System.out.println("Você está na sala de estar, para onde deseja ir?\n");
            System.out.println("| 1 - Investigar o quarto enquanto a polícia não entra; |");
            System.out.println("| 2 - Quarto  Laila Craig;                              |");
            System.out.println("| 3 - Quarto George Craig;                              |");
            System.out.println("| 4 - Ir para meu quarto;                               |");
            System.out.println("| 5 - Consultar inventario;                             |");
            System.out.println("| 6 - Falar com George;                                 |");
            System.out.println("| 7 - Sair do jogo                                      |\n");
            System.out.println("===============================================\n");
            decisao1 = leitor.nextInt();

            switch (decisao1) {
                case 1:
                    InvestigarQuarto();
                    break;
                case 2:
                    QuartoDaLaila();
                    break;
                case 3:
                    quartoGeorge();
                    break;
                case 4:
                    irParaMeuQuarto();
                    break;
                case 5:
                    inventario();
                    break;
                case 6:
                    falarComGeorge();
                    break;
                case 7:
                    sairDoJogo();
                    break;
            }
        } while (decisao1 > 7);
    }

    /*Funcao para mostra ao usuário uma pista encontrada e retornando-o para a funcao salaDeEstar(); */
    static void InvestigarQuarto() {
        System.out.println("===============================================\n");
        System.out.println("| 1 - Observar cena do crime    |");
        System.out.println("| 2 - Olhar escravinha          |");
        System.out.println("| 3 - Consultar inventário      |");
        System.out.println("| 4 - Voltar para sala de estar |\n");
        System.out.println("===============================================\n");

        decisao4 = leitor.nextInt();

        switch (decisao4) {

            case 1:
                System.out.println("Voce encontrou um remedio, seu pai foi morto por envenenamento \n");
                InvestigarQuarto();
                break;
            case 2:
                encontrouBilhete();
                break;
            case 3:
                inventario();
                break;
            case 4:
                salaDeEstar();
                break;

        }

    }

    /*Esta funcao mostra ao jogador que nao a nada e o retorna para funcao salaDeEstar(); */
    static void QuartoDaLaila() {

        System.out.println("Aqui não tem nada.\n");

        System.out.println("PRESSIONE [ENTER] PARA VOLTAR");
        leitor.nextLine();
        leitor.nextLine();

        salaDeEstar();
    }

    /*Nesta funcao informados ao jogador um item encontrado e colocamos opcoes se ele quer ou não colotar o item, se coletado informa
    uma mensagem confirmando e uma opcao para retornar a funcao salaDeEstar(); */
    static void quartoGeorge() {

        System.out.println("Você encontrou uma nota fiscal em nome de seu irmão George, referente ao remédio que estava no quarto de seu pai.\n ");
        System.out.println("1 - Pegar e usar como prova;");
        System.out.println("2 - Voltar para sala de estar.\n");
        decisao2 = leitor.nextInt();

        switch (decisao2) {

            case 1:
                System.out.println("Item coletado. \n");
                salaDeEstar();
                break;

            case 2:
                salaDeEstar();
                break;
        }
    }

    /*Nesta funcao informados ao jogador um item encontrado e colocamos opcoes se ele quer ou não colotar o item, se coletado informa
    uma mensagem confirmando */
    static void irParaMeuQuarto() {

        System.out.println("Voce econtrou um gravador: \n");
        System.out.println("1 - Pegar;");
        System.out.println("2 - Voltar para sala de estar. \n");
        decisao3 = leitor.nextInt();

        switch (decisao3) {

            case 1:
                System.out.println("Item coletado\n");
                salaDeEstar();
                break;

            case 2:
                salaDeEstar();
                break;

        }
    }

    /*Esta funcao verifica se o jogador coletou a pista encontrada, se colotada ela fica em seu inventario */
    static void inventario() {

        if (decisao2 == 1) {
            System.out.println("Você posssui a nota fiscal referente ao remédio em nome de seu irmão George.\n ");
            
            if (decisao3 == 1) {
                System.out.println("Você possui um gravador.\n");

                System.out.println("PRESSIONE [ENTER]");
                leitor.nextLine();
                leitor.nextLine();

                salaDeEstar();
            }
        } else {
            System.out.println("Você ainda não possui nenhum item.\n ");

            System.out.println("PRESSIONE [ENTER]");
            leitor.nextLine();
            leitor.nextLine();

            salaDeEstar();
        }
    }

    /*Esta funcao verifica se o jogador coletou os itens, se não retorna para funcao salaDeEstar */
    static void falarComGeorge() {

        if (decisao2 == 1 && decisao3 == 1) {
            System.out.println("George é o assasino do seu pai, mas isto ainda não é o suficiente.\n");
            System.out.println("Vá até o George e consiga sua confissao.");

            System.out.println("PRESSIONE [ENTER] PARA CONTINUAR");
            leitor.nextLine();
            leitor.nextLine();

            luta();

        } else {
            System.out.println("Você ainda não pode falar com George.\n");

            salaDeEstar();
        }
    }

    /*Apos estar com as tres pistas nessa funcao comeca os dialogos do final da historia */
    static void luta() {

        System.out.println("- George o que houve?! O que você tem? – Diz " + personagem);
        System.out.println("-Saia daqui! Agora você quer falar comigo ?! – diz George muito alterado");
        System.out.println("- Sempre estive aqui. Mas, agora você passou dos limites!");
        System.out.println("George não aceita o que o irmão diz e os dois começam a brigar. \n");

        int atacar;
        int ataqueJogador = aleatorio.nextInt(5);
        int ataqueGeorge = aleatorio.nextInt(5);

        while (vidaGeorge > 0) {

            if (vidaJogador > 0) {

                System.out.println("Pressione 1 para atacar. ");
                atacar = leitor.nextInt();

                if (atacar == 1) {

                    vidaGeorge -= ataqueJogador;
                    vidaJogador -= ataqueGeorge;

                }
            }
            if (vidaGeorge <= 0) {

                System.out.println("Você ganhou a luta! Deseja usar o gravador para ter a confissão? ");
                int decisao = leitor.nextInt();
                if (decisao == 1) {
                    System.out.println("                    dS$$S$S$S$S$S$S$$Sb                    \n"
                            + "                   :$$S^S$S$S$S$S$S^S$$;                   \n"
                            + "                   SSP   `^$S$S$^'   TSS                   \n"
                            + "                   $$       `\"'       $$                   \n"
                            + "                  _SS ,-           -  SS_     Estou cansado! Sempre sou errado, sempre levo a culpa, eu não aguentava mais, ta legal !\n"
                            + "                 :-.|  _    - .-   _  |.-;    Ele teve o que mereceu, nosso pai teve o que mereceu!\n"
                            + "                 :\\(; ' \"-._   _.-\" ` |)/;    Se eu soubesse que me sentiria bem melhor, teria feito muito antes !\n"
                            + "                  \\`|  , o       o .  |'/    - Confessa George o assasinato de seu pai             \n"
                            + "                   \":     -'   `-     ;\"                  \n"
                            + "                     ;.              :                       \n"
                            + "                     : `    ._.    ' ;           VOCÊ CONSEGUIU A CONFISSÃO! ESTÁ LIVRE!           \n"
                            + "                   .sSb    _____    dSs.                   \n"
                            + "                _.d8dSSb.  |._.|   .SSbT8b._                \n"
                            + "            _.oOPd88SSSS T.     .P SSSS888OOo.             \n"
                            + "        _.mMMOOPd888SSSSb TSqqqSP dSSSS88OMOOOMm._         \n"
                            + "     .oOMMMOMOOM8O8OSSSSSb TSSSP dSSSSS8OOMMOOMMOOOo._     \n"
                            + "   .OOMMOOOMMOOMOOOO  \"^SSSTSSP dSSS^\"OOOOMMOOMMMOOMMMb.   \n"
                            + "  dOOOMMMOMMOOOMOOOO      \"^SSSS^\"   :OOO8MMMOOMMOOMMOMMb  \n"
                            + " :MMMOOMMOMMOOMMO8OS         `P      8O8OPdMMOOMMOMMOMMMM; \n"
                            + " MMMMOOMMMMMOOMbTO8S;               :8888MMMMMOMMOMMOMMMMM \n"
                            + " OMMMMOOMMMMOOOMMOOOS        S     :O8OPdMOMMMOMOMMOOMMMMO \n"
                            + ":OMMMMOOMMOMMOOMbTObTb.     :S;   .PdOPdMOOMMMMMOMMOMMMMMO;\n"
                            + "MOOMMMMOMMOMMOOMMMOObTSSg._.SSS._.PdOPdMOOMMMMOMMMMOMMMMOOM\n"
                            + "MMOMMMMOMMMOMMOOMMbT8bTSSSSSSSSSPd8OPdOOOMMMMOOMMMMOMMMOOMM\n"
                            + "MMOMMMOMMMMMOMMOOMMMbT8bTSSSSSPd88PdOOOOMMMMOOMMMMMMMMOOMMM");

                    break;
                }
            } else if (vidaJogador <= 0) {

                System.out.println("Voce perdeu! Inicie o jogo novamente. ");
                break;

            }

            System.out.println("\nDano causado pelo seu ataque: " + ataqueJogador + " Vida de George: " + vidaGeorge);
            System.out.println("\nDano causado pelo ataque de George: " + ataqueGeorge + " Sua vida: " + vidaJogador + "\n");

        }
    }

    /*Esta funcao encerra o jogo, mas deixando uma opcao para o jogador comecar tudo de novo */
    static void sairDoJogo() {

        System.out.println("JOGO ENCERRADO! \n ");

        int iniciar;
        System.out.println("Pressione 1 para iniciar ");
        iniciar = leitor.nextInt();

        if (iniciar == 1) {
            introducao();
        }

    }

    static void olharAoRedor() {
        String senha;
        System.out.println("\n=====================================\n");
        System.out.println("A porta do escritorio esta trancada");
        System.out.println("1 - Olhar ao redor ");
        System.out.println("2 - Voltar para sala de estar \n");
        System.out.println("=====================================\n");
        int decisao = leitor.nextInt();
        if (decisao == 1) {
            System.out.println("Nos móveis próximos e no chão não há nada!\n");
            System.out.println("Na parede tem um quadro abaixo: \n");

            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            System.out.println("§                              §");
            System.out.println("§      01000100 01101111       §");
            System.out.println("§      01101110 01100001       §");
            System.out.println("§  01110110 01100001 01101110  §");
            System.out.println("§                              §");
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§\n");

            System.out.println("Decifre o código binário e quem sabe ele lhe ajuda a abrir a porta.\n");
            System.out.print("-------> Digite a senha:");

            senha = leitor.next();

            if (senha.equals("Donovan")) {
                System.out.println("\n Senha Correta!" + senha.toUpperCase());
                System.out.println("Ao entrar no escritório, você avistou um testamento em cima da mesa.");
                System.out.println("Nele, seu pai deixa a herança para todos os membros da família, exceto George.");
                System.out.println("- huuum, \n");
                salaDeEstar();
            } else {
                System.out.println("\n===============================");
                System.out.println("SENHA INCORRETA, TENTE NOVAMENTE! ");
                System.out.println("===============================\n");
                olharAoRedor();
            }

        } else if (decisao == 2) {
            salaDeEstar();
        }
    }

    static void encontrouBilhete() {
        String posicao;

        System.out.println("Voce encontrou um bilhete rasgado, monte ele para descobrir o que está escrito \n ");
        System.out.println("     ____________        _____       ______________               ___          _______________       ________");
        System.out.println("(1) /uivo em seu |  (2) '¬fora|  (3) | Deixei o arq/  (4)        /tá '¬  (5)  |escritório. Ge/  (6) /orge es/");
        System.out.println("   | fora dele co/       /    |      |George está |             /     /       /mo você me pe/      /diu    / ");
        System.out.println("  /isa me ligue!/       |     |      |Qualquer co/     ________/     |       /             /      /_______/  ");
        System.out.println(" /_____________/        |_____|      |__________/     /______________|      /_____________/                \n");
        System.out.println(" Assinale a opção que possui a sequencia correta do quebra cabeça:");
        System.out.println("");
        System.out.println("");

        System.out.println(" A)2,4,3,1,5,6;               B) 3,1,5,6,4,2;");
        posicao = leitor.next();

        if (posicao.equalsIgnoreCase("A")) {
            System.out.println("\n===============================");
            System.out.println(" OPÇÃO ERRADA, TENTE NOVAMENTE !");
            System.out.println("===============================\n");
            encontrouBilhete();

        } else if (posicao.equalsIgnoreCase("B")) {
            System.out.println("Voce conseguiu montar o quebra cabeça: \n");

            System.out.println(" ____________________________________________________________");
            System.out.println("| Deixei o arq/uivo em seu |escritório. Ge/orge es/tá '¬fora|");
            System.out.println("|George está | fora dele co/mo você me pe/diu.   /     /    |");
            System.out.println("|Qualquer co/isa me ligue!/             /_______/     |     |");
            System.out.println("|__________/_____________/_____________/______________|_____|\n");

            System.out.println(" - O que sera este aquirvo que esta no escritorio ? ");
            System.out.println("Indo para o escritorio...\n");

            System.out.println("      &######%  .      \n"
                    + "      &/,..####%        \n"
                    + "    . ##/....,%&        \n"
                    + "    .  ((/***/# *       \n"
                    + "       .* &##%& .       \n"
                    + "         &&%%&&& .      \n"
                    + "         %#%,./&        \n"
                    + "        &%#%/.(&        \n"
                    + "      . %##%,*&&        \n"
                    + "       #####*%#  .      \n"
                    + "      #####%%&. .       \n"
                    + "     ,####&%%%%&    .   \n"
                    + "     *#####,&######%@   \n"
                    + "     %%%%%%    %#%%@@ , \n"
                    + "   @@@@@@@@@ , , .@@@ \n");
            olharAoRedor();
        }
    }
}
