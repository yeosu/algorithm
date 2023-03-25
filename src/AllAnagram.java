import java.util.HashMap;
import java.util.Scanner;

class AllAnagram {
    public int solution(String s1, String s2){
        int answer = 0;
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for(char x : s2.toCharArray()){
            bMap.put(x, bMap.getOrDefault(x, 0)+1);
        }
        int L = s2.length() -1;
        for (int i = 0; i < L; i++) {
            aMap.put(s1.charAt(i), aMap.getOrDefault(s1.charAt(i), 0)+1);
        }

        int lt=0;
        for (int rt = L; rt <s1.length() ; rt++) {
            aMap.put(s1.charAt(rt), aMap.getOrDefault(s1.charAt(rt), 0)+1);
            if(aMap.equals(bMap)) answer++;
            aMap.put(s1.charAt(lt), aMap.get(s1.charAt(lt))-1);
            if(aMap.get(s1.charAt(lt))==0) aMap.remove(s1.charAt(lt));
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
        AllAnagram T = new AllAnagram();
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        System.out.print(T.solution(a, b));
    }
}
