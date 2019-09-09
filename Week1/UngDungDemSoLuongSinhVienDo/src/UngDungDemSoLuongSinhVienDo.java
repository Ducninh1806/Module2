import java.util.Arrays;
import java.util.Random;

public class UngDungDemSoLuongSinhVienDo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] diemthi= new int[25];
        String[] hocsinh = {"Quang", "Hung", "Chau", "Lam", "Trung", "An", "Phuong", "Huyen", "Linh", "Ngoc", "Tuan", "Hue", "Long", "Trong", "Minh", "Trang", "Ngan", "Binh", "Son", "Loan", "Luc" , "Tung", "Tan", "Giang", "Nhung"};
        int count=0;

        Arrays.sort(hocsinh);
        System.out.println("Học Sinh: "+Arrays.toString(hocsinh));

        for (int i = 0; i <diemthi.length; i++) {
            diemthi[i]= random.nextInt(10);
        }
        System.out.println("Điểm thi: "+ Arrays.toString(diemthi));

        for (int i = 0; i <diemthi.length ; i++) {
            if (diemthi[i]<5){
                continue;
            }
            System.out.println("Học sinh "+ hocsinh[i] + " Có số điểm : "+ diemthi[i]+ " Đã đỗ");
            count++;
        }
        System.out.println("Tổng số học sinh qua môn là: "+ count);
    }
}
