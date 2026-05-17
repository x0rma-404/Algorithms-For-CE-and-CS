def harshad_number():
    a = int(input())
    k = a
    c = 0
    
    while a != 0:
        c += a % 10
        a //= 10

    if k % c == 0:
        print("Harshad")
    else:
        print("Not Harshad")

if __name__ == "__main__":
    harshad_number()
