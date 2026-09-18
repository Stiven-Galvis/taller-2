import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa el primer texto : ");
        String texto1=scanner.nextLine();

        System.out.println("Ingresa el segundo texto : ");
        String texto2=scanner.nextLine();

        System.out.println(texto1+ " " +texto2);
        scanner.close();
    }
}
