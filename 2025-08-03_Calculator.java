class Solution {
    public int calc(int a , int b , int choice){
        switch(choice){
            case 1:{
                return a + b;
            }
            case 2:{
                return a - b;
            }
            case 3:{
                return a * b;
            }
            case 4:{
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return -999; 
                }
            }
            default:{
                return -1;
            }
        }
    }
}