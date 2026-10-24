// Last updated: 24/10/2026, 5:07:58 pm
1class Solution {
2    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
3        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
4
5        String start = arriveAlice.compareTo(arriveBob) > 0 ? arriveAlice : arriveBob;
6        String end = leaveAlice.compareTo(leaveBob) < 0 ? leaveAlice : leaveBob;
7
8        if (end.compareTo(start) < 0) {
9            return 0;
10        }
11
12        int sm = Integer.parseInt(start.substring(0, 2));
13        int em = Integer.parseInt(end.substring(0, 2));
14        int sd = Integer.parseInt(start.substring(3, 5));
15        int ed = Integer.parseInt(end.substring(3, 5));
16
17        int d = 0;
18        for (int i = sm - 1; i < em; i++) {
19            d += days[i];
20        }
21
22        return d - (sd - 1) - (days[em - 1] - ed);
23    }
24}