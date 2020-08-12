

def prime(n):
    if n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        flag = 0
        for i in range(2, n):
            if n % i == 0:
                flag = 1
                break
        if flag == 0:
            return 1
        else:
            return 0


def number_game(n):
    while n != 1 and n != 4:
        sumi = 0
        while n > 0:
            r = n % 10
            sumi = sumi + (r*r)
            n = n//10
        n = sumi
    if(n==1):
        return 1
    else:
        return 0


def main():
    x = int(input())
    y = int(input())
    n = int(input())
    if (x <= y) and (x > 0) and (n > 0):
        count = 0
        for i in range(x, y+1):
            if prime(i) and number_game(i):
                count = count + 1
            if count == n:
                print(i)
                break

        else:
            print("No number is present at this index")
    else:
        print("Invalid Input")

if __name__ == "__main__":
    main()