package libro.cap02;

public class TestFecha
{
    public static void main(String[] args)
    {
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        
        System.out.println("Dia="+f.getDia());
        System.out.println("Mes="+f.getMes());
        System.out.println("Anio"+f.getAnio());
        System.out.println(f);
    }
}
