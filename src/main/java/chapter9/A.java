package chapter9;

public class A{
    private int a = 1;
    class B{
        int field1 = 1;

        //static int field2 = 2;

        B(){
            a = 2;
        }
    }

    void useB(){
        B b = new B();
    }
}
