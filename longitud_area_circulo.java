import java.util.Scanner;
public class longitud_area_circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radio, longitud,r;
        System.out.println("igresar el radio del cilindro r:");
        radio= input.nextFloat();
        r=(Math.PI*Math.pow(radio, 2) );
        longitud=radio*Math.PI;
        System.out.println("el radio de la circuferencia es: "+r+"cm ");
        System.out.println("la longitud de la circuferencia es: "+longitud+"cm ");

    }
}
