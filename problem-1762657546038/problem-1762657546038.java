// Last updated: 9/11/2025, 8:35:46 am
class Solution {
    public int minimumDistance(int[] arr) {
        
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0; i<arr.length;i++){
           map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
            }
        int minD=Integer.MAX_VALUE;
        boolean found=false;

        for(List<Integer> list:map.values()){
            if(list.size()>=3){
                for(int i=0; i<=list.size()-3; i++){
                    int a=list.get(i);
                    int c=list.get(i+2);
                    int dist=2*(c-a);
                    minD=Math.min(minD,dist);
                    found=true;
                }
            }
        }
        return found ? minD:-1 ;
        
        
    }
}