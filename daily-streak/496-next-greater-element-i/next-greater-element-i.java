class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] nextGreaterElements=new int[l2];
        Stack<Integer> mono=new Stack();
        nextGreaterElements[l2-1]=-1;
        mono.push(nums2[l2-1]);

        for(int i=l2-2; i>=0; i--){
            while(!mono.isEmpty() && mono.peek() <= nums2[i]){
                mono.pop();
            } 

            if(mono.isEmpty()) nextGreaterElements[i]=-1;
            else nextGreaterElements[i]=mono.peek();
            mono.push(nums2[i]);
        }

    
        for(int i=0;i<l1;i++){
           int index=search(nums2,nums1[i]);
           if(index!=-1){
             nums1[i]=nextGreaterElements[index];
           }
        }


        return nums1;
    }

    public static int search(int[] arr,int key){
        int l=arr.length;

        for(int i=0;i<l;i++){
           if(arr[i]==key) return i;   
        }

        return -1;       
    }
}