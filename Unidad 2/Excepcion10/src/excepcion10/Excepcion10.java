
package excepcion10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excepcion10 {

    
    public static void main(String[] args) {
        
       BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("archivo.txt")); // Intentamos abrir un archivo para lectura

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Se produjo una IOException: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
                e.printStackTrace();
            }
        } 
    }
    
}
