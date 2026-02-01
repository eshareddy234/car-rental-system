# 🚗 Car Rental Management System (Java OOP)

A console-based **Car Rental Management System** built using **Java** that demonstrates all **four Object-Oriented Programming (OOP) pillars**:  
**Encapsulation, Abstraction, Inheritance, and Polymorphism.**

The system allows users to interact through a menu-driven interface to manage car rentals.

---

## ✨ Features
- View available cars
- Rent a car
- Return a car
- Dynamic price calculation
- Menu-driven console system
- Supports multiple vehicle types

---

## 🛠 Technologies Used
- Java
- OOP (Encapsulation, Abstraction, Inheritance, Polymorphism)
- ArrayList
- IntelliJ IDEA
- Git & GitHub

---

## 🧠 OOP Concepts Used

| Pillar | Implementation |
|--------|----------------|
| Encapsulation | Private fields in `Customer` |
| Abstraction | `abstract class Vehicle` |
| Inheritance | `Car` and `LuxuryCar` extend `Vehicle` |
| Polymorphism | Overridden `calculatePrice()` |

---

## 📁 Project Structure
src/  
├── model/  
│   ├── Vehicle.java  
│   ├── Car.java  
│   ├── LuxuryCar.java  
│   ├── Customer.java  
│   └── Rental.java  
├── service/  
│   └── CarRentalSystem.java  
└── Main.java  

## Sample Console Output

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit
Enter choice: 1

--- Available Cars ---  
C1 - Toyota Innova  
C2 - Honda City  
C3 - Hyundai Creta  
L1 - BMW X5  
L2 - Audi A6  

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit
Enter choice: 2

--- Available Cars ---  
C1 - Toyota Innova  
C2 - Honda City  
C3 - Hyundai Creta  
L1 - BMW X5  
L2 - Audi A6  

Enter Vehicle ID: L2  
Enter your name: Esha  
Enter number of days: 2  
Customer: Esha  
Vehicle: Audi A6  
Days: 2  
Price per day: 5000.0  
Total Price: ₹10000.0  

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit
Enter choice: 1
--- Available Cars ---  
C1 - Toyota Innova  
C2 - Honda City  
C3 - Hyundai Creta  
L1 - BMW X5  
L2 - Audi A6  

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit
   
Enter choice: 3  
Enter Vehicle ID to return: L6  
❌ Invalid car ID or car already available.  

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit

Enter choice: 3  
Enter Vehicle ID to return: L2  
✅ Car returned successfully.  

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit
Enter choice: 1

--- Available Cars ---  
C1 - Toyota Innova  
C2 - Honda City  
C3 - Hyundai Creta  
L1 - BMW X5  
L2 - Audi A6  

====== 🚗 Car Rental System ======
1. View Available Cars
2. Rent a Car
3. Return a Car
4. Exit
Enter choice: 4
   ====== 👋 Thank you! ======

Process finished with exit code 0
