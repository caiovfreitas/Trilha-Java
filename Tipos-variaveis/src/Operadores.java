public class Operadores {

  public static void main(String[] args) {
    int numer = 0;

    while (numer++ < 10) {
      String checkPar = (numer % 2 == 0) ? "Par" : "Impar";
      System.out.println(numer + " " + checkPar);
    }
  }
}
