package StringUsingRecussion;
//To find total combinaton to get sum as 4
public class Dice {
    public static void main(String[] args) {
        comb("",4);

    }
    public static void comb(String p, int target){
        if(target==0){
            System.out.println(p);
        }
        for(int i=1;i<=6 && i<=target;i++){
            comb(p+i,target-i);
        }
    }
}
