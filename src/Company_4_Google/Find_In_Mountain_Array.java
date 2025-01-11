package Company_4_Google;
// https://leetcode.com/problems/find-in-mountain-array/
public class Find_In_Mountain_Array {
    class MountainArray {
        public int get(int index) { return 0;}
        public int length() {return 0;}
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeak(mountainArr, 0, mountainArr.length() - 1);
        int result = binarySearch(mountainArr, target, 0, peakIndex);

        if (result != -1) {
            return result;
        }

        return binarySearchDecreasing(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
    }

    // Binary search for increasing order
    int binarySearch(MountainArray mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Binary search for decreasing order
    int binarySearchDecreasing(MountainArray mountainArr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);

            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Find peak index
    int findPeak(MountainArray mountainArr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
