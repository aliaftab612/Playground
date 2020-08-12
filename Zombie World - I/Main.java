t = int(input())

for i in range(t):
    temp = input().split(" ")
    n = int(temp[0])
    t = int(temp[1])
    flag = 0
    e = []
    e = list(map(int,input().split(" ")))
    
    temp = input().split(" ")
    ie = int(temp[0])
    me = int(temp[1])
    temp = []
    while(len(e) != 0 and t != 0):
        for i in range(len(e)):
            if(e[i]<=ie):
                temp.append(e[i])
        if len(temp) == 0:
            flag = 1
            break
        temp.sort()
        
        diff = ie-temp[0]
        e.remove(temp[0])
        ie = ie + diff
        t = t-1
        temp = []
    
    if(len(e)==0 and flag==0):
        if(ie>=me):
            print("YES",end="")
        else:
            print("NO",end="")
    else:
        print("NO",end="")
                

