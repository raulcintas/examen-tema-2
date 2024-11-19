import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el pedido: ");
        int iPedido = sc.nextInt();


        if (iPedido > 0 && iPedido < 1000) {
            int iPostre = iPedido % 10;
            int iSegunndo = iPedido % 100 / 10;
            int iPrimero = iPedido % 1000 / 100;

            if ((iPrimero == 1 || iPrimero == 2 || iPrimero == 4 || iPrimero == 5 || iPrimero == 6 || iPrimero == 7 || iPrimero == 8 || iPrimero == 9) && (iSegunndo == 2 || iSegunndo == 5 || iSegunndo == 6 || iSegunndo == 7 || iSegunndo == 8 || iSegunndo == 9) && (iPostre == 2 || iPostre == 4 || iPostre == 6 || iPostre == 8)) {
                System.out.println("El pedido es: " + iPrimero + " de primer plato, " + iSegunndo + " de segundo plato y " + iPostre + (" de postre"));
            } else {
                System.out.println("El pedido no es valido, se ha pedido algun plato o postre no existente");
            }









        } else {
            System.out.println("No es una comanda valida");
        }






    }
}