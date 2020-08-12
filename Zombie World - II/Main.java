temp= input().split(" ")
b = int(temp[0])
n = int(temp[1])
flag = 0
ze = []
temp = input()
for  i in temp.split():
  if(i.isdigit()):
    ze.append(int(i))
ze.sort()
lose_e = [] 
for i in ze:
  temp = (i%2)+(i/2)
  lose_e.append(temp)
  
for i in range(n):
  b = b - lose_e[i]
  if(b<0):
    flag = 1
    break
if(flag == 0):
  print("YES")
else:
  print("NO")