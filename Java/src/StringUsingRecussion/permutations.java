package StringUsingRecussion;

public class permutations {
    public static void main(String[] args) {
        String str="abcd";
        permutation("", str);
    }
    public static void permutation(String p, String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f=p.substring(0,i); //first string
            String l=p.substring(i,p.length());//Second string
            permutation(f+ch+l, up.substring(1));
        }
    }
}
