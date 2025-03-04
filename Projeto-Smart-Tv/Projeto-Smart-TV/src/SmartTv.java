public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void switchLigada() {
        ligada = !ligada;
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("A TV Precisa estar ligada para realizar esta ação");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("A TV Precisa estar ligada para realizar esta ação");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("A TV Precisa estar ligada para realizar esta ação");
        }
    }

    public void subirCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("A TV Precisa estar ligada para realizar esta ação");
        }
    }

    public void descerCanal() {
        if (ligada) {
            canal--;
            System.out.println("Canal: " + canal);
        } else {
            System.out.println("A TV Precisa estar ligada para realizar esta ação");
        }
    }

}
