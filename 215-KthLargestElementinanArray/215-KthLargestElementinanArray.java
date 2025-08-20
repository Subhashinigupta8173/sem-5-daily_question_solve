// Last updated: 20/8/2025, 12:31:24 pm
class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
        return pq.peek();
  
    }
}