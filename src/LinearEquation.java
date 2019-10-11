
public class LinearEquation {
	
	//double data fields a-f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//constructor that takes a value for variables a-f
	public LinearEquation (double a,double b,double c,double d,double e,double f)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=d;
		this.f=f;
	}
	
	//getter methods that return a variable
	public double getA(){return a;}
	public double getB(){return b;}
	public double getC(){return c;}
	public double getD(){return d;}
	public double getE(){return e;}
	public double getF(){return f;}
	
	//is solvable method that determines if the equations can be solved
	public boolean isSolvable() 
	{boolean r=true; 
	if((a*d)-(b*c) ==0){r=false;}
	return r;}
	
	//a method that returns the value of x
	public double getX()
	{double x=0; 
	double temp1; 
	double temp2;
	temp1 = (e*d)-(b*f);
	temp2 =(a*d)-(b*c);
	x= temp1/temp2;
	return x;
	}
	
	//a method that returns the value of y
	public double getY()
	{double y=0; 
	double temp1; 
	double temp2;
	temp1 = (a*f)-(e*c);
	temp2 =(a*d)-(b*c);
	y= temp1/temp2;
	return y;
	}
}
