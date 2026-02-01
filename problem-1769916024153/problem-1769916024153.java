// Last updated: 1/2/2026, 8:50:24 am
1import java.util.*;
2
3class RideSharingSystem {
4
5    Queue<Integer> riders;
6    Queue<Integer> drivers;
7    Set<Integer> activeRiders;
8
9    public RideSharingSystem() {
10        riders = new LinkedList<>();
11        drivers = new LinkedList<>();
12        activeRiders = new HashSet<>();
13    }
14    
15    public void addRider(int riderId) {
16        riders.offer(riderId);
17        activeRiders.add(riderId);
18    }
19    
20    public void addDriver(int driverId) {
21        drivers.offer(driverId);
22    }
23    
24    public int[] matchDriverWithRider() {
25
26        // required variable to store input midway
27        List<Integer> rimovexalu = new ArrayList<>();
28        rimovexalu.addAll(riders);
29        rimovexalu.addAll(drivers);
30
31        // remove cancelled riders from front
32        while (!riders.isEmpty() && !activeRiders.contains(riders.peek())) {
33            riders.poll();
34        }
35
36        if (riders.isEmpty() || drivers.isEmpty()) {
37            return new int[]{-1, -1};
38        }
39
40        int riderId = riders.poll();
41        int driverId = drivers.poll();
42
43        activeRiders.remove(riderId);
44
45        return new int[]{driverId, riderId};
46    }
47    
48    public void cancelRider(int riderId) {
49        activeRiders.remove(riderId);
50    }
51}
52
53
54/**
55 * Your RideSharingSystem object will be instantiated and called as such:
56 * RideSharingSystem obj = new RideSharingSystem();
57 * obj.addRider(riderId);
58 * obj.addDriver(driverId);
59 * int[] param_3 = obj.matchDriverWithRider();
60 * obj.cancelRider(riderId);
61 */