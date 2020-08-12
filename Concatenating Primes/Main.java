def prime(n,l):
  
  if(n==2):
    l.append(2)
    return
  
  for i in range(2,n):
    if(n%i == 0):
      return
  l.append(n)
  
l = []
n = int(input())
flag =0
primes = []
if(n>=2):
  primes.append(2)
for i in range(3,n+1):
  for j in range(2,i):
    if(i%j == 0):
      flag=1
      break
  if(flag != 1):
    primes.append(i)
  flag=0
  
for i in range(len(primes)):
  for j in range(len(primes)):
    temp = int(str(primes[i])+str(primes[j]))
    prime(temp,l)

l = list(set(l))    
print(len(l))    
  
    
    