import java.util.Scanner;
public class conversion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double euros, resultado;
        System.out.println("igresar la cantidad de euros:");
        euros= input.nextFloat();
        resultado= (euros/0.631);
        System.out.println("la cantidad en dolares es:"+resultado+" USD");
    }
}
