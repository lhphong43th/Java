
import java.util.Scanner;


public class TinhDienTichHCN {
	
	public float nhapSo() 
	{
		float n;
		Scanner s1 = new Scanner(System.in);
		n = s1.nextFloat();
		return n;
	}
	public float tinhDienTich(float d,float r) 
	{
		float DT;
		DT = d * r;
		return DT;
	}

	public static void main(String[] args) {
		
		float dai, rong, dientich;
		TinhDienTichHCN HCN1 = new TinhDienTichHCN();
		System.out.print("-Nhap chieu dai : ");
		dai = HCN1.nhapSo();
		System.out.print("-Nhap chieu rong : ");
		rong = HCN1.nhapSo();
		dientich = HCN1.tinhDienTich(dai,rong);
		System.out.println("-Dien tinh la : "+ dientich);
	}

}
