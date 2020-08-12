from itertools import permutations
flag = 0
temp = input().split(" ")
a = int(temp[0])
b = int(temp[1])

a_digit = []

while(a>0):
    r = a%10
    a_digit.append(str(r))
    a = a//10

perm = permutations(a_digit)

poss = []

for i in perm:
    temp = "".join(i)
    temp = int(temp)
    poss.append(temp)

poss.sort()

for i in poss:
    if(i>b):
        print(i)
        flag = 1
        break

if(flag==0):
    print(-1)