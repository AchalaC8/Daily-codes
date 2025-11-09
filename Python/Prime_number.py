a=int(input("Input the number"))
ans = False
for i in range (2,a/2):
    if (a==1||a==0):
        ans=True
        break
    if (a%i==0):
        ans=True
        break
if(ans):
  print("The number is prime")
else:
  print("The number is not prime")
