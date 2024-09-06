class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        int n = nums1.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Arrays.sort(nums4);
        
        HashMap<Integer, Integer> nums3Plus4Map = new HashMap();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums3Plus4Map.put(nums3[i] + nums4[j], nums3Plus4Map.getOrDefault(nums3[i] + nums4[j], 0) + 1);
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count += nums3Plus4Map.getOrDefault(0 - (nums1[i] + nums2[j]), 0);
            }
        }
        return count;
    }
}