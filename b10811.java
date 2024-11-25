import java.util.Scanner;
import java.util.Arrays;

public class b10811{
        public static void revers1(int[] arr, int start, int end) {
            while(start < end){
                int temp = arr[start-1];
                arr[start-1] = arr[end-1];
                arr[end-1] = temp;
                start++;
                end--;
            }   
        }
    
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();   //바구니 수
    int M = sc.nextInt();   //M번 바구니를 역순으로 
    int[] arr = new int[N];

    for(int x = 0; x<N; x++){
        arr[x] = x+1;
    }
    int i = 0;
    int j = 0;

    for(int y=0; y<M; y++){
    i = sc.nextInt();
    j = sc.nextInt();
    revers1(arr, i, j);
    }
    for(int z = 0; z<N; z++){
        System.out.print(arr[z]+" ");
    }
    }
}
