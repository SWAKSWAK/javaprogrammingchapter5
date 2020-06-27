package final_exam.test13;

public class Oval implements Shape{
	private int a;
	private int b;
	public Oval(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void draw() {
		System.out.println(a + "x" + b + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		double area = PI * a * b ;
		area = Double.parseDouble(String.format("%.2f", area));
		return area;
	}
	
}
