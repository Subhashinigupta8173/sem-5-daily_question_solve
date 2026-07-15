// Last updated: 15/7/2026, 9:02:03 am
1
2
3
4class Solution {
5    public List<List<String>> groupAnagrams(String[] strs) {
6    
7    return ga(strs);
8    
9    }
10    public static List<List<String>> ga(String[] arr){
11        HashMap<String,List<String>> map=new HashMap<>();
12        for(int i=0;i<arr.length;i++){
13            String key=GetKey(arr[i]);
14            if(!map.containsKey(key)){
15                map.put(key,new ArrayList<>());
16            }
17            map.get(key).add(arr[i]);
18        }
19        List<List<String>> ll=new ArrayList<>();
20        for(String key:map.keySet()){
21            ll.add(map.get(key));
22        }
23        return ll;
24    }
25    public static String GetKey(String s){
26        int[] freq=new int[26];
27        for(int i=0;i<s.length();i++){
28            char ch=s.charAt(i);
29            freq[ch-'a']++;
30        }
31        StringBuilder sb=new StringBuilder();
32        for(int i=0;i<freq.length;i++){
33            sb.append(freq[i]+" ");
34        }
35        return sb.toString();
36    }
37}