import java.util.Scanner;
public class lado_de_cuadrado {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double lado, resultado, resultado2;
        System.out.println("igresar el lado del cuadrado:");
        lado= input.nextFloat();
        resultado=(4*lado);
        resultado2=(lado*lado);
        System.out.print( "el perimetro del cuadrado es:"+resultado+" cm2 ");
        System.out.print( "el area del cuadrado es:"+resultado2+" cm2 ");

    }
}
