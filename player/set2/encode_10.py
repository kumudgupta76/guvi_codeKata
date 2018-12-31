s=input()
o=""
for i in s:
    if i in ['x','y','z','X','Y','Z']:
        o+=chr(ord(i)+3-26)
    else:
        o+=chr(ord(i) + 3)
print(o)