package final_exam.test1to9;

import java.util.Scanner;

class StringStack implements Stack {
	private String[] stack;
	private int count=0;
	private int stackLength;
	
	public StringStack (int stackLength) {
		this.stackLength = stackLength;
		stack = new String[stackLength];
	}
	
	@Override
	public int length() {
		return count;
	}
	@Override
	public int capacity() {
		return stack.length-count;
	}
	@Override
	public String pop() {
		count--;
		return stack[count];
	}
	@Override
	public boolean push(String val) {
		if (count < stackLength) {
		stack[count] = val;
		count++;
		return true;
		}else {
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			return false;
		}
	}
}
public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է�>>");
		int stackLength = sc.nextInt();
		StringStack ss = new StringStack(stackLength);
		while (true) {
			System.out.print("���ڿ� �Է�>>");
			String a = sc.next();
			
			if (a.equals("�׸�")){
				for (int i = 0 ; i < stackLength ; i++) 
					System.out.print(ss.pop() + " ");
				sc.close();
				return;
			}
			ss.push(a);
		}
	}
}
