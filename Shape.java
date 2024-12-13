package exam;
import java.util.Scanner;
 abstract public class Shape {
	
	 double h, b;
	 
	 abstract public void print_area();
	 
 }
 
 class rectangle extends Shape
 {
	 double area_rect;
	 public void print_area()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter height and breadth of rectangle");
		 h=sc.nextDouble();
		 b=sc.nextDouble();
		 
		 area_rect=h*b;
		 System.out.println("Area of rectangle" + area_rect);
				 
	 }
 }
 
 class triangle extends Shape
 {
	 double area_tri;
	 public void print_area()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ENter height and breadth for triangle");
		 h=sc.nextDouble();
		 b=sc.nextDouble();
		 
		 area_tri=0.5*h*b;
		 System.out.println("Area of trianle is " + area_tri);
		 
	 }
 }