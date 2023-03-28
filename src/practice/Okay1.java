package practice;

 abstract class Ok{
	private String color;
	
	public Ok(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public abstract double getArea();
	
	public void display() {
		System.out.println("Hello I am in abstract class");
	}
	
}

class Square extends Ok{
	private double side;
	
	
	public Square(String color,double side) {
		super(color);
		this.side=side;
	}

	@Override
	public double getArea() {
		return side * side;
	}
}

class Rectangles extends Ok{
	
	private double length;
	private double breadth;

	public Rectangles(String color,double length,double breadth) {
		super(color);
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public double getArea() {
		return length * breadth;
	}
	
}

public class Okay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ok o = new Square("red",20);
		Ok o1 = new Rectangles("Yellow",20,10);
		Square s = new Square(null, 0);
		s.display();
		System.out.println("Square color: "+o.getColor());
		System.out.println("Square area: "+o.getArea());
		System.out.println("Rectangle color: "+o1.getColor());
		System.out.println("Rectangle area: "+o1.getArea());

	}

	
	
}
