import java.util.Locale;
import java.util.Scanner;

public class User {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    SmartTv smartTv = new SmartTv();
    System.out.println(smartTv.ligada);

    while (!smartTv.ligada) {
      System.out.println("Deseja ligar a TV? - S/N");
      String ligarTv = scanner.next();
      if (ligarTv.equalsIgnoreCase("S")) {
        smartTv.switchLigada();
        System.out.println("TV Ligada");
      }
    }

    while (smartTv.ligada) {

      System.out.println("--------------------------");
      System.out.println("O que deseja realizar?");
      System.out.println("1 - Aumentar volume");
      System.out.println("2 - Diminuir volume");
      System.out.println("3 - Subir canal");
      System.out.println("4 - Descer canal");
      System.out.println("5 - Inserir número do canal");
      System.out.println("6 - Desligar TV");
      System.out.println("--------------------------");

      int escolhaUsuario = scanner.nextInt();

      switch (escolhaUsuario) {
        case 1:
          smartTv.aumentarVolume();
          break;

        case 2:
          smartTv.diminuirVolume();
          break;

        case 3:
          smartTv.subirCanal();
          break;

        case 4:
          smartTv.descerCanal();
          break;

        case 5:
          System.out.println("Qual canal deseja assistir?");
          int canal = scanner.nextInt();
          smartTv.mudarCanal(canal);
          break;

        case 6:
          smartTv.switchLigada();
          System.out.println("Desligando...");
          break;

        default:
          System.out.println("Opção inválida, tente novamente");
          break;
      }
    }

    scanner.close();
  }
}
