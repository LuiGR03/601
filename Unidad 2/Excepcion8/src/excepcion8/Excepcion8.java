
package excepcion8;


public class Excepcion8 {

    
    public static void main(String[] args) {
        
        String className = "com.example.MyClass"; // Nombre de la clase que intentaremos cargar

        try {
            Class<?> clazz = Class.forName(className); // Intentamos cargar la clase
            System.out.println("Clase cargada exitosamente: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo encontrar la clase: " + e.getMessage());
            e.printStackTrace();
        }
    }
    }
    
