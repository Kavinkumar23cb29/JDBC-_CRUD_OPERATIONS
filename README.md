# 🚗 Vehicle Management System (Java JDBC)

A simple **Vehicle Management System** developed using **Java**, **JDBC**, and **MySQL**. This is a menu-driven console application that demonstrates CRUD (Create, Read, Update, Delete) operations using JDBC.

---

## 📌 Features

- 🔍 Get Vehicle by ID
- 🏢 Get Vehicles by Company
- ✏️ Update Vehicle Details
- ❌ Delete Vehicle
- 📋 Display All Vehicles
- 🚪 Exit Application

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA / Eclipse
- MySQL Connector J

---

## 📂 Project Structure

```
VehicleManagementSystem/
│
├── src/
│   └── Class_Vehicle.java
│
├── mysql-connector-j.jar
│
└── README.md
```

---

## 🗄️ Database Setup

### Create Database

```sql
CREATE DATABASE training;
USE training;
```

### Create Table

```sql
CREATE TABLE vehicle(
    vehicle_id INT PRIMARY KEY,
    vehicle_model VARCHAR(100),
    vehicle_company VARCHAR(100)
);
```

### Sample Data

```sql
INSERT INTO vehicle VALUES
(101,'Creta','Hyundai'),
(102,'Swift','Maruti'),
(103,'City','Honda'),
(104,'Fortuner','Toyota'),
(105,'Nexon','Tata');
```

---

## ⚙️ JDBC Configuration

Update the following values in your Java program.

```java
String url = "jdbc:mysql://localhost:3306/training";
String user = "root";
String password = "your_password";
```

---

## 📜 Menu

```
VEHICLE MANAGEMENT SYSTEM

1. Get Vehicle By ID
2. Get Vehicle By Company
3. Update Vehicle
4. Delete Vehicle
5. Get All Vehicles
6. Exit
```

---

## 💻 CRUD Operations

### Read Vehicle by ID

Searches for a vehicle using its ID.

Example

```
Enter Vehicle ID : 101
```

Output

```
Vehicle Details

Vehicle ID      : 101
Vehicle Model   : Creta
Vehicle Company : Hyundai
```

---

### Read Vehicle by Company

Displays all vehicles belonging to a particular company.

Example

```
Enter Company Name : Hyundai
```

Output

```
Vehicle ID      : 101
Vehicle Model   : Creta
Vehicle Company : Hyundai
```

---

### Update Vehicle

Updates the model and company of an existing vehicle.

Example

```
Enter Vehicle ID : 101
Enter New Model : Verna
Enter New Company : Hyundai
```

Output

```
Vehicle Updated Successfully.
```

---

### Delete Vehicle

Deletes a vehicle using its ID.

Example

```
Enter Vehicle ID to Delete : 101
```

Output

```
Vehicle Deleted Successfully.
```

---

### Display All Vehicles

Displays every record in the database.

Example

```
--------------------------------------------------------
ID         MODEL           COMPANY
--------------------------------------------------------
101        Creta           Hyundai
102        Swift           Maruti
103        City            Honda
104        Fortuner        Toyota
105        Nexon           Tata
```

---

## 📚 JDBC Concepts Used

- DriverManager
- Connection
- PreparedStatement
- ResultSet
- SQL Queries
- Exception Handling
- Switch Case
- Scanner Class

---

## 🎯 Learning Outcomes

After completing this project, you will understand:

- JDBC Connectivity
- CRUD Operations
- PreparedStatement
- ResultSet Navigation
- Menu Driven Programs
- SQL Queries
- Java Exception Handling

---

## 🚀 Future Enhancements

- Insert New Vehicle
- Search by Model
- Delete All Records
- Input Validation
- Search using Partial Names
- GUI using Java Swing/JavaFX
- Maven Project
- Logging
- Layered Architecture (DAO Pattern)

---

## 👨‍💻 Author

**Kavin Kumar**

Computer Science and Business Systems Student

GitHub: https://github.com/your-username

LinkedIn: https://linkedin.com/in/your-profile

---

⭐ If you found this project helpful, don't forget to star the repository!
