a=int(input("Enter the number"))
b=a
n=0
rev=0
while(a>0):
    n=a%10
    rev=rev*10+n
    a=a//10
print("reversed number",rev)
if(rev==b):
  print("it is a palindrome")
else:
  print("it is not a palindrome")
