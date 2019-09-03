public class TinhBinhPhuong {
    static int sum=0;
    static int num=10;
    public static void BinhPhuong(){
        sum=num*num;
        System.out.println("Bình Phương của"+" "+ num+" là: "+sum);
    }

    public static void lapphuong(){
        sum = sum*sum*sum;
        System.out.println("Lập Phương của "+ num+ " là: "+ sum);
    }

    public static void main(String[] args) {
        TinhBinhPhuong Bp = new TinhBinhPhuong();
        Bp.BinhPhuong();
        TinhBinhPhuong lp = new TinhBinhPhuong();
        lp.lapphuong();

    }
}
