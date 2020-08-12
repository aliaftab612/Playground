n = int(input())
numbers  = []
try:
    numbers = list(map(int,input().split(" ")))

    bit_score = []
    odd = []
    even = []
    pairs = 0
    flag = 0
    if(n<=500):
        for i in numbers:
            
            temp = list(map(int,sorted(str(i))))
            if(len(temp) != 3):
                print("Invalid Input")
                flag = 1
                break
            bit = max(temp)*11 + min(temp)*7
            st = ""
            st = st + str(bit%10)
            bit = bit//10
            st = st + str(bit%10)
            st = st[::-1]
            bit = int(st)
            bit_score.append(bit)

        if(flag==0):

            for i in range(len(bit_score)):
                if (i+1)%2 == 0:
                    even.append(bit_score[i]//10)
                else:
                    odd.append(bit_score[i]//10)

            odd.sort()
            even.sort()


            

            while(len(odd) != 0):
                
                
                if((odd.count(odd[0]))>=3):
                    pairs = pairs + 2
                
                elif((odd.count(odd[0]))==2):
                    pairs = pairs + 1
                
                t = odd[0]
                
                while(t in odd):
                    odd.remove(t)
                    

            while(len(even) != 0):
                if(even.count(even[0])>=3):
                    pairs = pairs + 2
                elif(even.count(even[0])==2):
                    pairs = pairs + 1
                t = even[0]
                while(t in even):
                    even.remove(t)

            print(pairs)
        

    else:
        print("Invalid Input")
except:
    print("Invalid Input")