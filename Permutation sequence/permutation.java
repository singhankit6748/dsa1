import java.util.ArrayList;
import java.util.List;

public class permutation {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;
        }

        k--; 
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            fact /= i;
            int index = k / fact;
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= fact;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        permutation solution = new permutation();

        System.out.println(solution.getPermutation(3, 3)); 
        System.out.println(solution.getPermutation(4, 9)); 
        System.out.println(solution.getPermutation(3, 1)); 
    }
}
