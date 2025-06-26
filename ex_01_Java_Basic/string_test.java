package ex_01_Java_Basic;

public class string_test {
    public static void main(String[] args) {
        String firstname = "Shreya";
        String lastname = "Verma";

        //concatenation
        String fullname = firstname +" "+ lastname;
        System.out.println(fullname);

        //Length of string
        int length = firstname.length();
        System.out.println(length);

        //substring
        String sub = fullname.substring(0,6);
        System.out.println(sub);

        //Character Extraction
        char firstChar = fullname.charAt(0);
        char lastChar = fullname.charAt(fullname.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
    }
}



