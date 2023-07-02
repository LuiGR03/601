
package excepcion6;


public class Excepcion6 {

   static String mensajes[] = {"Primero", "Segundo", "Tercero" };
   
    public static void main(String[] args) {
        
        try {

      for (int i=0; i<=3; i++){
         System.out.println(mensajes[i]);
    }

    }

    catch ( ArrayIndexOutOfBoundsException e ) {
      System.out.println("El asunto se nos ha desbordado");
    }

    finally {
      System.out.println("Ha finalizado la ejecución");

    }
    }
    }
    

