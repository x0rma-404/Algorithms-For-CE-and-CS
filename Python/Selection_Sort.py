import random

def selection_sort():
    arr = [random.randint(0, 100) for _ in range(10)]
    print(f"Input:  {arr}")

    for i in range(len(arr) - 1):
        min_idx = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
                
        temp = arr[min_idx]
        arr[min_idx] = arr[i]
        arr[i] = temp

    print(f"Output: {arr}")

if __name__ == "__main__":
    selection_sort()
