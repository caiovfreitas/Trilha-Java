public class User {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println(smartTv.ligada);
    // smartTv.switchLigada();
    // System.out.println(smartTv.ligada);
    smartTv.aumentarVolume();
    smartTv.switchLigada();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.diminuirVolume();
    smartTv.subirCanal();
    smartTv.subirCanal();
    smartTv.subirCanal();
    smartTv.mudarCanal(13);
    smartTv.descerCanal();
    smartTv.switchLigada();
    smartTv.subirCanal();
  }
}
