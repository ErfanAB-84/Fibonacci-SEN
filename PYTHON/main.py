def Even(number):
	if number % 2 == 0:
		return True
	else:
		return False


# in JAVA : ArrayList<Integer> out = new ArrayList<>();
unity = list()
a = 0
b = 1
for init in range(0 , 10):
	a , b = b , a+b
	if Even(b):
		unity.append(b)

sumset = 0
for i in unity:
	sumset = sumset + i

print(sumset)