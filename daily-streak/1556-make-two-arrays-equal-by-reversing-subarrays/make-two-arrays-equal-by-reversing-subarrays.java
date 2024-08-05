class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        int len=arr.length;

        for(int i=0;i<len;i++){
            if(arr[i]!=target[i]) return false;
        }

        return true;
    }
}