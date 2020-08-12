def transpose(temp_C,n):
    temp_C.reverse()
    result = []
    for i in range(n):
        tempi = []
        for j in range(n):
            tempi.append(0)
        result.append(tempi)
    for i in range(n):
        for j in range(n):
            result[i][j] = temp_C[j][i]
    return result
    




n = int(input())

A = []

for i in range(n):
    A.append(list(map(int,input().split())))

temp_A = A.copy()
count = 0
while(1):
    q = input()

    if(q == '-1'):
        break

    q = list(q.split(" "))
    
    if(len(q) == 2):
        rot = (int(q[1])//90)%4
        count = count + rot
        for i in range(rot):
            temp_A = transpose(temp_A,n)
    elif(len(q) == 3):
        
        print(temp_A[int(q[1])-1][int(q[2])-1])
    else:
        temp = count%4
        
        A[int(q[1])-1][int(q[2])-1] = int(q[3])
        temp_B = A.copy()
        

        for i in range(temp):
            temp_B = transpose(temp_B,n)
        temp_A = temp_B
        
            






