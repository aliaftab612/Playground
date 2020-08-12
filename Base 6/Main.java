n = int(input())

main_list = []
main_list = list(map(int,input().split(" ")))

l = len(main_list)

sec_list = []
sum_list = []

for i in main_list:
    temp = []
    while(i>0):
        
        temp.append(str(i%6))
        i = i//6
    temp.reverse()
    st = int("".join(temp))
    sec_list.append(st)


for i in sec_list:
    sumi = 0
    while(i>0):
        r = i%10
        sumi  = sumi + r
        i = i//10
    sum_list.append(sumi)

count = 0
for i in range(l):
    for j in range(i+1,n):
        if(sum_list[i]>sum_list[j]):
            count = count + 1

print(count)

