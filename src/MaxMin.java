import java.util.Scanner;


public class MaxMin {
	public int inPut(){
		int num;
		Scanner n new Scanner(System.in);
		num = n.nextInt();
		return num;
	}
	public timMax( int so1, int so2){
		return(Math.max(so1, so2));
	}
	public int timMin(int so1, int so2){
		return(Math.min(so1, so2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, min , max;
		TimSoLonNhat t1 = new TimSoLonNhat();
		System.out.print("Nhap so a:");
		a = t1.inPut();
		System.out.print("Nhap so b:");
		b = t1.inPut();
		System.out.print("Nhap so c:");
		c = t1.inPut();
		System.out.print("Nhap so d:");
		d = t1.inPut();
		max = t1.timMax(t1.timMax(a,b), t1.timMax(c,d));
		System.out.println("So lon nhat: " + max);
		min = t1.timMin(t1.timMin(a,b), t1.timMin(c,d));
		System.out.println("So lon nhat: " + min);
	}

}
