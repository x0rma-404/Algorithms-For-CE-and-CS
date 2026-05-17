def palindrome():
    pol = input()
    if pol == pol[::-1]:
        print("PALINDROME")
    else:
        print("NOT PALINDROME")

if __name__ == "__main__":
    palindrome()
