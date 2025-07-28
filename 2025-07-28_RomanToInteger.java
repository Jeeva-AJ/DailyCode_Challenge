Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Program :-

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int Prev_value = 0;
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            int value = 0;

            if(c == 'I') value = 1;
            else if (c=='V') value = 5;
            else if (c=='X') value = 10;
            else if (c=='L') value = 50;
            else if (c=='C') value = 100;
            else if (c=='D') value = 500;
            else if (c=='M') value = 1000;

            if(value < Prev_value){
                total -= value;
            }else{
                total += value;
            }

            Prev_value = value;
        }
        return total;
    }
}