import java.util.Scanner;

class SumNaturalNumber2 {
    public int solution(int n){
        int answer = 0;
        int cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n -= cnt;
            if(n%cnt==0) answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        SumNaturalNumber2 T = new SumNaturalNumber2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));
    }
}
