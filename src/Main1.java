import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int x= 0, y=0, z=0, s=0;
        try {
            System.out.println("Ingrese un numero");
            x = scanner.nextInt();
            System.out.println("Ingresa el numero");
            y= scanner.nextInt();
            System.out.println("Ingrese un numero");
            z= scanner.nextInt();
            System.out.println("Ingrese un numero");
            s=scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Los numeros no cumplen los parametros :" + e.toString());
        }
    }
}
