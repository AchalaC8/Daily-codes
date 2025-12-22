guess="_a___ __ac__r_ _a_"
g="0"
j=0
print("GUESS THE SENTENCE!!!")

def c(s,ind,new):
    d=list(s)
    d[ind]=new
    return "".join(d)
                   
while True:
    j=0 #reinitializining
    for i in guess:  
        if i=="_":
            j=1
            break
        else:
            continue
    if j!=1:
        break

    print(guess)
    g=input("enter your guess:")
    if(g=='H'or g=='h'):
       print("RIGHT GUESS")
       guess=c(guess,0,"H")
       guess=c(guess,10,"h")
    elif(g=="P" or g=='p'):
        print("RIGHT GUESS")
        guess=c(guess,2,"p")
        guess=c(guess,3,"p")
    elif(g=="Y" or g=='y'):
        print("RIGHT GUESS")
        guess=c(guess,4,"y")
        guess=c(guess,17,"y")
    elif(g=="T" or g=="t"):
        print("RIGHT GUESS")
        guess=c(guess,6,"T")
    elif(g=="E" or g=="e"):
        print("RIGHT GUESS")
        guess=c(guess,11,"e")
        guess=c(guess,7,"e")
    elif(g=="S" or g=="s"):
        print("RIGHT GUESS")
        guess=c(guess,13,"s")
    elif(g=="D" or g=="d"):
        print("RIGHT GUESS")
        guess=c(guess,15,"D")
    else:
        print("oops try again")


print("You guessed it!!")
print(guess+"!!!!")
input()
        

