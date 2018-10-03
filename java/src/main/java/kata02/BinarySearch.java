package kata02;

public class BinarySearch {

    public int chop(int key, int[] a) {

        int start = 0;
        int len = a.length;
        int end = len;
        int index = (end - start) / 2;

        while (index > 0 && index < len && start != index && end != index) {
            if (key < a[index]) {
                end = index;
                index = (end - start) / 2;
            } else if (key > a[index]) {
                start = index;
                index = index + ((end - start) / 2);
            } else {
                break;
            }
        }
        if (len != 0 && key == a[index]) {
            return index;
        }
        return -1;
    }

    // Other solutions
//    public int chop(int key, int[] a) {
//        if (a == null || a.length == 0) {
//            return -1;
//        }
//
//        int left = 0;
//        int right = a.length - 1;
//
//        while (left <= right) {
//            int index = (left + right) / 2;
//            if (a[index] < key) {
//                left = index + 1;
//            } else if (a[index] > key) {
//                right = index - 1;
//            } else {
//                return index;
//            }
//        }
//        return -1;
//    }

    // The loop has less conditions but usually takes an extra iteration.
//    public int chop(int key, int[] a) {
//        if (a == null || a.length == 0) {
//            return -1;
//        }
//
//        int left = 0;
//        int right = a.length - 1;
//
//        while (left != right) {
//            int index = ceil(left + right, 2);
//            if(a[index] > key) {
//                right = index -1;
//            } else {
//                left = index;
//            }
//        }
//
//        if(a[left] == key) {
//            return left;
//        }
//        return -1;
//    }

//    private int ceil(int a, int b) {
//        return (a / b) + (a % b);
//    }

//    public int chop(int key, int[] a) {
//        if (a == null || a.length == 0) {
//            return -1;
//        }
//
//        return recurse(0, a.length - 1, key, a);
//    }
//
//    private int recurse(int left, int right, int key, int[] a) {
//        int index = (left + right) / 2;
//
//        if (a[index] == key) {
//            return index;
//        } else if (a[index] < key) {
//            return recurse(index + 1, right, key, a);
//        } else if (a[index] > key) {
//            return recurse(left, index - 1, key, a);
//        }
//        return -1;
//    }
}
