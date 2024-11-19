import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese La primera tirada del primer jugador: ");
        int iN1 = sc.nextInt();
        System.out.println("Ingrese La segunda tirada del primer jugador: ");
        int iN2 = sc.nextInt();
        System.out.println("Ingrese La primera tirada del segundo jugador: ");
        int iN3 = sc.nextInt();
        System.out.println("Ingrese La segunda tirada del segundo jugador: ");
        int iN4 = sc.nextInt();

        int iCont1 = 0;
        int iCont2 = 0;

        if (((iN1 > 0) && (iN1 < 7))  || ((iN2 > 0) && (iN2 < 7)) || ((iN3 > 0) && (iN3 < 7)) || ((iN4 > 0) && (iN4 < 7))) {
            if (iN2 == 6 && iN1 == 6) {
                iCont1 += 2;
            } else if (iN2 == 6){
                iCont1++;
            } else if (iN1 == 6){
                iCont1++;
            }

            if (iN3 == 6 && iN4 == 6) {
                iCont2 += 2;
            } else if (iN3 == 6){
                iCont2++;
            } else if (iN4 == 6){
                iCont2++;
            }

            if (iCont1 > iCont2) {
                System.out.println("El ganador del juego es el primer jugador ya que ha sacado: " + iCont1 + " seis/es");
                System.out.println("Mientras que el jugador dos ha sacado: " + iCont2 + " seis/es");
            } else if (iCont2 > iCont1) {
                System.out.println("El ganador del juego es el segundo jugador ya que ha sacado: " + iCont2 + " seis/es");
                System.out.println("Mientras que el jugador uno ha sacado: " + iCont1 + " seis/es");
            } else if (iCont1 == iCont2) {
                if (iN1 + iN2 > iN3 + iN4) {
                    System.out.println("El ganador del juego es el primer jugador ya que ha sacado: " + (iN1+iN2) + " en la suma total");
                    System.out.println("Mientras que el jugador dos ha sacado: " + (iN3+iN4) + " En la suma total");
                } else if (iN3 + iN4 > iN1 + iN2) {
                    System.out.println("El ganador del juego es el segundo jugador ya que ha sacado: " + (iN3+iN4) + " en la suma total");
                    System.out.println("Mientras que el jugador uno ha sacado: " + (iN1+iN2) + " En la suma total");
                } else {
                    System.out.println("ha habido un empate ya que los dus jugadores han sacado: " + (iN1+iN2) + " en la suma total");
                }
            }
        } else {
            System.out.println("Alguno de los numeros introducidos no es validos");
        }

    }
}