package Recursion;
import java.util.*;
public class IsLinearSreach {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,9,9};
//        System.out.println(LinearSrc(arr,0,8));
//        FindAllIndex(arr,0,9);
//        System.out.println(list);
        System.out.println(FindAllIndexUsingArrayList(arr,0,9,list));
    }
    public static int LinearSrc(int[] arr,int index, int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return LinearSrc(arr,index+1,target);
    }
    static  ArrayList<Integer> list= new ArrayList<>();
    static void FindAllIndex(int[] arr,int index, int target){
        if(index== arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        FindAllIndex(arr,index+1,target);
    }
    static ArrayList<Integer> FindAllIndexUsingArrayList(int[] arr,int index, int target, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return FindAllIndexUsingArrayList(arr,index+1,target,list);
    }
}
