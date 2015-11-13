def f(s):
    if all(`i` in s for i in xrange(2,10)):
        return f(str(sum(int(d) * 2**i for i,d in enumerate(reversed(s)))))
    else:
        return s
