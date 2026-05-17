import random

def insertion_sort():
    arr = [random.randint(0, 100) for _ in range(10)]
    print(f"Input:  {arr}")

    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1

        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

    print(f"Output: {arr}")

if __name__ == "__main__":
    insertion_sort()
