package intro;

import java.util.Arrays;

class Library{
    public static String lib_name = "My_Library";

    String b_name ="book1";

    String author ="Author1";


}
public class MyClass {


    public static void main(String[] args){
//        System.out.println("Welcome to Java class");
//        System.out.println(8);
//        float f = 0.123f;
//        System.out.println(f);
//        int i = 4567;
//        System.out.println(i);
//        double d = 5.2356d;
//        System.out.println(d);

    Library lib1 = new Library();
        System.out.println(Library.lib_name);
        System.out.println(lib1.b_name);
        System.out.println(lib1.author);


    }
}
