import java.util.*;

public class uno
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner (System.in);
        Double n;
        
        System.out.println("*****************************************");
        System.out.println("Introdusca un numero");
        n = sc.nextDouble();
        
        if (n>0)
        {
            System.out.println("El numero es positivo");
        }
        
        else if (n<0)
        {
            System.out.println("El numero es negativo");
        }
        if(n==0) {
        System.out.println( "El numero es cero");
        }
}
}
            
    