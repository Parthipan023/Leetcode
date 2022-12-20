class Solution {
        public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer ,Integer> map = new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i : nums)
        {
            while(!st.isEmpty() && st.peek()<i)
            {
                map.put(st.pop(),i);
            }
            st.push(i);
        }
        for (int i = 0; i < findNums.length; i++)
                findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
        }
}
