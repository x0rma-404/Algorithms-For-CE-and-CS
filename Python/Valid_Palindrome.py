def valid_palindrome():
    c = input("Daxil Et: ").lower()
    
    a = ""
    for char in c:
        if ('a' <= char <= 'z') or ('0' <= char <= '9'):
            a += char
            
    if a == a[::-1]:
        print("Valid Palindrome")
    else:
        print("Not Valid Palindrome")

if __name__ == "__main__":
    valid_palindrome()
