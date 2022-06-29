
import java.util.Scanner;

public class Time {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int heure;
		int minute;
		
		//recuperation de l'heure
		
		System.out.println("Entrez l'heure :" );
		Scanner h=new Scanner(System.in);
		heure = h.nextInt();
		
		//recuperation de la minute
		
		System.out.println("Entrez l'heure :" );
		Scanner m=new Scanner(System.in);
		minute = h.nextInt();
		
		
		if(heure>=0 && heure<=12){

	        if(minute>=0 && minute<=59){
	            double hDegre = (heure * 30) + (minute * 0.5); //car L'aiguille des heures se déplace à la vitesse de 0.5 degrés par minute
	                    double mDegre = minute * 6;			// car L'aiguille des minutes se déplace à la vitesse de 6 degrés par minute
	                    double deg  = Math.abs(hDegre - mDegre); //on recupere la valeur absolue de cette difference

	                    System.out.println("l'angle entre les aiguilles est : "+deg+"°");
	                    
	                if (deg > 180){ 

	                deg = 360 - deg;
	        System.out.println("l'angle entre les aiguilles est : "+deg+"°");
	                }
	                
	        }       

		}
	        
	}
}

