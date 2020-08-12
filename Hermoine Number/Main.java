import math
n = int(input())

array = list(map(int,input().split()))

q = int(input())

for i in range(q):
    l, r = map(int,input().split())
    pro = 1
    for j in range(l,r+1):
        pro = (pro*(math.factorial(array[j-1])))%1000000007
    
    print((pro**(r-l))%1000000007)