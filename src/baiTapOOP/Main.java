package baiTapOOP;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		hcn.setChieuDai(sc.nextDouble());
		System.out.println("Nhap chieu rong: ");
		hcn.setChieuRong(sc.nextDouble());
		
		System.out.println("Dien tich HCN la: " + hcn.tinhDienTich());
		System.out.println("Chu vi HCN la: " + hcn.tinhChuVi());
//		
		
	}

}
