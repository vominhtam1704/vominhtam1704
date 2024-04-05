
package Bai2;

import java.util.Scanner;

public abstract class NHANVIEN {
    protected  String id;
    protected String ten;
    protected  String trinhdo;
    protected  double luongcb;
    
    abstract double tinhluong();
    
    public  void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id=sc.nextLine();
        System.out.print("Nhap ten: ");
        ten=sc.nextLine();
        System.out.print("Nhap trinh do: ");
        trinhdo=sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongcb=sc.nextDouble();
    }
    
    public void Xuat(){
        System.out.println("ma nhan vien: " +id);
        System.out.println("ten nhan vien: " +ten);
        System.out.println("trinh do nhan vien: " +trinhdo);
        System.out.println("Luong: " +tinhluong());
    }
}
