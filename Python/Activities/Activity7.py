#Write a Python program to calculate the sum of all the elements in a list.

#sumoflist=[1,2,2,3,4,5,6]
#i = 0
numbers = input("Enter a sequence of comma separated values: ")

sum = 0
for number in numbers:
  sum += int(number)
 
print(sum)