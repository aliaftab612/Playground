from itertools import permutations

t = int(input())

for i in range(t):
  string = input()
  if(string != string[::-1]):
    print("Not a palindrome")
  else:
    palin = []
    string = sorted(string)
    perm = permutations(string)
    
    for i in perm:
      temp = "".join(i)
      if(temp == temp[::-1]):
        if(temp not in palin):
          palin.append(temp)
    
    for i in palin:
      print(i)
  
  