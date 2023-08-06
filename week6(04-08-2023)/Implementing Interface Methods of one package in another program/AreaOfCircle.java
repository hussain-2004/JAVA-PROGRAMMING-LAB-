import pkg.*;
/* this program implements the methods of interface in package pkg i.e Area.*/
public class AreaOfCircle implements Area{
	int radius;
	AreaOfCircle(int r){
		radius = r;
	}
	public void circleArea(){
		System.out.println("Area of circle = "+(3.14*radius*radius));
	}
	public void circlePerimeter(){
		System.out.println("Perimeter of circle = "+(2*3.14*radius));
	}
	public static void main(String args[]){
		Area a;
		AreaOfCircle ac = new AreaOfCircle(5);
		a = ac;
		a.circleArea();
		a.circlePerimeter();
	}
}


