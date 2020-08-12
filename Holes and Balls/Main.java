n = int(input())
dia_holes = list(map(int,input().split(" ")))
m = int(input())
dia_balls = list(map(int,input().split(" ")))
dia_holes.reverse()

full = []

for i in range(len(dia_holes)):
    full.append(len(dia_holes)-i)
flag = 0
for i in range(m):
    flag = 0
    for j in range(n):
        if(dia_balls[i]<=dia_holes[j] and full[j]!=0):
            
            print(len(full)-j,end=" ")
            full[j] = full[j] - 1
            flag = 1
            break
    if(flag == 0):
        print(0,end=" ")
 
    


    