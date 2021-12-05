package BTTH_CoBan_3_2_1;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String diaChi;
    protected String namSinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, String namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh?p thông tin:");
        System.out.printf("Nh?p h? tên: ");
        String hoten = scanner.nextLine();
        setHoTen(hoten);
        System.out.printf("Nh?p n?m sinh: ");
        String namsinh = scanner.nextLine();
        setNamSinh(namsinh);
        System.out.printf("Nh?p ??a ch?: ");
        String diachi = scanner.nextLine();
        setDiaChi(diachi);
    }

    public void inTT() {
        System.out.println("Thông tin: ");
        System.out.println("H? tên: " + getHoTen());
        System.out.println("N?m sinh: " + getNamSinh());
        System.out.println("??a ch?: " + getDiaChi());
        System.out.println();
    }
}