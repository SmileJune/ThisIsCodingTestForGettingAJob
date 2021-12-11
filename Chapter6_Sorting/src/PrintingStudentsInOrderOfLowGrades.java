import java.util.*;

public class PrintingStudentsInOrderOfLowGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();


        Map<Integer, String> map = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            map.put(Integer.parseInt(input[1]), input[0]);
        }

        Object[] keyArray = map.keySet().toArray();

        Arrays.sort(keyArray);

        for(int i=0; i<n; i++){
            System.out.println(map.get(keyArray[i]));
        }


    }
}
