n = int(input())
t=10
v=(n*n)+1
ti=n * (n+1)


for i in range(n):
  
  for j in range(2*i):
    print("*",end="")
  for j in range(n-i):
    print(t,end="")
    t=t+10
  for j in range(n-i-1):
    print((v+j)*10,end="")
  v=v-(n-(i+1))
  print(ti)
  ti=ti-n+i
  
    