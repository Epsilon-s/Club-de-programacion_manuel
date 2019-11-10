
import java.util.Scanner;
public class Contraseña
{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int contra=1234;
    int ingreso;
    for(int i=0;i<3;i++){
        System.out.println("ingrese la contraseña");
        ingreso=sc.nextInt();
        if(ingreso!=contra){
            System.out.println("la contraseña es incorrecta, vuelve a intentarlo");
        }
        if(i==2){
            System.out.println("Has excedido el numero de intentos");
        }
        if (ingreso==contra){
            System.out.println("la contaseña es correcta, bienvenido");
            break;
        }
    } 
  }
}
