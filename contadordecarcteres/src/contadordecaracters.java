/*trabajo realizado por Jonathan Blanco para la asignacion
de Programacion en le trayecto 2-3 en la UNERMB
*/
import java.util.Scanner;
public class contadordecaracters {
    
    public static void main (String[] args) {
        
                // Mensage de bienvenida 
                System.out.println("------------------------------------------------");
                System.out.println("Bienvenido a mi Programa para contar caracteres.");
                System.out.println("-----------------------------------------------\n");
    
        Scanner lector=new Scanner (System.in);
        //variables
        String cadena= "";
        char [] Arraycadena ;
        char caracter ;
        int contador =0;
        
        //se le pide que usuario coloque una palabra
        System.out.println("Escribe una palabra: ") ;
        
        while(lector.hasNextLine()){
    cadena = lector.nextLine();
        
        //aqui leera la cantidad de caracteres que tendra el arreglo
        Arraycadena = cadena.toCharArray ();
        for (int x=0; x< Arraycadena.length; x++){
         
         caracter = Arraycadena [x];
         for (int z = 0; z < Arraycadena.length; z++){
             if (Arraycadena[z] == caracter) {
                 contador++;
             }
         }
         //se mostrara y la cuenta de los caracteres
         System.out.println(Arraycadena[x]+" se repite "+ contador+" veces");
         contador = 0;
        }
        System.out.println("escribe otra palabra");
    }
  }
}