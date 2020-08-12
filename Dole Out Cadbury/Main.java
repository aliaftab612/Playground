p = int(input())
q = int(input())
r = int(input())
s = int(input())
count = 0
if((p>0 and p<=1500) and (q>0 and q<=1500) and (r>0 and r<=1500) and (s>0 and s<=1500)):
    for i in range(p,q+1):
        
        for j in range(r,s+1):
        
            a = max(i,j)
            b = min(i,j)
            while(a != b):
                a = a-b
                count = count +1
                mi = min(a,b)
                
                ma = max(a,b)
                a = ma
                b = mi
            count = count+1
            

    print(count)

