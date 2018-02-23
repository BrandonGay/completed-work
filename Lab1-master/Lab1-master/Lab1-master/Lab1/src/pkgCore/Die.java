package pkgCore;

public class Die 
{

	private int DieValue;

	public Die() 
	{

		DieValue=(int)((Math.random()*6 )+ 1 ); 
		
	}

	public int getDieValue() 
	{
		System.out.println(DieValue);
		return DieValue;
	}
}
