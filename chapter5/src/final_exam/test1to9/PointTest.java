package final_exam.test1to9;
class Point {
	private int x,y ;
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	String color;
	
	public ColorPoint() {
		super (0,0);
		color = "BLACK";
		// TODO Auto-generated constructor stub
	}
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY (int x, int y) {
		move(x, y);
	}
	public void setColor(String colr) {
		this.color = colr;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + "색의 (" + getX() + "," + getY() + ")" + "의 점";
	}
}

class Point3D extends Point{
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	
	protected void move(int x, int y, int z) {
		// TODO Auto-generated method stub
		super.move(x, y);
		this.z = z;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + "," + z + ")의 점입니다.";
	}
	
}
class PositivePoint extends Point {
	public PositivePoint() {
		super(0, 0);
		// TODO Auto-generated constructor stub
	}
	public PositivePoint (int x, int y) {
		super(x, y);
		if (x <= 0 && y <= 0) {
			move(0, 0);
		}
	}
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if ( x >= 0 && y >= 0)
			super.move(x, y);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ")의 점입니다.";
	}
}
public class PointTest {
	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str + "입니다.");
		
		
		ColorPoint zp  = new ColorPoint();
		System.out.println(zp.toString());
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString());
		
		p.moveUp();
		System.out.println(p.toString());
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString());
		
		p.move(100, 200, 300);
		System.out.println(p.toString());
		
		PositivePoint po = new PositivePoint();
		po.move(10, 10);
		System.out.println(po.toString());
		
		po.move(-5, 10);
		System.out.println(po.toString());
		
		PositivePoint po2 = new PositivePoint(-10, -10);
		System.out.println(po2.toString());
	}
}
