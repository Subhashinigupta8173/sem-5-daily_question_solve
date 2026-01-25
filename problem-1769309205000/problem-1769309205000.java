// Last updated: 25/1/2026, 8:16:45 am
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        int []rotate=nums;
4        List<Integer> list=new ArrayList<>();
5        for(int x:rotate){
6            if(x>=0){
7                list.add(x);
8            }
9        }
10        int m=list.size();
11        if(m==0) return nums;
12
13        k=k%m;
14        List<Integer> rotated=new ArrayList<>();
15        rotated.addAll(list.subList(k,m));
16        rotated.addAll(list.subList(0,k));
17
18        int idx=0;
19        for(int i=0; i<rotate.length; i++){
20            if(rotate[i]>=0){
21                rotate[i]=rotated.get(idx++);
22            }
23        }
24        return rotate;
25    }
26}