public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int count=0;
        for (int i=2;i<100;i++){
            if (i%2==0&& i>2 || i%3==0&&i>3 ||i%5==0&& i>5|| i%7==0&& i>7){
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
