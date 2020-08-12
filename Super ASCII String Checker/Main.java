t= int(input())

for i in range(t):
    string = input()

    string = sorted(string)
    flag = 0
    while(len(string)):
        if(string.count(string[0]) == (ord(string[0])-96)):
            temp = string[0]
            while(temp in string):
                string.remove(string[0])
                
        else:
            
            flag=1
            break
    
    if(flag == 0):
        print("YES",end=" ")
    else:
        print("NO",end=" ")