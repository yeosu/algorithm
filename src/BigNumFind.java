import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class BigNumFind {
    public int solution(int[] arr, int n, int m){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                for (int k = j+1; k < n; k++) {
                    Tset.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int cnt = 0;

        for(int x : Tset){
            cnt++;
            if(cnt==m) return x;
        }

        return answer;
    }

    public static void main(String[] args){
        BigNumFind T = new BigNumFind();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(arr, n, m));
    }
}
