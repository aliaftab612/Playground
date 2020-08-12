t = int(input())

for q in range(t):
	l = input()

	temp_l = l

	temp_l = temp_l.replace('P','')

	temp_l = list(temp_l)
	n = len(temp_l) - 1
	if(temp_l[0] != '{' or temp_l[n] != '}' or temp_l.count('<') != 1 or temp_l.count('>') != 1):
		
		print("Compilation Errors")
		continue
	flag = 0
	stack = []
	
	for i in range(0,n+1):
		
		if(temp_l[i] in "{(<"):
			stack.append(temp_l[i])
		else:
			temp = stack.pop()

			if((temp_l[i] == '>' and temp == '<') or (temp_l[i] == '}' and temp == '{') or (temp_l[i] == ')' and temp == '(')):
				continue
			else:
				flag = 1
				break
	
	
				
				
	if(len(stack) != 0):
		flag = 1
		
	if(flag == 1):
		
		print("Compilation Errors")
		continue
	
	temp_l = "".join(temp_l)
	

	if(("<(" in temp_l) or ("((" in temp_l) or ("){" in temp_l) or (">{" in temp_l) or ("}(" in temp_l) or ("}<" in temp_l)):
		print("Compilation Errors")
		
		continue
	
	l = list(l)
	for k in range(len(l)):
		if(l[k] == '('):
			ind1 = k
		if(l[k] == ')'):
			ind2 = k
			if(l[ind1:ind2].count('P') > 100):
				flag= 1
				print("Compilation Errors")
				break

	
	if(flag == 0):
		print("No Compilation Errors")
