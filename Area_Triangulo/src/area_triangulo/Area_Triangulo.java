
package area_triangulo;

import java.util.Scanner;


public class Area_Triangulo {

  
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        Double base; 
        Double altura; 
        
        Double area; 
        
        System.out.println("Ingrese la base");
        base = s.nextDouble();
        
        System.out.println("Ingrese la altura");
        altura = s.nextDouble(); 
        
        area = (base*altura)/2; 
        
        System.out.println("El área del triangulo es: "+area);

    }
    
}
