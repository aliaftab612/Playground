p = float(input())
t = int(input())
slab_1 =int(input())



sumi1 = 0
for i in range(slab_1):
  temp = input().split(" ")
  yrs = int(temp[0])
  r = float(temp[1])
  rate = r/1200
  
  emi = p * (rate / ( 1- (1 /pow((1 + rate),(yrs * 12)))))
  sumi1 = sumi1 + ((emi*yrs)-p)
slab_2 = int(input())
sumi2 = 0
for i in range(slab_2):
  temp = input().split(" ")
  yrs = int(temp[0])
  r = float(temp[1])
  rate = r/1200
 
  emi = p * (rate / ( 1- (1 /pow((1 + rate),(yrs * 12)))))
  sumi2 = sumi2 + ((emi*yrs)-p)
  
if(sumi1>sumi2):
  print("Bank B")
else:
  print("Bank A")

  