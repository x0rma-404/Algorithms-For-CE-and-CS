def power_of_four():
    a = int(input())

    if a <= 0:
        print("4 un quvveti deyil")
        return

    while a % 4 == 0:
        a //= 4

    if a == 1:
        print("4 un quvvetidir")
    else:
        print("4 un quvveti deyil")

if __name__ == "__main__":
    power_of_four()
