// Last updated: 5/8/2025, 10:23:31 pm
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {

                
                int startLand = landStartTime[i];
                int finishLand = startLand + landDuration[i];
                int startWaterAfterLand = Math.max(finishLand, waterStartTime[j]);
                int finishWater = startWaterAfterLand + waterDuration[j];
                minFinishTime = Math.min(minFinishTime, finishWater);

                
                int startWater = waterStartTime[j];
                int finishWaterFirst = startWater + waterDuration[j];
                int startLandAfterWater = Math.max(finishWaterFirst, landStartTime[i]);
                int finishLandSecond = startLandAfterWater + landDuration[i];
                minFinishTime = Math.min(minFinishTime, finishLandSecond);
            }
        }

        return minFinishTime;
    }
}
