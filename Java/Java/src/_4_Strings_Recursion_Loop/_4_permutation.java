package _4_Strings_Recursion_Loop;

public class _4_permutation {
    public static void main(String[] args) {
        String s= "abc";
        //permutetn("", s);
        int ans= permutatonCountM1("", s,0);
        System.out.println(permutatonCountM2("",s));
        System.out.println(ans);
    }

    public static void permutetn(String p , String up){
      if (up.isEmpty()){
          System.out.println(p);
          return;
      }
      for (int i = 0; i <= p.length() ; i++){
          String f= p.substring(0, i);
          String s= p.substring(i, p.length());
          char ch = up.charAt(0);
          permutetn(f + ch + s , up.substring(1));
      }
    }

    public static int permutatonCountM1(String p, String up, int count){
        if (up.isEmpty()){
            return count+1;
        }
        for (int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            char ch = up.charAt(0);
            count = permutatonCountM1(f+ch+s, up.substring(1),count);
        }
        return count;
    }
    public static int permutatonCountM2(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int count =0;
        for (int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            char ch = up.charAt(0);
            count = count + permutatonCountM2(f+ch+s, up.substring(1));
        }
        return count;
    }
}
