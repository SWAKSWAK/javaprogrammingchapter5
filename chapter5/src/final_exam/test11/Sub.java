package final_exam.test11;

public class Sub extends Calc{
	@Override
	public void setValue(int a, int b) {
		super.a = a;
		super.b = b;
	}
	@Override
	public int calculate() {
		return a-b;
	}
}
