# Simplify

Given a binary number as input through any means, "simplify" the number using a function.

## Type signature

f(string) -> int

### Input: 

A binary number that is more than 0, as a string.

### Output:

Take the input, convert it to base 10 without using a builtin, then if that number contains only 1s and 0s, convert it into a base 10 number as if it were another binary number. Repeat the process until the number cannot be read in binary and output that number.

Builtin e.g. ("1010").to_int(2) is not allowed.

If the input is 1, simply output 1. Your program should not go on infinitely simplifying 1.

```
Input -> Output
"1" -> 1
"1010" -> 2 (1010 -> 10 -> 2)
"1011" -> 3 (1011 -> 11 -> 3)
"1100100" -> 4 (1100100 -> 100 -> 4)
```

[http://codegolf.stackexchange.com/questions/63564/simplify-binary](http://codegolf.stackexchange.com/questions/63564/simplify-binary)