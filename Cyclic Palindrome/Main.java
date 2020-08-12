t = int(input())

for i in range(t):
    string = input()
    st = string
    n = len(string)
    st1 = string

    if(string[::-1] == string):
        print(0)
        continue

    count1 = 0
    count2 = 0
    flag = 0
    for j in range(n):
        st = st[::-1]
        
        st = st + st1[n-1]
        l = list(st)
        l[0]=" "
        l.remove(" ")
        st = "".join(l)
        st = st[::-1]
        st1=st
        
        
        
       
        count1 = count1 + 1
        if(st[::-1] == st):
            flag = 1
        
            break
    
    st = string
    for j in range(n):
        
        st = st + string[0]
        l = list(st)
        l[0]=" "
        l.remove(" ")
        st = "".join(l)
        string = st
        
        count2 = count2 + 1
        
        if(st[::-1] == st):
            flag = 1
            break
    
    if(flag == 0):
        print(-1)
    else:
        if(count1<count2):
            print(count1)
        else:
            print(count2)