package Strings;

public class JoyString {
       public static void main (String[]args) {
           Joystring("My name is xyz",'y','o');
           Joystring("My name is xyz");
           Joystring("My name is xyz","My name is abc");
       }
       public static void Joystring(String s,char ch1,char ch2) {
         s=s.replace(ch1,ch2);
         System.out.println(s);
       }
       public static void Joystring(String s) {
        int indSpace=s.indexOf(' ');
        int lastIndSpace=s.lastIndexOf(' ');
        System.out.println(indSpace);
        System.out.println(lastIndSpace);
      }
      public static void Joystring(String s1,String s2) {
        String newSTR=s1.concat(" "+s2);
        System.out.println(newSTR);
      }

}

