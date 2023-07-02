
package excepcion7;

import java.util.Vector;

public class Excepcion7 {

   
    public static void main(String[] args) {
        
        Vector v =new Vector();
        int i=10;
        Object obj = v.add(i);
        try{
            String y = (String)obj;
            v.add(y);
        }catch(ClassCastException e){
            System.out.println("La clase a la que pertenece: " + obj.getClass().getName());
            e.printStackTrace();
        }
        
    }
    }
    
