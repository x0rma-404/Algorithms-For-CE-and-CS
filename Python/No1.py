a = "Salam men hemid"
d = {}
keys=[]
for i in a:
    if i != ' ':
        if i in d:
            d[i] += 1
        else:
            d[i] = 1


for i in d:
    keys+=[i]


for i in range(len(keys)):
    for j in range(i + 1, len(keys)):
        if d[keys[i]] > d[keys[j]]:
            keys[i], keys[j] = keys[j], keys[i]
        elif d[keys[i]] == d[keys[j]]:
            if keys[i]>keys[j]:
                keys[i], keys[j] = keys[j], keys[i]

new_d = {}


for k in keys:
    new_d[k] = d[k]

print(new_d)    

c=''
for i in new_d:
    c+=i*new_d[i]

print(c)