def happy_number():
    a = int(input("Daxil Et: "))
    
    while a != 1 and a != 4:
        c = 0
        while a != 0:
            c = c + (a % 10) ** 2
            a = a // 10
        a = c

    if a == 1:
        print("Happy")
    else:
        print("Not Happy")

if __name__ == "__main__":
    happy_number()
