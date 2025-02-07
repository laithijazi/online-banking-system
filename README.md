# Online Banking System

## Object-Oriented Programming

### Fall 24-25

--- 

## Project Overview

### **Project Information:**
- The **Online Banking System** is a digital platform designed to simulate core banking functionalities.
- **Purpose**: To provide a user-friendly and secure platform for banking operations such as deposit, withdrawal, and transfer.
- **Target Audience**: Administrators and Account Holders.

### **Problem Statement:**
- Provides a digital solution for managing bank accounts and performing financial operations.
- Eliminates the need for physical visits to the bank, allowing users to manage their finances easily and securely online.

---

## **System Architecture**

### **Class Diagram:**
Illustrates relationships between **User, Account, Transaction, and BankSystem** classes.

<img width="605" alt="Screenshot 2025-02-07 at 4 53 25 PM" src="https://github.com/user-attachments/assets/f24e728d-8fe7-4347-a219-e9a4a16faf3d" />

---

## **Key Features**

1. **User Management**: 
   - Admins can create and manage users.
   - Users can securely log in using their credentials.
2. **Account Management**:
   - Users can create accounts linked to their profiles.
   - Users can manage their balances.
3. **Financial Transactions**:
   - Deposit money, withdraw, and transfer to other accounts.
4. **Transaction History**:
   - Keeps a detailed record of all transactions.
   - Users can view their transaction history.
5. **Admin Tools**:
   - View registered users, created accounts, and transactions.

---

## **OOP Concepts Implemented**

1. **Classes and Objects:**
   - `User` class for user details (name, email, password) and authentication.
   - `Account` class for bank account management.
   - `Transaction` class for logging financial operations.
   - `BankSystem` as the controller managing all interactions.
   - `MainProgram` acts as the entry point handling user input through menus.
2. **Encapsulation:**
   - Private attributes (e.g., `userId`, `balance`) with getter/setter methods to protect data.
3. **Polymorphism:**
   - Overridden `toString()` method in `User`, `Account`, and `Transaction` classes for custom representations.
4. **Abstraction:**
   - Achieved by hiding implementation details in methods like `deposit()`, `withdraw()`, and `transfer()`.
   - `BankSystem` class acts as the central point for all operations.

---

## **Evaluation of OOP Concepts**

1. **Classes & Objects:**
   - Well-organized classes with clear responsibilities.
   - `User` for user details, `Account` for account management, `Transaction` for recording transactions, and `BankSystem` for overall management.
    
2. **Encapsulation:**
   - Private attributes (e.g., `userId`, `balance`) with getter/setter methods to protect data.
   
   **In User class:**
   
    <img width="278" alt="Screenshot 2025-02-07 at 4 53 56 PM" src="https://github.com/user-attachments/assets/3ae0c712-586c-4def-8688-f3f019d9501d" />

   **In Account class:**
   
    <img width="561" alt="Screenshot 2025-02-07 at 4 54 06 PM" src="https://github.com/user-attachments/assets/d388a372-2c24-49b6-adf8-f1f7616d6bb6" />
   
4. **Polymorphism:**
   - Overridden `toString()` method in `User`, `Account`, and `Transaction` classes for custom representations.
   
   **In User class:**
    <img width="952" alt="Screenshot 2025-02-07 at 4 54 16 PM" src="https://github.com/user-attachments/assets/2e1fc2b6-10f1-4b3b-8f11-e255073229fa" />
   
   **In Account class:**
    <img width="953" alt="Screenshot 2025-02-07 at 4 54 27 PM" src="https://github.com/user-attachments/assets/e5cf12c9-fad6-4d62-af7f-f5ad3310680d" />

5. **Abstraction:**
   - Simplified user interaction methods to abstract away internal logic.
  
---

## **Challenges Faced**

1. **Ensuring smooth interaction between classes**
   - **Solution**: Used UML diagrams for clarity.
2. **Addressing invalid inputs and edge cases**
   - **Solution**: Implemented `try-catch` blocks and input validation.
3. **Managing transaction logs with file I/O**
   - **Solution**: Utilized `FileWriter` and handled scenarios like missing files.

---

## **Code Generator Tools**

- **Tool Used**: Visual Studio Code's Source Actions Feature
- **Benefits**:
  - Automatically generated setters, getters, and constructors.
  - Saved development time and improved efficiency.

---

## **Project Screenshots**

- **Main Menu**: User and admin login interface.
<img width="609" alt="Screenshot 2025-02-07 at 4 55 05 PM" src="https://github.com/user-attachments/assets/f7edcf36-9d83-42f3-abda-539de3dccb6e" />

- **Admin Menu**: Options for managing users and accounts.
<img width="379" alt="Screenshot 2025-02-07 at 4 55 27 PM" src="https://github.com/user-attachments/assets/426d63fb-7410-4500-9a7a-71e39ce790d0" />

- **User Menu**: Functions for checking balance, deposits, withdrawals, transfers, and viewing transaction history.
<img width="387" alt="Screenshot 2025-02-07 at 4 55 39 PM" src="https://github.com/user-attachments/assets/a9e5d2fd-c234-4335-bd0a-554f0cbcc173" />


---

## **Conclusion**

- The project demonstrates effective use of OOP principles.
- Simplifies real-world banking operations through modular design.
- **Future Enhancements**:
  - Integrate a database for persistent storage.
  - Improve UI/UX for better user experience.

---

**Student Name:** Laith Ismail Ahmed Hijazi  
**Student ID:** 64220039  
**Email:** laith.hijazi@std.medipol.edu.tr
