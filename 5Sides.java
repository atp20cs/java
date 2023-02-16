abstract class Shape
{
	public abstract void numberofsides();
}

class Rectangle extends Shape
{
	public void numberofsides()
	{
	 System.out.println("numberofsides of Reacangle =4");
	}
}


 class Triangle extends Shape
{
          public void numberofsides()
	{
	  System.out.println("numberofsides of triangle=3");
	}
}


class Hexagon extends Shape
{
 	public void numberofsides()
	{ 
	 System.out.println("number of sides of hexagon =6");
	}
}
 class Test
{
  	public static void main (String args[])
    {
 	Rectangle r = new Rectangle();
 	Triangle t = new Triangle();
 	Hexagon h = new Hexagon();
	r.numberofsides();
	t.numberofsides ();		
	h.numberofsides();
     }
}
