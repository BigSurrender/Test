import math

a = float(input("Enter a: "))
b = float(input("Enter b: "))
h = float(input("Enter h: "))

if a <= 0 or b <= 0 or h <= 0:
	print("Side can't be 0 or less!")
else:
	S = (a+b)/2*h
	print("S = " + str(S))