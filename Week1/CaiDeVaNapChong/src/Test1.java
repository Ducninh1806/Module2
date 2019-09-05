public class Test1 {
    public static void main(String[] args) {
        A a= new A();
        a.p(10);
        a.p(10.0);
    }
}
class A extends B{

    super
}
class B{
    private void p(double number){
        System.out.println(number*2);
    }
}