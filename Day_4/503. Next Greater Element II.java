class Solution {
    public int[] nextGreaterElements(int[] nums) {

        if(nums == null) return null;
        
        int n = nums.length;
        int[] res = new int[n];
                
        Deque<Integer> st = new ArrayDeque<>();
        for(int i = 0; i < 2 * n; i++){       
            int num = nums[i % n];
            while(!st.isEmpty() && num > nums[st.peekFirst()]){
                int ind = st.pollFirst();
                res[ind] = num;
            }
            
            if(i < n) st.offerFirst(i);
        }
        while(!st.isEmpty()){
            int ind = st.pollFirst();
            res[ind] = -1;
        }

        return res;
    }
}