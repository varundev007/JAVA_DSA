package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _6_Reverse_the_string {

    //How to Reverse string

    public static void main(String[] args) {
        String str = "java";
      //  method1(str);
        method2(str);
    }
    public static void method1(String str){
        StringBuffer sb = new StringBuffer(str);
        sb=sb.reverse();
        System.out.println(sb);
    }

    public static void method2(String  str){
      String res="";
      for (int i = str.length()-1; i>=0 ; i--){
          res= res + str.charAt(i);
      }
        System.out.println(res);

    }
}
