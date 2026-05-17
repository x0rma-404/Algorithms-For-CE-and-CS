def ugly_number():
    a = int(input("Daxil et: "))
    
    while True:
        if a == 1:
            print("Ugly")
            break
        if a == 0:
            print("Not Ugly")
            break
            
        if a % 2 == 0:
            a //= 2
        elif a % 5 == 0:
            a //= 5
        elif a % 3 == 0:
            a //= 3
        else:
            print("Not Ugly")
            break

if __name__ == "__main__":
    ugly_number()
