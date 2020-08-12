flag = 0

n = int(input())
array = list(map(int,input().split()))

for i in range(n):
    for j in range(n):
        a = i
        b = j
        
        if(b > a+1):
            slice1 = sum(array[0:a])
            slice2 = sum(array[a+1:b])
            slice3 = sum(array[b+1:n])
            if(slice1 == slice2 and slice2 == slice3):
                flag = 1
                print("Indices which form equi pair {%d,%d}"%(a,b))
                print("Slices are {%d,%d},{%d,%d},{%d,%d}"%(0,a-1,a+1,b-1,b+1,n-1))
                break
    
    if(flag == 1):
        break

if(flag == 0):
    print("Array does not contain any equi pair")
    
