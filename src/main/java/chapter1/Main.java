package chapter1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String a = new String("a");
        String b = new String("a");
        System.out.println(a == b);

        new TestStatic();
    }
}

class TestStatic{
    static String company = "aa";

    static{
        System.out.println(company);
    }
    TestStatic(){
        System.out.println(">>>");
    }
}
