package GreedysAlgo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
//ALgorith:
//Given: chocolate given hai aur cost to cut it vertically and horizontally given hai. Min cost me chocolate ka cubes krna h.
//Solution; Jo mehnga h usko pehle cut kr lo kyuki baad me piece badh jayega aur cost bhi.
//     Sort krlo pehle decending order me

public class ChocolateCuts {
    public static void main(String[] args) {
        int n=4, m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int hp=1, vp=1;
        int h=0,v=0;
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<= costHor[h]){
                cost = cost + costHor[h] * vp;
                hp++;
                h++;
            }
            else{
                cost=cost+ costVer[v] * hp;
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost = cost + costHor[h] * vp;
            hp++;
            h++;}

            while(v<costVer.length){
                cost=cost+ costVer[v] * hp;
                vp++;
                v++;
            }
            System.out.println("Min cost of cuts= "+cost);
        }


    }

