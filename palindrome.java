//LEETCODE EASY 9. Palindrome Number
public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1231));
    }

    public static boolean isPalindrome(int x){
        int num = x;
        int reverse = 0;

        while(x > 0){
            int lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            x = x/10;
        }

        if(num == reverse){
            return true;
        }else{
            return false;
        }
    }
}
