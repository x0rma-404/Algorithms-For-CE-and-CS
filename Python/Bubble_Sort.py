import random

def bubble_sort():
    arr = [random.randint(0, 100) for _ in range(10)]
    print(arr)

    for i in range(len(arr)):
        for j in range(len(arr) - 1):
            if arr[j] > arr[j + 1]:
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp

    print(arr)

if __name__ == "__main__":
    bubble_sort()
