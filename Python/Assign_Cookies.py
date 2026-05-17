def assign_cookies():
    g = [1, 2, 3]
    s = [1, 1]

    g.sort()
    s.sort()

    i = 0
    j = 0
    count = 0

    while i < len(g) and j < len(s):
        if s[j] >= g[i]:
            count += 1
            i += 1
            j += 1
        else:
            j += 1

    print(count)

if __name__ == "__main__":
    assign_cookies()
