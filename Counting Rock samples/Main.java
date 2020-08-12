temp = input().split(" ")
s = int(temp[0])
r = int(temp[1])

samples = []
samples = list(map(int,input().split(" ")))
samples.sort()
n = len(samples)
rang = []
for i in range(r):
    temp = list(map(int,input().split(" ")))
    rang.append(temp)

for i in range(r):
    count = 0
    for j in samples:
        if(j>=rang[i][0] and j<=rang[i][1]):
            count = count +1
    print(count,end=" ")