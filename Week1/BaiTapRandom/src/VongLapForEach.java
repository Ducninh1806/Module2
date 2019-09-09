public class VongLapForEach {
    public static void main(String[] args) {
        String name = "Nam Hung Viet Quyen Tuan Thien Ngoc Minh Uy";
        String[] names = name.split(" ");

        for (String x:names) {
            System.out.println("name: "+ x);
        }

//        for (String mName: names){
//            System.out.println("name : "+ mName);
//        }
    }
}
