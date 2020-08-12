import math
n = int(input())
l = []
for i in range(1,int(math.sqrt(n)+1)):
  if n%i == 0:
    print(i,end=" ")
    if n//i == i:
      break
    else:
      l.append(n//i)
      
l = l[::-1]

for i in l:
  print(i,end=" ")