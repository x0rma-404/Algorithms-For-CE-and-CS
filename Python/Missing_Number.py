def missing_number():
    nums1 = [9, 6, 4, 2, 3, 5, 7, 0, 1]
    nums1.sort()
    
    nums = nums1 + [0]
    print(nums)
    
    for i in range(len(nums)):
        if i != nums[i]:
            print(i)
            break

if __name__ == "__main__":
    missing_number()
