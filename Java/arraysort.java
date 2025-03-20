import java.util.*;
class arraysort{
    public static void main(String args[]){
        int size;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int l = 0, r = 1;
            while(r<size){
                if(arr[l] > arr[r]){
                    int temp;
                    temp = arr[l];
                    arr[l] =arr[r];
                    arr[r] = temp;
                }
                l++;
                r++;
            }
            size--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}