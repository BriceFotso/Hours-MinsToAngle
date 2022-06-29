
import java.io.*;
import java.util.Scanner;
 
class Angle
{
    // Fonction qui calcule l'angle
    static double calcAngle(double h, double m)
    {
        // verifions les entree
        if (h <0 || m < 0 || h >12 || m > 60)
            System.out.println("mauvaise entree");
 
        if (h == 12)
            h = 0;
             if (m == 60)
		       {
		        m = 0;
		        h += 1;
		        if(h>12)
		          h = h-12;
		        }
 
 
        // Calculons l'angle des heures et de minutes en prenant comme reference 12h00
        double heureAngle = (0.5 * (h*60 + m));
        double minuteAngle = (6*m);
 
        double angle = Math.abs(heureAngle - minuteAngle);
 
        // on prend le petit entre les 2
       // angle = Math.min(360-angle, angle);
 
        return angle;
    }
     
    
    public static void main (String[] args)
    {
        
        double heure;
		double minute;
		double angle;
		
		//recuperation de l'heure
		
		System.out.println("Entrez l'heure :" );
		Scanner h=new Scanner(System.in);
		heure = h.nextInt();
		
		//recuperation de la minute
		
		System.out.println("Entrez l'heure :" );
		Scanner m=new Scanner(System.in);
		minute = m.nextInt();
		
		angle = calcAngle(heure, minute);
		System.out.println("l'angle est :"+angle+"°");
    }
}
 
