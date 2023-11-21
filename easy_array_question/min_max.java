package easy_array_question;

public class min_max {
    public static int max(int a[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length-1; i++) {
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    public static int  min(int a[]){
        int min=Integer.MAX_VALUE;

        for (int i = 0; i < a.length-1; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] a={1,2,9,7,3};
        System.out.println("min value of the array is");
        System.out.println(min(a));
        System.out.println("max value of the array is");
        System.out.println(max(a));
    }
}
