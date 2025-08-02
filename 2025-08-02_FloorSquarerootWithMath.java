class Solution {
    public int squareRootFloor(int n){
        return (int) Math.floor(Math.sqrt(n));
    }
    public static void main(String args []){
        Solution sol = new Solution ();
        int n = 10;
        int result = sol.squareRootFloor(n);
        System.out.println("The floor of the square root of " + n + " is: " + result);
    }
}
