def remove_duplicates():
    arr = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6]
    arr1 = []

    for i in range(len(arr) - 1):
        if arr[i] == arr[i + 1]:
            if not arr1 or arr1[-1] != arr[i]:
                arr1.append(arr[i])

    print(arr1)

if __name__ == "__main__":
    remove_duplicates()
