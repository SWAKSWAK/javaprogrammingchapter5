package final_exam.test12;

import java.util.Scanner;

public class GraphicEditor {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("그래픽 에디터 beauty를 실행 합니다.");
		Line line = null;
		Rect rect = null;
		Circle circle = null;

		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int select1 = sc.nextInt();

			switch (select1) {
				case 1 :
					System.out.print("Line(1), Rect(2), Circle(3)>>");
					int select2 = sc.nextInt();
					switch (select2) {
						case 1 :
							line = new Line();
							line.draw();
							break;
						case 2 :
							rect = new Rect();
							rect.draw();
							break;
						case 3 :
							circle = new Circle();
							circle.draw();
							break;
					}
					break;
				case 2 :
					System.out.print("삭제할 도형의 위치>>");
					select2 = sc.nextInt();
					System.out.println("삭제할 수 없습니다.");
					break;
				case 3 :
					if (line != null)
						line.draw();
					if (rect != null)
						rect.draw();
					if (circle != null)
						circle.draw();
					break;
				case 4 :
					System.out.println("beauty을 종료합니다.");
					sc.close();
					return;
			}
		}
	}
}
