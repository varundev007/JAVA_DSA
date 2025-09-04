package GreedysAlgo;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxActivities {
    public static void main(String[] args) {
        /*int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};//end time sorted
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Maximum activity ="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }*/
        // IF END IS NOT SORTED4
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        //sorting
        int activites[][]=new int[start.length][3];
        for(int i=0;i< start.length;i++){
            activites[i][0]=i;//indexxx
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();
        maxAct=1;
        ans.add(activites[0][0]);

        int lastEnd=activites[0][2];
        for(int i=1;i<start.length;i++){
            if(activites[i][1]>=lastEnd){
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd=activites[i][2];
            }
        }
        System.out.println("Maximum activity ="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }
    }
}
