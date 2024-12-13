package exam;

public class Complex 
{
	int real;
	int imaginary;
	
	public Complex()
	{
		real=0;
		imaginary=0;
	}
	
	public Complex(int real, int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	Complex addComplex(Complex c1, Complex c2)
	{
		Complex temp=new Complex();
		temp.real=c1.real+c2.real;
		temp.imaginary=c1.imaginary+c2.imaginary;
		return temp;
	}
	Complex subComplex(Complex c1, Complex c2)
	{
		Complex temp=new Complex();
		temp.real=c1.real-c2.real;
		temp.imaginary=c1.imaginary-c2.imaginary;
		return temp;
	}
	Complex mulComplex(Complex c1, Complex c2)
	{
		Complex temp=new Complex();
		temp.real=(c1.real*c2.real)-(c1.imaginary*c2.imaginary);
		temp.imaginary=(c1.real*c2.imaginary)+(c1.imaginary*c2.real);
		return temp;
	}
	Complex divComplex(Complex c1, Complex c2)
	{
		Complex temp=new Complex();
		temp.real=((c1.real*c2.real)+(c1.imaginary*c2.imaginary))/((c2.real*c2.real)+(c2.imaginary*c2.imaginary));
		temp.imaginary=((c1.real*c2.real)-(c1.imaginary*c2.imaginary))/((c2.real*c2.real)+(c2.imaginary*c2.imaginary));
		return temp;
	}

	public void printComplex()
	{
		System.out.println("Complex number :" +real+ "+" + imaginary + "i");
	}
	
	public static void main(String args[])
	{
		Complex c1=new Complex(7, 4);
		Complex c2=new Complex(2, 8);
		Complex c3=new Complex();
		
		System.out.println("Complex no 1 is");
		c1.printComplex();
		
		System.out.println("Complex no 2 is ");
		c2.printComplex();
		
		System.out.println("Addition:");
		c3=c3.addComplex(c1, c2);
		c3.printComplex();
		
		System.out.println("multiplication:");
		c3=c3.mulComplex(c1, c2);
		c3.printComplex();
		
		System.out.println("Subtraction:");
		c3=c3.subComplex(c1, c2);
		c3.printComplex();
		
		System.out.println("Division:");
		c3=c3.divComplex(c1, c2);
		c3.printComplex();
		
	}
	
	
}