package _7_leetcode_Top150_Problem;

public class _13_interger_to_roman {
    public static void main(String[] args) {
        String notation[]={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int value[] ={1000, 900, 500, 400,100, 90, 50, 40 , 10, 9 , 5,4,1};
        String ans = integerToRoman(notation, value , 486);
        System.out.println(ans);
    }
    public static String integerToRoman(String notation[], int value[], int num){
        String roman= "";
        for(int i =0 ; num>0; i++){
            while (num>= value[i]){
                roman = roman + notation[i];
                num = num - value[i];
            }
        }
        return roman;
    }
}
