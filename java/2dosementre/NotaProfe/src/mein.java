
import java.util.Scanner;

public class mein {
    
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
       alumno datos=new alumno();
        System.out.println("el nombre del alumno");
        datos.setNeim(in.next());
        System.out.println("Nombre del profesor");
        datos.setProfe(in.next());
        System.out.println("nota del alumno");
        datos.setNota(in.nextInt());
        
        datos.mo();
        datos.lanota();
    }
}
