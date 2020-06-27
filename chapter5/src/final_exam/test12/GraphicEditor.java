package final_exam.test12;

import java.util.Scanner;

public class GraphicEditor {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("�׷��� ������ beauty�� ���� �մϴ�.");
		Line line = null;
		Rect rect = null;
		Circle circle = null;

		while (true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
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
					System.out.print("������ ������ ��ġ>>");
					select2 = sc.nextInt();
					System.out.println("������ �� �����ϴ�.");
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
					System.out.println("beauty�� �����մϴ�.");
					sc.close();
					return;
			}
		}
	}
}
