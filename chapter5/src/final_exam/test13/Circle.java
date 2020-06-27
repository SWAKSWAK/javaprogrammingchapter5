package final_exam.test13;

public class Circle implements Shape {
	private int radius; 
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.printf("반지름이 %d인 원입니다.\n",this.radius);
	}
	@Override
	public double getArea() {
		double area = radius*radius*PI;
		area = Double.parseDouble(String.format("%.2f", area));
		return area;
	}

}
