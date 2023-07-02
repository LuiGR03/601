
package excepcion9;


public class Excepcion9 {

   
    public static void main(String[] args) {
       
        int numerador = 2;
        Integer denominador = null;
        double resultado;
        
        
        try{
            resultado = numerador/denominador; 
            System.out.println(" El resultado es: "+resultado);
        }catch(NullPointerException e){
            System.out.println("No se ha indicado el valor de la variable");
            e.printStackTrace();
        }finally{
            System.out.println("Programa terminado");
        }
        
    }
    
}
