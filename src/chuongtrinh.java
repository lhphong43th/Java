
import java.util.Scanner;
public class chuongtrinh {
	public int nhapso()
	{
		int n;
		Scanner s1 = new Scanner(System.in);
		n= s1.nextInt();
		return n;
	}
	public void kiemtrachanle(int so)
	{
		if(so%2==0)
			System.out.println(so+" la so chan ");
		else
			System.out.println(so+" la so le ");
	}
	
	public void tinhcanbat2(int  so)
	{
		double kq;
		kq = (float) Math.sqrt(so);
		System.out.println("can bat 2 cua "+ so +" la: "+ kq);
	}
	
	public void tinhluythua(int a, int b)
	{
		int kq;
		kq = (int) Math.pow(a, b);
		System.out.println("-kq "+a+" luy thua "+b+" la: "+kq);
	}
	public void timmax(int a, int b)
	{
		int kq;
		kq= (int)Math.max(a,b);
		System.out.println("-so lon nhat giua "+a+" va"+b+" la: "+kq);
	}
	
	public void timmin(int a, int b)
	{
		int kq;
		kq= (int)Math.min(a,b);
		System.out.println("-so nho nhat giua "+a+" va"+b+" la: "+kq);
	}
	
	public void phuongtrinhbatnhat(int a, int b)
	{
		double kq;
		if (a!=0)
		{
			kq=(float)-b/a;
			System.out.println("-kq "+a+"X+"+b+"="+kq);
		}
		else
			System.out.println("-nhap sai");
		
	}
	
	public void phuongtrinhbathai(int a, int b, int c)
	{
		double x1,x2,dt;
		if (a!=0)
		{
			dt =(float) b*b-4*a*c;
			if(dt<0)
			{
				System.out.println("-phuong trinh vo nghiem");
			}
			if(dt==0)
			{
				x1=x2=-b/2*a;
				System.out.println("-phuong trinh co nghiem: x1="+x1+", x2="+x2);
			}
			if(dt>0)
			{
				x1=(-b+Math.sqrt(dt)/2*a);
				x2=(-b+Math.sqrt(dt)/2*a);
				System.out.println("-phuong trinh co nghiem: x1="+x1+", x2="+x2);
			}
			
		}
		else
			System.out.println("-nhap sai");
		
	}

	public static void main(String[] args) {
		int cle,cb2,soa,sob,s1,s2,so1,so2,a,b,A,B,C;
		chuongtrinh s= new chuongtrinh();
		
		System.out.print("-Nhap so kiem tra chan le: ");
		cle =  s.nhapso();
		s.kiemtrachanle(cle);
		
		System.out.print("-Nhap so tinh can bat 2: ");
		cb2 = s.nhapso();
		s.tinhcanbat2(cb2);
		
		System.out.print("-Nhap luy thua : ");
		soa=s.nhapso();
		System.out.print("cua : ");
		sob=s.nhapso();
		s.tinhluythua(soa, sob);
		
		System.out.println("---Nhap tim so lon nhat--- ");
		System.out.print("-nhap so thu nhat : ");
		s1=s.nhapso();
		System.out.print("-nhap so thu hai : ");
		s2=s.nhapso();
		s.timmax(s1, s2);
		
		System.out.println("---Nhap tim so nho nhat--- ");
		System.out.print("-nhap so thu nhat : ");
		so1=s.nhapso();
		System.out.print("-nhap so thu hai : ");
		so2=s.nhapso();
		s.timmin(so1, so2);
		
		System.out.println("---phuong trinh bat nhat--- ");
		System.out.print("-nhap so a : ");
		a=s.nhapso();
		System.out.print("-nhap so b : ");
		b=s.nhapso();
		s.phuongtrinhbatnhat(a, b);
		
		System.out.println("---phuong trinh bat hai--- ");
		System.out.print("-nhap so a : ");
		A=s.nhapso();
		System.out.print("-nhap so b : ");
		B=s.nhapso();
		System.out.print("-nhap so c : ");
		C=s.nhapso();
		s.phuongtrinhbathai(A, B, C);
	}

}
