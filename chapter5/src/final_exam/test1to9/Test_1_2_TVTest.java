package final_exam.test1to9;
class TV{
	private int size;
	public TV(int size) { 
		this.size  = size; 
	}
	protected int  getSize() {
		return size;
	}
}




class ColorTV extends TV {
	private int color;
	
	public ColorTV(int size, int color) {
		super (size);
		this.color = color;
		
	}
	public int getColor() {
		return color;
	}
	public void printPorperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}



class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	@Override
	public void printPorperty() {
		// TODO Auto-generated method stub
		System.out.print("나의 IPTV는 " + ip + "주소의 ");
		super.printPorperty();
	}
}



public class Test_1_2_TVTest {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printPorperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printPorperty();
	}
}
