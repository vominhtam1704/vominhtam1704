package Bai2;
import java.util.Scanner;

import java.util.ArrayList;
public class HOCVIEN {
    public static void main(String[] args){
        ArrayList<NHANVIENQL> dsql = new ArrayList<>();
        ArrayList<NHANVIENNC> dsnc = new ArrayList<>();
        ArrayList<NHANVIENPV> dspv = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int chon;
        do{
            System.out.println("1. Nhập 1 nhân viên quản lý:");
            System.out.println("2. Nhập 1 nhân viên nghiên cứu:");
            System.out.println("3. Nhập 1 nhân viên phục vụ:");
            System.out.println("4. Xuất danh sách thông tin nhân viên quản lý.");
            System.out.println("5. Xuất danh sách thông tin nhân viên nghiên cứu.");
            System.out.println("6. Xuất danh sách thông tin nhân viên phục vụ");
            System.out.println("7. Xuất tổng lương :");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng:");
            chon =sc.nextInt();
            switch(chon)
            {
                case 1:
                {
                    NHANVIENQL nvql = new NHANVIENQL();
                    System.out.println("Hãy nhập 1 nhân viên quản lý");
                    nvql.NhapNVQL();
                    dsql.add(nvql);
                    break;
                }
                case 2:
                {
                    NHANVIENNC nvnc = new NHANVIENNC();
                    System.out.println("Hãy nhập 1 nhân viên nghiên cứu");
                    nvnc.NhapNVNC();
                    dsnc.add(nvnc);
                    break;
                }
                case 3:
                {
                    NHANVIENPV nvpv = new NHANVIENPV();
                    System.out.println("Hãy nhập 1 nhân viên phục vụ");
                    nvpv.Nhap();
                    dspv.add(nvpv);
                    break;
                }
                case 4:
                {

                    System.out.println("tNhân viên quản lý:");
                    for(NHANVIENQL nvql : dsql)
                    {
                        nvql.XuatNVQL();
                        System.out.println("\n");
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("tNhân viên nghiên cứu");
                    for(NHANVIENNC nvnc : dsnc)
                    {
                        nvnc.XuatNVNC();
                        System.out.println("\n");
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("Nhân viên phục vụ");
                    for(NHANVIENPV nvpv : dspv)
                    {
                        nvpv.Xuat();
                        System.out.println("\n");
                    }
                    break;
                }case 7:
                {

                    System.out.println("Tổng lương nhân viên");

                    double tongluongql=0,tongluongnc=0,tongluongpv=0;
                    double tongluong=0;
                    for(NHANVIENQL nvql : dsql)
                    {
                        tongluongql+=nvql.tinhluong();

                    }
                    for(NHANVIENNC nvnc : dsnc)
                    {
                        tongluongnc+=nvnc.tinhluong();
                    }
                    for(NHANVIENPV nvpv : dspv)
                     {
                        tongluongpv+=nvpv.tinhluong();
                     }
                        tongluong=tongluongql+tongluongnc+tongluongpv;
                        System.out.println("tong lương:"+tongluong);
                break;
            }
                default:
                {
                    chon = 0;
                    break;
                }
            }
        }while(chon!=0);
    }


}
