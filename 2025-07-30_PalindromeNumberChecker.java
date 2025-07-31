Write a Java program to check whether a given integer is a palindrome or not.

Program :-

class Solution{
    public void isPalindrome (int n){
        String num = Integer.toString(n);
        String reversed = new StringBuilder(num).reverse().toString();
        if(num.equals(reversed)){
            System.out.println("The Given Number is Palindrome");
        }else{
            System.out.println("The Given Number is Not Palindrome");
        }
    }
}
