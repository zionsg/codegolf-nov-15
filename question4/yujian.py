def f():
    abc=[chr(97+i)for i in xrange(26)]
    ABC=[chr(65+i)for i in xrange(26)] 
    for i in range(26)+range(25)[::-1]:
        print ''.join(abc[:i])+ABC[i]+''.join(abc[i+1:])

