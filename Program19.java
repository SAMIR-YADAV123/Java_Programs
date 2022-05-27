/* Box Class with Constructor and Methods */
class Box {
	double width;
	double height;
	double depth;
	
	Box () {
		/* Example of Do Nothing Constructor */
	}
	
	/* Parameterized Constructor with this operator*/
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume() {
		return width * height * depth;
	}
}

public class Program19 {
	public static void main(String [] args) {
		Box b1 = new Box(1,2,3); 
		System.out.println("Box B1 -> Width : " + b1.width);
		System.out.println("Box B1 -> Height : " + b1.height);
		System.out.println("Box B1 -> Depth : " + b1.depth);		
		System.out.println("Box B1 -> Volume : " + b1.volume());
		System.out.println("----------------------------------");
	}
}