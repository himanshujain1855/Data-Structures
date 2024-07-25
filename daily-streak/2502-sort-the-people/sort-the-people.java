class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (i1, i2) -> Integer.compare(heights[i2],heights[i1]));
        String[] output = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            output[i] = names[idx[i]];
        }
        return output;
    }
}