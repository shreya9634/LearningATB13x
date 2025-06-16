package ex_01_Java_Basic;

public class Lab0004_Increment1 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);
    }
}
