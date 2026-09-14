// Last updated: 14/9/2026, 2:11:01 pm
1class Solution { 
2    public int maxScoreWords(String[] words, char[] letters, int[] score) { 
3        int n = words.length; 
4        int[] result = new int[n]; 
5         
6        for(int i = 0 ;i < n;i++){ 
7            int sum = 0; 
8            for(char ch : words[i].toCharArray()){ 
9                sum += score[ch - 'a']; 
10            } 
11            result[i] = sum; 
12        } 
13 
14        HashMap<Character,Integer> map = new HashMap<>(); // freq 
15        for (int i = 0; i < letters.length; i++) { 
16            map.put(letters[i], map.getOrDefault(letters[i], 0) + 1); 
17        } 
18 
19        return Result(words,0,map,result,0); 
20         
21    } 
22
23    public static int Result(String[] words,int i,HashMap<Character,Integer> freq,int[] res,int currentSum){ 
24
25        if(i >= words.length) return currentSum; 
26 
27        int leave = Result(words,i+1,freq,res,currentSum); 
28 
29        String word = words[i]; 
30        boolean canTake = true; 
31        HashMap<Character, Integer> freq2 = new HashMap<>(); 
32
33        for(int j = 0; j < word.length(); j++) 
34            freq2.put(word.charAt(j),freq2.getOrDefault(word.charAt(j),0) + 1); 
35         
36        for(char ch: freq2.keySet()){ 
37            int required = freq2.get(ch); 
38            int available = freq.getOrDefault(ch,0); 
39
40            if(required > available){ 
41                canTake  = false; 
42                break; 
43            } 
44        } 
45
46        int take = 0;
47
48        if(canTake){ 
49            for(char ch : freq2.keySet()){ 
50                freq.put(ch, freq.get(ch) - freq2.get(ch)); 
51            } 
52 
53            take = Result(words,i+1,freq,res,currentSum + res[i]); 
54
55            //undo
56            for (char ch : freq2.keySet()) { 
57                freq.put(ch, freq.get(ch) + freq2.get(ch)); 
58            } 
59        } 
60 
61        return Math.max(leave,take); 
62    } 
63
64    /** 
65    int leave = value1;
66    take if possible:
67        modify variables
68        then int take = value2
69        undo variables
70    return Math.max(leave,take)
71    */ 
72}