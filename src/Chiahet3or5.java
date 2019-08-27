import java.util.*;


public class Chiahet3or5 {
	public int inPut(){
		int num;
		do{
			Scanner n=new Scanner (System.in);
			num= n.nextInt();
		}while (num<0);
		return num;
	}
	public void inSoChia2Hoac5 (int a, int b)
	{
		System.out.print("Cac so tu " + a + " den " + b + "chia het cho 3 hoac 5 la " );
		for (int i=a; i<=b; i++)
		{
			if((i % 3 == 0) || (i % 5 == 0))
			{
				System.out.print(""+i);
			}
		}
	}

	public static void main(String[] args) {
		int so1, so2;
		Chiahet3or5 b1 = new Chiahet3or5();
		System.out.print("Hay nhap so 1: ");
		so1 = b1.inPut();
		System.out.print("Hay nhap so 2: ");
		so2 = b1.inPut();
		b1.inSoChia2Hoac5(so1, so2);

	}

}
