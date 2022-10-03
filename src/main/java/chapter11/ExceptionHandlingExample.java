package chapter11;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String [] array = {"100", "1oo"};

        for(int i = 0 ; i<= array.length;i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println(String.format("array[ %d ]", value));
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨: "+ e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("숫자로 변환할 수 없음" + e.getMessage());
            }
        }
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    public void method1(){
        try{
            method2();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public void method2() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
