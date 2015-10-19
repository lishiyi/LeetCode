Merge Sorted Array 
My Submissions Question Solution 
Total Accepted: 71975 Total Submissions: 246949 Difficulty: Easy
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) 
to hold additional elements from nums2. The number of elements initialized in nums1 
and nums2 are m and n respectively.


public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
        	return;
        }

        int p1 = m - 1;
        int p2 = n - 1;

        for(int i = m + n - 1; i >= 0; i--){

        	if(p1 < 0 || p2 < 0) break;
        	if(nums1[p1] > nums2[p2]){
        		nums1[i] = nums1[p1];
        		p1--;
        	}
        	else{
        		nums1[i] = nums2[p2];
        		p2--;
        	}
        	
        }

        if(p1 < 0){
        	while(p2 >= 0){
        		nums1[p2] = nums2[p2];
        		p2--;
        	}
        }
    }
}
