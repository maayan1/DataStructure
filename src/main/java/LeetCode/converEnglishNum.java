package LeetCode;

/** The numberToWords method takes in an integer num and
returns its English words representation as a string.
 The method uses a helper method helper to convert each
 block of three digits into English words. The THOUSANDS
 array holds the names of the thousands, millions, billions, etc.
 The LESS_THAN_TWENTY array holds the names of the numbers less than twenty.
 The TENS array holds the names of the tens.

 */public class converEnglishNum {
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    private final String[] LESS_THAN_TWENTY = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        int i = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }

        return words.trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return LESS_THAN_TWENTY[num] + " ";
        } else if (num < 100) {
            return TENS[num/10] + " " + helper(num % 10);
        } else {
            return LESS_THAN_TWENTY[num/100] + " Hundred " + helper(num % 100);
        }
    }


    public static void main(String[] args) {
        converEnglishNum converEnglishNum = new converEnglishNum();
        System.out.println(converEnglishNum.numberToWords(125));

        converEnglishNum converEnglishNum1 = new converEnglishNum();
        System.out.println(converEnglishNum1.numberToWords(9));

        converEnglishNum converEnglishNum2 = new converEnglishNum();
        System.out.println(converEnglishNum2.numberToWords(56));
    }

}
