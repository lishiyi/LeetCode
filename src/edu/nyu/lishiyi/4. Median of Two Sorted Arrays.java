4. Median of Two Sorted Arrays 
My Submissions Question
Total Accepted: 86563 Total Submissions: 473106 Difficulty: Hard
There are two sorted arrays nums1 and nums2 of size m and n respectively. 
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	int sum = nums1.length + nums2.length;    
    	if( sum % 2 == 1){
    		return findKth(nums1, 0, nums2, 0, sum / 2 + 1);
    	}
    	else {
    		return ( findKth(nums1, 0, nums2, 0, sum / 2) + findKth(nums1, 0, nums2, 0, sum / 2 + 1) ) / 2.0;
    	}

    }

    private int findKth(int[] A, int Astart, int[] B, int Bstart, int k){

    	if(Astart >= A.length){
    		return B[Bstart + k - 1];
    	}
    	if(Bstart >= B.length){
    		return A[Astart + k - 1];
    	}

    	if(k == 1){
    		return Math.min(A[Astart], B[Bstart]);
    	}

    	int Akey = Astart + k / 2 - 1 < A.length ? A[Astart + k / 2 - 1] : Integer.MAX_VALUE;
    	int Bkey = Bstart + k / 2 - 1 < B.length ? B[Bstart + k / 2 - 1] : Integer.MAX_VALUE;
    	if(Akey > Bkey){
    		return findKth(A, Astart, B, Bstart + k / 2, k - k / 2);
    	}
    	else{
    		return findKth(A, Astart + k / 2, B, Bstart, k - k / 2 );
    	}
    }
}