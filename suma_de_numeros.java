import java.util.Scanner;
public class suma_de_numeros {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float number1,number2,resultado;
        System.out.print( "ingresar el primer numero:");
        number1= input.nextFloat();
        System.out.print( "ingresar del segundo numero:");
        number2= input.nextFloat();
        resultado= (number1+number2);
        System.out.print( "su resultado es: "+resultado+"cm ");

    }

}
