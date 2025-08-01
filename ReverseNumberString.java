public class ReverseNumberString {
    public static void main(String[] args) {
        int num = 1234;
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        int reversedNum = Integer.parseInt(reversedStr);
        System.out.println("Original Number = " + num);
        System.out.println("Reversed Number = " + reversedNum);
    }
}