import random

def quick_sort(arr):
    if len(arr) <= 1:
        return arr

    pivot = arr[len(arr) // 2]
    left = []
    mid = []
    right = []

    for num in arr:
        if num < pivot:
            left.append(num)
        elif num > pivot:
            right.append(num)
        else:
            mid.append(num)

    return quick_sort(left) + mid + quick_sort(right)

def main():
    arr = [random.randint(0, 100) for _ in range(10)]
    print(arr)
    arr = quick_sort(arr)
    print(arr)

if __name__ == "__main__":
    main()
