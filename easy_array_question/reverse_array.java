package easy_array_question;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr={1,9,2,5,3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] a,int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    public static void reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while (start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
}
