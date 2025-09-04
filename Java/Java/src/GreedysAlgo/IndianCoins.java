package GreedysAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoins {
    public static void main(String[] args) {
        int coin[]={1,2,5,10,20,50,100,500,1000,2000};
        int count=0;
        int amt=515;
        Arrays.sort(coin);
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=coin.length-1;i>=0;i--){
            while (amt >= coin[i]){
                ans.add(coin[i]);
                count++;
                amt=amt-coin[i];
            }
        }
        System.out.println(count);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
