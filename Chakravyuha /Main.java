n = int(input())

chakra = []

for i in range(n):
    temp = []
    for j in range(n):
        temp.append("X")
    chakra.append(temp)

i = 0
j = 0
power = [(0,0)]
number = 1
count = 1

while(number != (n*n)+1):
    while(j<n and number != (n*n)+1):
        if(chakra[i][j] == "X"):
            chakra[i][j] = number
            if(chakra[i][j]%11 == 0):
                power.append((i,j))
                count = count +1
            number = number + 1
            j =j + 1
        else:

            break
    j = j - 1
    i = i + 1

    while(i<n and number != (n*n)+1):
        if(chakra[i][j] == "X"):
            chakra[i][j] = number
            if(chakra[i][j]%11 == 0):
                power.append((i,j))
                count = count +1
            number = number + 1
            i = i + 1
        else:
            break
    j = j - 1
    i = i - 1
    while(j>=0 and number != (n*n)+1):
        if(chakra[i][j] == "X"):
            chakra[i][j] = number
            if(chakra[i][j]%11 == 0):
                power.append((i,j))
                count = count +1
            number = number + 1
            j = j - 1
        else:
            break
    j = j + 1
    i = i - 1
    while(i>=0 and number != (n*n)+1):
        if(chakra[i][j] == "X"):
            chakra[i][j] = number
            if(chakra[i][j]%11 == 0):
                power.append((i,j))
                count = count +1
            number = number + 1
            i = i - 1
        else:
            break
    j = j + 1
    i = i + 1

for i in chakra:
    for j in i:
        print(j,end="\t")
    print(end="\n")




print("Total Power points :",count)

for  i in power:
    print(i)



