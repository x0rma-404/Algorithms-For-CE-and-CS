def reverse_string():
    s = list("hello")
    print("".join(s))
    
    left = 0
    right = len(s) - 1
    
    while left < right:
        temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left += 1
        right -= 1
        
    print("".join(s))

if __name__ == "__main__":
    reverse_string()
