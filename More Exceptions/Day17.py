class Calculator:
    def power(self,n,p):
        total=1
        if n<0 or p<0:
            raise Exception("n and p should be non-negative")
        else:
            for i in range(p):
                total*=n
            return total

myCalculator=Calculator()
T=int(input())
for i in range(T):
    n,p = map(int, input().split())
    try:
        ans=myCalculator.power(n,p)
        print(ans)
    except Exception as e:
        print(e)   
