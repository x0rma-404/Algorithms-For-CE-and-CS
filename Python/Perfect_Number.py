def perfect_number():
    a = int(input())
    c = 0
    for i in range(1, a):
        if a % i == 0:
            c += i

    if a == c:
        print("Perfect")
    else:
        print("Not Perfect")

if __name__ == "__main__":
    perfect_number()
