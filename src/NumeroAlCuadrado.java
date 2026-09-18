import java.util.Scanner;
public class NumeroAlCuadrado {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero=scanner.nextInt();

        int cuadrado=numero*numero;
        System.out.println("El resultado es: "+cuadrado);

        scanner.close();
    }
}
