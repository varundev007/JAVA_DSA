package GreedysAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLenOfPairChain {
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair, Comparator.comparingDouble(o->o[1]));
        int chainLen=1;
        int lastEnd=pair[0][1];
        for(int i=1;i<pair.length;i++){
            if(pair[i][0]>lastEnd) {
                chainLen++;
                lastEnd = pair[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
