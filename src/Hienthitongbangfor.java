import java.util.Scanner;


public class Hienthitongbangfor {
	public int inPut(){
		int num;
		do{
			System.out.print("Hay nhap mot so n>0:");
			Scanner n=new Scanner(System.in);
			num = n.nextInt();
		}while(num<0);
		return num;
	}
	public int tinhTong(int so){
		int tong=0;
		for( int i=0; i<=so; i++){
			tong = tong + i;
		}
		return tong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Hienthitongbangfor f1 = new Hienthitongbangfor();
		n = f1.inPut();
		System.out.print("Tong = " + f1.tinhTong(n));
		
	}

}
