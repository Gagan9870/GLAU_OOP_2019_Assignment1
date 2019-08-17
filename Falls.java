import java.util.Scanner;
public class Falls
{
	public static void main(String[]args)
	{
		double t;
		double g = 9.8, speed , distance;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter time After it Release:");
		t = s.nextDouble();
		speed = g * t;
		distance = (g * t * t)/2;
		System.out.println("The speed of the object at "+t+" seconds after its release is "+speed +" and the distance the object has travelled in the "+t+" seconds after the release is "+distance);
	}
}