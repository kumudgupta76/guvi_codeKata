n=int(input())
k=int(input())
l=[]
for i in range (n):
    l.append(int (input()))
l=l[-k:]+l[:-k]
print(l)