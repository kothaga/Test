import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input the lattitude of coordinate 1: ");
		double lat1=input.nextDouble();
		System.out.print("Input the Longitude of coordinate 1: ");
		double lon1=input.nextDouble();
		System.out.print("Input the lattitude of coordinate 2: ");
		double lat2=input.nextDouble();
		System.out.print("Input the longitude of coordinate 2: "); 
		double lon2=input.nextDouble();
		System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1,lon1,lat2,lon2)+ "km\n");

	}
			//points will be converted to radiants before calculations
	public static double
	distance_Between_LatLong(double lat1,double lon1,double lat2,double lon2)
	{ 
			lat1=Math.toRadians(lat1);
			lon1=Math.toRadians(lon1);
			lat2=Math.toRadians(lat2);
			lon1=Math.toRadians(lon1);
			double earthRadius=6371.01;
			return earthRadius*Math.acos(Math.sin(lat1)*Math.sin(lat2)+Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1-lon2));
	}

			
	}

