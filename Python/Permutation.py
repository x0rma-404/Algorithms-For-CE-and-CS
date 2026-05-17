def permutation():
    n = int(input())
    p = int(input())

    k = 1
    np = 1
    
    for i in range(1, n + 1):
        k *= i

    for i in range(1, n - p + 1):
        np *= i

    print(k // np)

if __name__ == "__main__":
    permutation()
