package test_p11;

public class Sample4_4 
{
	RacingCar rccar1;
	rccar1 = new RacingCar();
	
	rccar1.setCar(1234,20.5);
	rccar1.setCourse(5);
	
	rccar1.show();

}

class Car
{
	protected int num;
	protected double gas;
	
	public Car() 
	{
		num = 0;
		gas = 0.0;
		System.out.println("產生了車子");
		
	}
	public void setCar(int n,double g)
	{
		num = 0;
		gas = g;
		
		System.out.println("將車號設為"+num+"，汽油量設為");
	}
}