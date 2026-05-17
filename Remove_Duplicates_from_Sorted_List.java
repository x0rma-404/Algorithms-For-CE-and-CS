void main() {
 int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5,6,6,6,6,6};

        List<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {

                if (arr1.isEmpty() || arr1.get(arr1.size() - 1) != arr[i]) {
                    arr1.add(arr[i]);
                }
            }
        }

        System.out.println(arr1);
    
}