// Last updated: 29/3/2026, 8:23:25 am
1class EventManager {
2    private Map<Integer,Integer> eventMap;
3    private PriorityQueue<int[]>pq;
4    private int [][] denqoravil;;
5    
6
7    public EventManager(int[][] events) {
8        denqoravil=events;
9        eventMap=new HashMap<>();
10        pq=new PriorityQueue<>((a,b)->{
11            if(a[0]!=b[0]) return b[0]-a[0];
12            return a[1]-b[1];
13        });
14        for(int []e:events){
15            int id=e[0],pr=e[1];
16            eventMap.put(id,pr);
17            pq.offer(new int[]{pr,id});
18        }
19        
20        
21    }
22    
23    public void updatePriority(int eventId, int newPriority) {
24        eventMap.put(eventId,newPriority);
25        pq.offer(new int[]{newPriority,eventId});
26        
27    }
28    
29    public int pollHighest() {
30        while(!pq.isEmpty()){
31            int[] top=pq.poll();
32            int pr=top[0],id=top[1];
33            if(eventMap.containsKey(id) && eventMap.get(id)==pr){
34                eventMap.remove(id);
35                return id;
36            }
37        }
38        return -1;
39    }
40}
41
42/**
43 * Your EventManager object will be instantiated and called as such:
44 * EventManager obj = new EventManager(events);
45 * obj.updatePriority(eventId,newPriority);
46 * int param_2 = obj.pollHighest();
47 */