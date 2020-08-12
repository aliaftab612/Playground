n = int(input())

l = [0,0,1]

for i in  range(3,n+1):
    temp = ((i-1)*(l[i-1]+l[i-2])%100000007)
    l.append(temp)



print(l[n])