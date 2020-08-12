import math
temp = input().split(" ")
n = int(temp[0])
k = int(temp[1])
l1=[]
l2=[]
for i in range(1,int(math.sqrt(n)+1)):
  if(n%i == 0):
    l1.append(i)
    if(n//i == i):
      break
    else:
      l2.append(n//i)
l2.reverse()
l1.extend(l2)
l = len(l1)

if(l-k)>=0:
  print(l1[l-k])
else:
  print(1)
