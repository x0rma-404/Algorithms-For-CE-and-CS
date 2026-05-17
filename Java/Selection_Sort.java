void main() {
    int[] arr = new Random().ints(10, 0, 100).toArray();
    System.out.println("Input:  " + Arrays.toString(arr));

    for (int i = 0; i < arr.length - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }

    System.out.println("Output: " + Arrays.toString(arr));
}
