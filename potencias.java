import java.util.Scanner;
public class potencias {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double numero;
        System.out.println("igresar el numero:");
        numero= input.nextFloat();
        double cuadrado= Math.pow(numero, 2);
        System.out.println("el resultado es: " + cuadrado);
    }
}
