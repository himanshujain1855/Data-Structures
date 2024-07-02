class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer, Integer> map = new HashMap();

        for (int j : nums1) {
            int value=map.getOrDefault(j,-1);
            if (value!=-1) {
                map.put(j, value+1);
            } else {
                map.put(j, 1);
            }
        }

        List<Integer> ansList = new ArrayList();
        for (int j : nums2) {
            int value=map.getOrDefault(j,-1);
            if (value > 0) {
                ansList.add(j);
                map.put(j, value - 1);
            }

        }
        int ansSize=ansList.size();
        int[] ans = new int[ansSize];
        for (int i = 0; i < ansSize; i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}