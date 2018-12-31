s=input()
p=""
v=['a','e','i','o','u','A','E','I','O','U']
for i in s:
    if i not in v:
        p+=i
print(p[::-1])

