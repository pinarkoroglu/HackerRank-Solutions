numberOfArray=int(input())
for i in range(numberOfArray):
    string=input()
    for j in range(len(string)):
        if(j%2==0): 
            print(string[j],end='')
    print(" ", end='')
    for k in range(len(string)):
        if(k%2!=0): 
            print(string[k],end='')
    print()




