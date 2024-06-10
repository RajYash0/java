package String;

//take a string and print only a part of it.

public class subString {
    public static void main(String[] args) {
        String sentence = "My name is Yash";
        //.substring()
        String name = sentence.substring(11,sentence.length());
        //or
        //String name = sentence.substring(11);
        System.out.println(name);
    }
}
