import java.util.Scanner;
public class Puntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("hola " + nombre);

        scanner.close();
    }

    void punto1() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa el primer texto : ");
        String texto1=scanner.nextLine();

        System.out.println("Ingresa el segundo texto : ");
        String texto2=scanner.nextLine();

        System.out.println(texto1+ " " +texto2);
        scanner.close();
    }
    void punto3() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int numero=scanner.nextInt();

        int cuadrado=numero*numero;
        System.out.println("El resultado es: "+cuadrado);

        scanner.close();
    }
    void punto4() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese el primer numero : ");
        int num1=scanner.nextInt();

        System.out.println("ingrese el segundo numero : ");
        int num2=scanner.nextInt();

        int suma=num1+num2;
        System.out.println("el resultado es: "+suma);

        scanner.close();
    }
    void punto5() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");

    }
}