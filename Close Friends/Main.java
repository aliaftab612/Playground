li=[]
k,n,t = input().split();
k=int(k)
n=int(n)
t=int(t)
flats = []
for i in range(0,n):
  # li = input().split(" ")
  # flats.append(li)
  flats.append(list(map(int, input().split())))
pj=[]
pj=input().split(" ")
rj=[]
rj=input().split(" ")
for i in range(0,n):
  z=0;
  for j in range(0,n):
    flats[i][j]=flats[i][j]*int(pj[z])
    z+=1;
count=0;
for i in range(0,n):
  value=int(pj[i]);
  wtp=value*int(rj[i]);
  for j in range(0,n):
    if(value>=k and wtp<=t):
      count+=1
      break;
    wtp+=flats[i][j]*int(rj[j]);
    value+=flats[i][j];
  wtp=0;
  value=0;
print (count)