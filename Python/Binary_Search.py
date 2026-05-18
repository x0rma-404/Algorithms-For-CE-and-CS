def main():
    nums = [-1, 0, 3, 5, 9, 12]
    target = 9

    left = 0
    right = len(nums) - 1

    while left <= right:
        mid = left + (right - left) // 2

        if nums[mid] == target:
            print(mid)
            return

        if nums[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    print(-1)

if __name__ == "__main__":
    main()
