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
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return false;
		}
	}
}
public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int stackLength = sc.nextInt();
		StringStack ss = new StringStack(stackLength);
		while (true) {
			System.out.print("문자열 입력>>");
			String a = sc.next();
			
			if (a.equals("그만")){
				for (int i = 0 ; i < stackLength ; i++) 
					System.out.print(ss.pop() + " ");
				sc.close();
				return;
			}
			ss.push(a);
		}
	}
}
