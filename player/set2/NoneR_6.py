l={}
for i in range(10):
    n=input()
    if n in l:
        l[n]+=1
    else:
        l[n]=1
print(min(l))