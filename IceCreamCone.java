
public class IceCreamCone 
{
	private double height,radius;
	
	public IceCreamCone(double a_radius, double a_height)
	{
		height = a_height;
		radius = a_radius;
	}
	
	public double getSurfaceArea()
	{
		double slant_height = Math.sqrt(Math.pow(radius, 2)+ Math.pow(height, 2));
		
		//SA without base
		double SA = Math.PI*radius*slant_height;
		
		return SA;
		
	}
	
	public double getVolume()
	{
		double volume = 1/3*Math.PI*Math.pow(radius, 2)*height;
		return volume;
	}
	
	public static void main(String args[])
	{
		IceCreamCone x = new IceCreamCone(5,10);
		System.out.println(x.getSurfaceArea());
	}
}
