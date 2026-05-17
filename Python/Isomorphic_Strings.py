def isomorphic_strings():
    e = input()
    t = input()
    
    hash_map = {}
    
    for i in range(len(e)):
        if e[i] not in hash_map and t[i] not in hash_map.values():
            hash_map[e[i]] = t[i]
            
    c = ""
    for i in range(len(e)):
        c += hash_map.get(e[i], '')
        
    if t == c:
        print("ISOMORPHIC")
    else:
        print("NOT ISOMORPHIC")

if __name__ == "__main__":
    isomorphic_strings()
