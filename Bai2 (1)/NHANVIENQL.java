
package Bai2;

import java.util.Scanner;

public class NHANVIENQL extends NHANVIEN{
    private String chuyenmon;
    private double phucapcv;
    
    public NHANVIENQL(){
        phucapcv=0;
    }
    
    @Override
    double tinhluong(){
        return luongcb+phucapcv;
    }
    
    public void NhapNVQL(){
        super.Nhap();
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenmon=sc.nextLine();
        System.out.print("Nhap phu cap CV: ");
        phucapcv=sc.nextDouble();
    }
    
    public void XuatNVQL(){
        super.Xuat();
        System.out.println("Chuyen mon: "+chuyenmon);
        System.out.println("phu cap cv: "+phucapcv);

    }
}
