# Car Rental Management System (Java OOP)

A simple console-based **Car Rental Management System** built using **Java and Object-Oriented Programming (OOP)** concepts.

This project allows users to:
- View available cars
- Rent a car
- Return a car
- Generate rental records

---

## Technologies Used
- Java
- OOP Concepts (Encapsulation, Abstraction)
- ArrayList
- IntelliJ IDEA
- Git & GitHub

---

## Features
- Add and manage cars
- Customer registration
- Rent & return functionality
- Price calculation based on days
- Console-based menu system

---

## Project Structure
src/
├── model/
│   ├── Car.java
│   ├── Customer.java
│   └── Rental.java
├── service/
│   └── CarRentalSystem.java
└── Main.java


## Sample Console Output

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 3

--- ALL CARS REPORT ---
C1 | Toyota | Camry | Available
C2 | Honda | City | Available
C3 | Mahindra | Thar | Available
C4 | Hyundai | Creta | Available

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 1

Enter customer name: Esha

Available Cars:
C1 - Toyota Camry - Rent/day: 10000.0
C2 - Honda City - Rent/day: 12000.0
C3 - Mahindra Thar - Rent/day: 20000.0
C4 - Hyundai Creta - Rent/day: 15000.0

Enter Car ID: C3
Enter rental days: 2

Total price: ₹40000.0
Confirm rental (Y/N): Y
Car rented successfully!

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 3

--- ALL CARS REPORT ---
C1 | Toyota | Camry | Available
C2 | Honda | City | Available
C3 | Mahindra | Thar | Rented
C4 | Hyundai | Creta | Available

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 4

--- RENTAL REPORT ---
Esha rented Mahindra for 2 days

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 5

Total Revenue: ₹40000.0

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 2

Enter Car ID to return: C3
Car returned successfully!

===== CAR RENTAL SYSTEM =====
1. Rent Car
2. Return Car
3. Show All Cars
4. Show All Rentals
5. Total Revenue
6. Exit
Enter choice: 6
Thank you for using system!

Process finished with exit code 0


