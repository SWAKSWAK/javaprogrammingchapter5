package final_exam.test11;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Calc c;
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.print("두 정수와 연산자를 입력하세요 (종료는 \"0 0 종료\")>>");
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			String str = sc.next();
			switch (str) {
				case "+" :
					c = new Add();
					c.setValue(a, b);
					System.out.println(c.calculate());
					break;
				case "-" :
					c = new Sub();
					c.setValue(a, b);
					System.out.println(c.calculate());
					break;
				case "*" :
					c = new Mul();
					c.setValue(a, b);
					System.out.println(c.calculate());
					break;
				case "/" :
					c = new Div();
					c.setValue(a, b);
					System.out.println(c.calculate());
					break;
				case "종료" :
					System.out.println("종료합니다.");
					sc.close();
					return;
			}
		}
	}
}
