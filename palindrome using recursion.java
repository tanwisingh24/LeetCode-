class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        return check(arr, 0, arr.length - 1);
    }

    static boolean check(int[] arr, int i, int j) {
        if (i >= j) return true;

        if (arr[i] != arr[j]) return false;

        return check(arr, i + 1, j - 1);
    }
        
    }
