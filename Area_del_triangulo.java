import java.util.Scanner;
public class Area_del_triangulo {
 public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     float area,altura,base;
     System.out.print( "ingresar la base del triangulo: ");
     base= input.nextFloat();
     System.out.print( "ingresar la altura del triangulo: ");
     altura= input.nextFloat();
     area= (base*altura)/2;
     System.out.print( "el area del triangulo es: "+area+" cm2 ");

 }

}
