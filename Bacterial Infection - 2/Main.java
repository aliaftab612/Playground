temp = input().split(" ")

m = int(temp[0])
n = int(temp[1])

hospital = []

for i in range(m):
    temp = input().split(" ")
    hospital.append(temp)


x,y = map(int,input().split(" "))

stack = []
count = 0
if(hospital[x][y] == "c"):
    print(count)
else:
    stack.append([x,y])

    while(len(stack) != 0):
        
        temp = []
        t = len(stack)
        for i in range(t):
            cor = stack.pop()
            
            hospital[cor[0]][cor[1]] = "i"
            
            temp.append(cor)

        count = count + 1
        for i in temp:
            cor1=i[0]
            cor2=i[1]

            if(cor1-1>=0):
                if(hospital[cor1-1][cor2] == "o"):
                    stack.append([cor1-1,cor2])
            if(cor1+1<m):
                if(hospital[cor1+1][cor2] == "o"):
                    stack.append([cor1+1,cor2])
            if(cor2-1>=0):
                if(hospital[cor1][cor2-1] == "o"):
                    stack.append([cor1,cor2-1])
            if(cor2+1<n):
                if(hospital[cor1][cor2+1] == "o"):
                    stack.append([cor1,cor2+1])
            
    print(count)