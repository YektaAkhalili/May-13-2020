cars = ["audi", "bmw", "g-wagon"]

for car in cars: 
	if car == 'bmw':
		print(car.upper())
	else: 
		print(car.title())

quote = "No can do"
if quote != "hey hey hey":
	print("I was right!")


if 'pejout' in cars:
	print("Yes")
else:
	print("Nope.")	

if 'pejout' not in cars:
	print("pejout is not in cars!")	