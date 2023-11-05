import java.util.Scanner;
public class area_cilindro {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double volumen, area,area2, radio, altura;
        System.out.println(Math.PI);
        System.out.println("igresar el radio del cilindro r:");
        radio= input.nextFloat();
        System.out.println("igresar la altura del cilindro h:");
        altura= input.nextFloat();
        area=(2*Math.PI*radio);
        area2=(area*altura+radio);
        volumen=(Math.PI*Math.pow(radio, 2)*altura);
        System.out.println("el area del cilindro es:"+area2+"cm ");
        System.out.println("el volumen del cilindro es:"+volumen+"cm ");

    }
}
