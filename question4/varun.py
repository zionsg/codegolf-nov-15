x = ''.join([chr(x+97) for x in range(26)])
for i in range(1, 27):
	print ''.join([x[:i-1] + x[i-1].upper() + x[i:]])
