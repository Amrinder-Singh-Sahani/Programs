public class binarysearch {
    static int ceil(float num) {
        float b = num % 1;
        num = num + 1 - b;

        return (int) (num);

    }

    public static void main(String args[]) {
        int arr[] = { 12, 36, 38, 56, 60, 65, 73, 75, 78, 80, 87 };
        int a = 87;
        int mid = (arr.length - 1) / 2;
        do {
            if (a < arr[mid]) {
                mid = mid / 2;

            } else if (a > arr[mid]) {
                float newmid = ((arr.length - 1) - mid) / 2;
                mid = mid + ceil(newmid);

            }
        } while (a != arr[mid]);

        System.out.println("Element found at index " + mid);
    }
}