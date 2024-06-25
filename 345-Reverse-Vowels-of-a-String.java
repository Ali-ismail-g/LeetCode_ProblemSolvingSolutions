class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int start_ptr = 0;
        int end_ptr = n-1;
        char[] ch_arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(start_ptr < end_ptr){
            while(start_ptr < end_ptr && vowels.indexOf(ch_arr[start_ptr]) == -1){
                start_ptr++;
            }
            while(start_ptr < end_ptr && vowels.indexOf(ch_arr[end_ptr]) == -1){
                end_ptr--;
            }
            char temp = ch_arr[start_ptr];
            ch_arr[start_ptr] = ch_arr[end_ptr];
            ch_arr[end_ptr] = temp;
            start_ptr++;
            end_ptr--;
        }
        String str_ans = new String(ch_arr);
        return str_ans;
    }
}