import string

s=input()
c=0
for i in s:
    if i in string.digits:
        c+=1
print (c)