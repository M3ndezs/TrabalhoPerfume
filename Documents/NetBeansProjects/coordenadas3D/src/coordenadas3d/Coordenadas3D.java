
package coordenadas3d;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Coordenadas3D {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal= new DecimalFormat("0.00");
        double x1, y1, z1, x2, z2, y2,distancia;
        System.out.println("insira coordenada");
        x1= ler.nextDouble();
        System.out.println("insira coorenada");
        y1=ler.nextDouble();
        System.out.println("insira coornada");
        z1= ler.nextDouble();
        System.out.println("insira coordenada");
        x2=ler.nextDouble();
        System.out.println("insira coordenada");
        y2= ler.nextDouble();
        z2=ler.nextDouble();
        
        
        
        
        
        
        
        
        distancia= Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2) + Math.pow(z2-z1,2));
        System.out.println("distancia:" +decimal.format(y2));
        
        
    }
    
}
