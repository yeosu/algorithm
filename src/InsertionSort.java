import java.util.Scanner;

class InsertionSort {
    public int[] solution(int n, int[] arr){
        for(int i=1;i<n;i++){
            int tmp = arr[i], j;
            for (j =i-1; j >=0; j--) {
                if(arr[j]>tmp) arr[j+1]=arr[j];
                else break;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }

    public static void main(String[] args){
        InsertionSort T = new InsertionSort();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for(int x : T.solution(n, arr)) System.out.print(x+" ");
    }
}
