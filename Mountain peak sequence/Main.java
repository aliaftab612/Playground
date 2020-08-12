
n = int(input())
s = 2
if(n == 1 or n==2):
    print(0)
elif(n == 3):
    print(2)
else:


    for i in range(4, n+1):
	    s= ((s*2) + 2) % (10000000007)
    print(s)


