def f():
    z=range(26)
    a=[chr(97+i)for i in z]
    A=[chr(65+i)for i in z]
    for i in z+z[:-1][::-1]:
        print ''.join(a[:i])+A[i]+''.join(a[i+1:])
