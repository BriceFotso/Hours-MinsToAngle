

public class Times {
	
	public static double GetAngle(int heure, int minute)
	{
		// un cycle d'horloge etant egale a 360 degre
		
	  double UneMinuteAngle = (360 /60);
	  double UneHeureAngle = (360 /12);
	
	  double heureAngle = UneHeureAngle * heure;
	  double minuteAngle = UneMinuteAngle * minute;
	
	  return (Math.abs(heureAngle - minuteAngle));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		a=GetAngle(12,00);
		System.out.println("l'angle entre les aiguilles est : "+a+"°");
	}
}
		