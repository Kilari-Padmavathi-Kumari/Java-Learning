public class ReverseVow {

    public static String reverseVowels(String str) {
        char[] ch = str.toCharArray();      //String are immutable so we can change the String to character and swap change the alp
        int left = 0;                       // starting index
        int right = ch.length - 1;          //last index-1   using arrys(by strings )

        String vow = "aeiou"; 

        while (left < right) {

            while ( vow.indexOf(ch[left]) == -1)                        // vow found print 
            {
                left++;
            }

           
            while (vow.indexOf(ch[right]) == -1) 
            {
                right--;
            }

            
            if (left < right) {
                char temp = ch[left];           //vowels found swap
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str= "hello eworld";
        System.out.println(reverseVowels(str));
    }
}