def fairy_candy_swap():
    alice_sizes = [1, 1, 2]
    bob_sizes = [2, 2]

    suma = sum(alice_sizes)
    sumb = sum(bob_sizes)

    for i in range(len(alice_sizes)):
        for j in range(len(bob_sizes)):
            if suma - alice_sizes[i] + bob_sizes[j] == sumb - bob_sizes[j] + alice_sizes[i]:
                print(f"[{alice_sizes[i]},{bob_sizes[j]}]")
                return

if __name__ == "__main__":
    fairy_candy_swap()
