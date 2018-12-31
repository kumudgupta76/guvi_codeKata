n=int(input())
l=[]
m='kabali'
ms=[]
c=0
for i in m:
    ms.append(i)
for i in range(n):
    l.append(input())
for i in l:
    if len(i)!=len(m):
        break
    s=[]
    for j in i:
        s.append(j)
    if sorted(s)==sorted(ms):
        c+=1
print(c)