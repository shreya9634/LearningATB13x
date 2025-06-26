package ex_01_Java_Basic;

import java.util.Scanner;

public class withpara_withreturn {
    class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number 1");
            int a = 0;
            if( scanner.hasNextInt()){
                a = scanner.nextInt();
            }else{
                System.out.println("Enter only integer value!!!");
            }

            //   Scanner scanner = new Scanner(System.in);
            int b = 0;
            if( scanner.hasNextInt()){
                b = scanner.nextInt();
            }else{
                System.out.println("Enter only integer value!!!");
            }


            int result_sum = sum(a,b);
            System.out.println(result_sum);

            int result_sub = sub(a,b);
            System.out.println(result_sub);

            int result_mul = mul(a,b);
            System.out.println(result_mul);

            int result_mod = mod(a,b);
            System.out.println(result_mod);

            int result_div = div(a,b);
            System.out.println(result_div);
        }
        static int sum(int a,int b){
            return(a+b);
        }
        static int sub(int a, int b){
            return(a-b);
        }
        static int mul(int a, int b){
            return(a*b);
        }
        static int mod(int a, int b){
            return(a%b);
        }
        static int div(int a, int b){
            return(a/b);
        }
    }
}
