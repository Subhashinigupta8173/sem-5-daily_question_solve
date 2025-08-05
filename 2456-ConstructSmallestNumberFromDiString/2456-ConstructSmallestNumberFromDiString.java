// Last updated: 5/8/2025, 10:23:38 pm
class Solution {
    public String smallestNumber(String str) {
        StringBuilder s=new StringBuilder();
        int[] ans=new int[str.length()+1];
		int c=1;
		Stack<Integer> st = new Stack<>(); 
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()]=c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}
		// String s="";
		for(int v:ans) {
			s.append(v);
		}
		return s.toString();
    }
}