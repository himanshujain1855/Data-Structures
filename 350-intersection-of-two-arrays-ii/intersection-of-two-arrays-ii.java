class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer, Integer> map = new HashMap();

        List<Integer> ansList = new ArrayList();
        for (int j : nums1) {

            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                ansList.add(j);
                map.put(j, map.get(j) - 1);
            }

        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }

        return ans;
    }
}