def isPrime(n):
    for i in range (2,n//2):
        if n%i==0:
            return False
    return True

n=int(input())

for i in range(2,n//2):
    if n%i==0 and isPrime(i):
        print (i,end=' ')