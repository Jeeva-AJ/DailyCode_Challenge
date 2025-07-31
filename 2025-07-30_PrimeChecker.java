Prime Number : A prime number can only be divided evenly (without remainder) by 1 and itself.

Program :-

class Solution{
    public boolean isPrime(int num){
        if (num <= 1) return false;
        
        for(int i = 2 ; i<=Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
}
