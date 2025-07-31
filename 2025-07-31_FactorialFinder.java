class Solution{
    public void factorialFinder(int n){
        long fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact *= i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);
    }
}