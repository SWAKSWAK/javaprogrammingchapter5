package final_exam.test1to9;
import java.util.Scanner;
abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요>>");
		double val = sc.nextDouble();
		double res = convert(val);
		
		System.out.println("변환결과 : " + res + getDestString() + "입니다.");
		sc.close();
	}
}

class Won2Dollar extends Converter {
	public Won2Dollar(int won) {
		// TODO Auto-generated constructor stub
		convert(won);
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}
	
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		
		return src/1200;
	}
	
}


class Km2Mile extends Converter {
	
	public Km2Mile (double km){
		convert(km);
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/1.6;
	}
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
}


public class ConverterTest {
	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
