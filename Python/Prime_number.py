a=int(input("Input the number"))
ans = True
if (a<=1):
    ans=False 
else:
    for i in range (2,a//2):
        if (a%i==0):
        ans=False
        break
if(ans):
  print("The number is prime")
else:
  print("The number is not prime")
