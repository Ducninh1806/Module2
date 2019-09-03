public class Hello {
    public static void main(String[] args) {
        System.out.println("Java");
        method (9);
    }

    public static void method (int x){
        int  y=5;
        if (x>y){
            int z=x+y;
            System.out.print(z);
        }
    }
}
