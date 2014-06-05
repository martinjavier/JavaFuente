package libro.cap01;
import java.util.Scanner;

public class ParOImpar
{
    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese un valor: ");

        int v = scanner.nextInt();
    
        //obtener el resto de dividir v por 2
        int resto = v % 2;
    
        // Para preguntar por igual utilizaremos ==
        if (resto == 0)
        {
            System.out.println(v+" es Par");
        }
        else
        {
            System.out.println(v+" es Impar");
        }   
        
        //Utilizando un if in-line
        String mssg = (resto == 0) ? "es Par": "es Impar";
        
        //Muestro el resultado
        System.out.println(mssg);
    }    
}
