mathew_john = []
for i in range(1,708):
  temp = i*((2*i)-1)
  mathew_john.append(temp)
temp = input().split(" ")  
t1 = int(temp[0])
t2 = int(temp[1])
m = int(temp[2])

if(t1>0 and t1<t2 and m>0 and t2<1000000):
  l = []
  
  if(t1 in mathew_john):
    ind1 = mathew_john.index(t1)
  else:
    while(not(t1 in mathew_john)):
      t1 = t1 + 1
    ind1 = mathew_john.index(t1)
  if(t2 in mathew_john):
    ind2 = mathew_john.index(t2)
  else:
    while(not(t2  in mathew_john)):
      t2 = t2 - 1
    ind2 = mathew_john.index(t2)
  
  l = mathew_john[ind1:ind2+1]
  try:
    print(l[m-1])
  except:
    print("No number is present at this index")
else:
  print("Invalid Input")