package libro.cap01;
import java.util.Scanner;

public class PrimerosNumeros1
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        //leo el valor de n
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n)
        {
            //muestro el valor de i
            System.out.println(i);
            
            //incremento el valor de i
            i++;
        }
    }
}
