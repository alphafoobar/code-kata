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
}
