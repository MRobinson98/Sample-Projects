//This is the main function from a C++ programming assingment
//Its purpose is to test mutator methods for properties of a car, while testing out pointers

#include <iostream>
#include "Car.h"

using namespace std;	

int main() {

	//initalize a variable
	int var1 = 1;
	//initalize a pointer containing var1's address
	int *ptr1 = &var1;

	cout << "Here is the original variable, integer var1: " << var1 << "\n";

	cout << "Here is the address of the integer var1: " << ptr1 << "\n";

	cout << "Here is the derefenced pointer, using the address to access a variable: " << *ptr1 << "\n";

	//Complex Example
	
	Car *myCar = new Car();

	//Passing paramters to the object
	myCar->setModel("Ford Mustang");
	myCar->setModelYear(2019);
	myCar->setTopSpeed(250);

	//Printing the car information
	cout << "The car is a: " << myCar->getModelYear(*myCar) << " " << myCar->getModel(*myCar) << " with a top speed of: " << myCar->getTopSpeed(*myCar);


	

	cout << "\n";
	system("pause");
	return 0;
}
