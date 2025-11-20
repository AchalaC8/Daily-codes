n=int(input())
for i in range (n):
    s=input()
    e=""
    o=""
    for j in range (len(s)):
        if j%2==0:
            e=e+s[j]
        else:
            o=o+s[j]
    print(e,o)
