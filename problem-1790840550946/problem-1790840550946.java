// Last updated: 1/10/2026, 1:12:30 pm
1class Solution {
2    String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
3
4    String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", 
5                     "Seventy", "Eighty", "Ninety"};
6
7    String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
8
9    public String numberToWords(int num) {
10        if(num == 0){
11            return "Zero";
12        }
13
14        int i = 0;
15        String words = "";
16
17        while(num > 0){
18            if(num % 1000 != 0){
19                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
20            }
21
22            num /= 1000;
23            i++;
24        }
25
26        return words.trim();
27    }
28
29    public String helper(int num){
30        if(num == 0){
31            return "";
32        }
33        else if(num < 20){
34            return LESS_THAN_20[num] + " ";
35        }
36        else if(num < 100){
37            return TENS[num / 10] + " " + helper(num % 10);
38        }
39        else{
40            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
41        }
42    }
43}