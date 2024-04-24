import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,3,1};
        findDuplicates(arr);
    }

    public static void findDuplicates(int [] arr){

        HashSet<Integer> set = new HashSet<>();

        for (int j : arr) {
            if (!set.add(j)) {
                System.out.println(j + " is a duplicate");
            }
        }

    }
}