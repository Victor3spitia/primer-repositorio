import java.util.Scanner;
public class promedio_de_tres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1,numero2,numero3,resultado;
        System.out.println("igresar el primer numero:");
        numero1= input.nextFloat();
        System.out.println("igresar el segundo numero:");
        numero2= input.nextFloat();
        System.out.println("igresar el tercer numero:");
        numero3= input.nextFloat();
        resultado=(numero1+numero2+numero3/3);
        System.out.println("el promedio es: "+resultado+" ");

    }
}
