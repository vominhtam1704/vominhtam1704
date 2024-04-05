
package Bai2;

import java.util.Scanner;

public class NHANVIENNC extends NHANVIEN{
    private String chuyenmon;
    private double phucapdh;
    
    public NHANVIENNC(){
        phucapdh=0;
    }
    
    @Override
    double tinhluong(){
        return luongcb+phucapdh;
    }
    
    public void NhapNVNC(){
        super.Nhap();
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenmon=sc.nextLine();
        System.out.print("Nhap phu cap CV: ");
        phucapdh=sc.nextDouble();
    }
    public void XuatNVNC(){
        super.Xuat();
        System.out.println("Chuyen mon: "+chuyenmon);
        System.out.println("phu cap doc hai: "+phucapdh);

    }
}
