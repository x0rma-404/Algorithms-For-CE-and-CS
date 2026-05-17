
List<Integer> quickSort(List<Integer> arr) {
    if (arr.size() <= 1) return arr;

    int pivot = arr.get(arr.size() / 2);

    List<Integer> left = new ArrayList<>();
    List<Integer> mid = new ArrayList<>();
    List<Integer> right = new ArrayList<>();

    for (int num : arr) {
        if (num < pivot) left.add(num);
        else if (num > pivot) right.add(num);
        else mid.add(num);
    }

    List<Integer> result = new ArrayList<>();
    result.addAll(quickSort(left));
    result.addAll(mid);
    result.addAll(quickSort(right));

    return result;
}

void main() {
    
        List<Integer> arr = new Random()
            .ints(10, 0, 100)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));
        
    IO.println(arr);

    arr = quickSort(arr);

    IO.println(arr);
}