import java.util.*;


public class SoHoanHao {
	public int inPut(){
		int num;
		do{
			Scanner n=new Scanner (System.in);
			num= n.nextInt();
		}while (num<0);
		return num;
	}
	public boolean kiemTraSHH(int so1)
	{
		int tong=0;
		for(int i=1; i<so1; i++)
		{
			if(so1 % i == 0)
			{
				tong = tong + i;
			}
		}
		if(tong == so1)
			return true;
		else
			return false;
	}
	public void inSHHNhoHonN( int n)
	{
		System.out.print("Cac so hoan hao < " + n + " la ");
		for(int i = 1; i<n; i++)
		{
			if(kiemTraSHH(i) == true)
			{
				System.out.print(""+i);
			}
		}
	}

	public static void main(String[] args) {
		SoHoanHao b2 = new SoHoanHao();
		int n;
		System.out.print("Nhap so n= ");
		n = b2.inPut();
		b2.inSHHNhoHonN(n);

	}

}
