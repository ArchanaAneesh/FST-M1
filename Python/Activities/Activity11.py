#Create a Python dictionary that contains a bunch of fruits and their prices.

#Write a program that checks if a certain fruit is available or not.

fruits = {
    "apple": 30,
    "banana": 20,
    "orange": 6,
    "mango": 0
}
 
fruitavaliable= input("Enter fruits name:  ").lower()
 
if(fruitavaliable in fruits):
    print("Yes, "+ fruitavaliable +  " is available")
else:
    print("No, "+ fruitavaliable +" is not available")