# Median of two sorted rays
Certification: Advanced level
---

Write a java program to find the median of two sorted arrays of diff
sizes. the mesian is the middle value of a set of numbers arranged in order.

If the set has an even number of elements, the median is the average of the 
two middle values.

## Example 1
```
- Input: nums1 = [1, 3], num2 = [2]
- output: 2.0
- Explanation:
	- merge the two arrays: [1, 2, 3].
	- the merged array has odd length (3), so the median is the middle
	  element, which is 2.0.
```

## Example 2
```
- Input: nums1 = [1, 2], nums2 = [3, 4]
- Output: 2.5
- Explanation:
	- merge the two arrays: [1, 2, 3, 4].
	- the merged array has even length (4), so the median is the average
	  of the two middle elements: (2 + 3) / 2 = 2.5.
```

## Constraints
```
- nums1.length + nums2.length >= 1
- nums1.length, nums2.length <= 1000
- -10^6 <= nums1[i], nums2[i] <= 10^6
- Both nums1 and nums2 are sorted in non-decreasing order
- time complexity: 0(log(m+n)) where m and n are the sizes of the arrays
- space comlexity: 0(1)
```
