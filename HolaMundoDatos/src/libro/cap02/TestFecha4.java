package libro.cap02;
import java.util.Scanner;

public class TestFecha4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha (dd/mm/aaaa): ");
        String sFecha = scanner.next();
        Fecha f = new Fecha(sFecha);
        System.out.println("La Fecha ingresada es:"+f);
        System.out.println("Ingrese días a sumar(pueden ser negativos)");
        int diasSum = scanner.nextInt();
        f.addDias(diasSum);
        System.out.println("Sumando "+diasSum+" días, queda: "+f);
    }
}
