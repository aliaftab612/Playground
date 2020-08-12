y= input().split(" ")
n = int(y[0])
k = int(y[1])
sum = 0
temp = []
old = []

a = input().split(" ")
a = list(map(int,a))

b = input().split(" ")
b = list(map(int,b))

for i in range(n):
  sum = sum + a[i]*b[i]
  old.append(a[i]*b[i])
  
for i in range(n):
  if(a[i]<0 and b[i]<0):
    a[i] = a[i] + (2*k)
  else:
    a[i] = a[i] - (2*k)
  new = old[i] - (a[i]*b[i])
  temp.append(new)
  
temp.sort()
print(sum-temp[n-1])
