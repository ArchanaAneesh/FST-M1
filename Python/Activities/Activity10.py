#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

tuplenumbers = (1, 7, 19, 30, 99,45)
print("Given list is ", tuplenumbers)
 
# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in tuplenumbers:
    if (num % 5 == 0):
        print(num)