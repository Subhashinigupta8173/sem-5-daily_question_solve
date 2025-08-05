// Last updated: 5/8/2025, 10:24:10 pm
class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] leftForces = new int[n];
        int[] rightForces = new int[n];
        int force = 0;

        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R') {
                force = n; 
            } else if (dominoes.charAt(i) == 'L') {
                force = 0; 
            } else {
                force = Math.max(force - 1, 0); 
            }
            rightForces[i] = force;
        }

        force = 0;

     
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                force = n; 
            } else if (dominoes.charAt(i) == 'R') {
                force = 0; 
            } else {
                force = Math.max(force - 1, 0); 
            }
            leftForces[i] = force;
        }

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (leftForces[i] == rightForces[i]) {
                result.append('.'); 
            } else if (leftForces[i] > rightForces[i]) {
                result.append('L'); 
            } else {
                result.append('R'); 
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

       
        String dominoes = scanner.nextLine();

        Solution solution = new Solution();
        String result = solution.pushDominoes(dominoes);

        System.out.println( result);
    }
}
