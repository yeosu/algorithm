import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

class EmergencyRoom {
    public int solution(int n, int k, int[] arr){
        int answer=0;
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==k) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        EmergencyRoom T = new EmergencyRoom();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
       System.out.print(T.solution(n, k, arr));
    }
}
