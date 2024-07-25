class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx=new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            idx[i]=i;
        }
        Arrays.sort(idx, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if(heights[i1] < heights[i2]) return 1;
                else if (heights[i1] > heights[i2]) return -1;
                return 0;
            }
        });
        String[] output=new String[names.length];
        for (int i = 0; i < names.length; i++) {
            output[i]=names[idx[i]];
        }
        return output;
    }
}