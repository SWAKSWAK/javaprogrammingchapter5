package final_exam.test10;

import java.util.Arrays;

public class PairMapTest {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ����" + dic.get("���繮"));
		System.out.println("Ȳ������ ����" + dic.get("Ȳ����"));
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		System.out.println(Arrays.toString(dic.keyArray));
		System.out.println(Arrays.toString(dic.valueArray));
	}	
}

