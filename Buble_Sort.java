void main(){
    int[] arr = new Random().ints(10,0,100).toArray();

    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length-1; j++) {
            if (arr[j]>arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;

            }
        }
    }

    IO.println(Arrays.toString(arr));
}