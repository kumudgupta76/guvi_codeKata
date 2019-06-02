n=int(input())
l=[]
for i in range(0,n):
    l.append(list(map(int,input().split())))
sum=0
for i in range(0,n):
    for j in range(0,n):
        if i==j:
            sum+=l[i][j]
print(sum)