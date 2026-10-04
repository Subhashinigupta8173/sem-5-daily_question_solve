// Last updated: 4/10/2026, 4:03:53 pm
1class Solution {
2    Map<List<Integer>, Integer> memo = new HashMap<>();
3
4    public int shoppingOffers(List<Integer> price,
5                              List<List<Integer>> special,
6                              List<Integer> needs) {
7
8        if (memo.containsKey(needs)) {
9            return memo.get(needs);
10        }
11
12        // Buy everything normally
13        int minCost = 0;
14
15        for (int i = 0; i < needs.size(); i++) {
16            minCost += needs.get(i) * price.get(i);
17        }
18
19        // Try every special offer
20        for (List<Integer> offer : special) {
21
22            boolean canUse = true;
23            List<Integer> newNeeds = new ArrayList<>();
24
25            for (int i = 0; i < needs.size(); i++) {
26
27                // Offer asks for more items than we need
28                if (offer.get(i) > needs.get(i)) {
29                    canUse = false;
30                    break;
31                }
32
33                newNeeds.add(needs.get(i) - offer.get(i));
34            }
35
36            
37            if (canUse) {
38                int offerCost = offer.get(needs.size());
39
40                int totalCost = offerCost
41                        + shoppingOffers(price, special, newNeeds);
42
43                minCost = Math.min(minCost, totalCost);
44            }
45        }
46
47        memo.put(needs, minCost);
48
49        return minCost;
50    }
51}