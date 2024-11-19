import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int iN1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int iN2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int iN3 = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        int iN4 = sc.nextInt();

        if (iN1<iN2) {
            System.out.println("El segundo numero es mayor que el primer numero");
        } else if (iN1>iN2) {
            System.out.println("El segundo numero es menor que el primer numero");
        } else if (iN1==iN2) {
            System.out.println("El segundo numero y el primero son iguales");
        } else {
            System.out.println("Algo anda mal");
        }

        if (iN2<iN3) {
            System.out.println("El tercer numero es mayor que el segundo numero");
        } else if (iN2>iN3) {
            System.out.println("El tercer numero es menor que el segundo numero");
        } else if (iN2==iN3) {
            System.out.println("El tercer numero y el segundo son iguales");
        } else {
            System.out.println("Algo anda mal");
        }

        if (iN3<iN4) {
            System.out.println("El cuarto numero es mayor que el tercer numero");
        } else if (iN3>iN4) {
            System.out.println("El cuarto numero es menor que el tercer numero");
        } else if (iN3==iN4) {
            System.out.println("El cuarto numero y el tercero son iguales");
        } else {
            System.out.println("Algo anda mal");
        }

        if (iN1<=iN2 && iN2<=iN3 && iN3<=iN4) {
            System.out.println("Los numeros estan ordenados de forma ascendente");
        } else {
            System.out.println("Los numeros no estan ordenados de forma ascendente");
        }
    }
}