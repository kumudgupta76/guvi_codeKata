s=input()
l={}
for i in s:
    if i in l:
        l[i]+=1
    else:
        l[i]=1
print (max(l)