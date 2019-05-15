if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        maximum=0
        nk = input().split()
        n = int(nk[0])
        k = int(nk[1])

        for i in range(1,n):
            for j in range(i+1,n+1):           
             if((i&j)<k and maximum<(i&j)):
                maximum=(i&j)
        print(maximum)




