
package excepcion11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepcion11 {

   
    public static void main(String[] args) {
        
        try {
            File file = new File("TRANSACCION.txt"); // Intentamos abrir un archivo que no existe
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    
    }
    
}
