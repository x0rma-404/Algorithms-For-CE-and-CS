import random

def merge(arr, left, mid, right):
    n1 = mid - left + 1
    n2 = right - mid

    L = arr[left:left + n1]
    R = arr[mid + 1:mid + 1 + n2]

    i = 0
    j = 0
    k = left

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1

    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

def sort(arr, left, right):
    if left < right:
        mid = left + (right - left) // 2
        sort(arr, left, mid)
        sort(arr, mid + 1, right)
        merge(arr, left, mid, right)

def merge_sort():
    arr = [random.randint(0, 100) for _ in range(10)]
    print(f"Input:  {arr}")
    sort(arr, 0, len(arr) - 1)
    print(f"Output: {arr}")

if __name__ == "__main__":
    merge_sort()
