class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int[] nums3 = new int[nums1.length + nums2.length];
    	int n1 = 0, n2 = 0, n3 = 0;
    	while (n1 < nums1.length && n2 < nums2.length) {
    		if (nums1[n1] > nums2[n2]) {
    			nums3[n3 ++] = nums2[n2 ++];
    		}
    		else if (nums1[n1] == nums2[n2]) {
    			nums3[n3 ++] = nums1[n1 ++];
    			nums3[n3 ++] = nums2[n2 ++];
    		}
    		else {
    			nums3[n3 ++] = nums1[n1 ++];
    		}
    	}
    	if (n1 >= nums1.length && n2 < nums2.length) {
    		while (n2 < nums2.length)
    			nums3[n3 ++] = nums2[n2 ++];
    	}
    	else if (n2 >= nums2.length && n1 < nums1.length) {
    		while (n1 < nums1.length)
    			nums3[n3 ++] = nums1[n1 ++];
    	}
    	int length = nums3.length / 2;
    	if (nums3.length % 2 == 1) {
    		return nums3[length];
    	}
    	else
    		return (nums3[length] + (double)nums3[length - 1]) / 2;
    }
}