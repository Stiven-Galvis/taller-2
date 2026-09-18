import java.util.Scanner;
public class suma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese el primer numero : ");
        int num1=scanner.nextInt();

        System.out.println("ingrese el segundo numero : ");
        int num2=scanner.nextInt();

        int suma=num1+num2;
        System.out.println("el resultado es: "+suma);

        scanner.close();
    }
}
