import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần quy đổi:");
        int sotien= input.nextInt();
        int giatien =23000;
        int VND = sotien*giatien;
        System.out.println("Tổng số tiền VND sau khi quy đổi là: "+ VND);

    }

}
