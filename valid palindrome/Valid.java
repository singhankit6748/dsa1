public class Valid {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Valid solution = new Valid();
        
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(solution.isPalindrome("race a car")); 
        System.out.println(solution.isPalindrome(" ")); 
    }
}
