Given an integer x, return true if x is a palindrome, and false otherwise.

Program :-

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reversed = "";
        for(int i = str.length() - 1;i >= 0; i-- ){
            reversed += str.charAt(i); 
        }
        if (str.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }
}

Errors I got :-
    I Forget to initialize variable(reversed) so i got an compile time error. if we tried append a value to a variable which is not initialized 
    it will show up with error , unless the variable is defined as static
