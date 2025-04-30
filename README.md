# Bank Management System

## Project Overview

The **Bank Management System** is a Java-based desktop application that simulates the core functionalities of a banking system. It provides users with a graphical user interface (GUI) to perform various banking operations such as deposits, withdrawals, balance inquiries, PIN changes, and more. The application is built using Java Swing for the GUI and connects to a database for storing and retrieving user data.

---

## Features

1. **User Authentication**:
   - Login using card number and PIN.
   - Sign-up functionality for new users.

2. **Banking Operations**:
   - Deposit money into the account.
   - Withdraw money from the account.
   - Fast cash withdrawal with predefined amounts.
   - Check account balance.
   - View mini statements of transactions.

3. **Account Management**:
   - Change account PIN.
   - Create new accounts with multiple account types (e.g., Savings, Current).

4. **Database Integration**:
   - All user and transaction data is stored in a database for persistence.

---

## Project Structure

The project is organized into the following modules:

- **Login**: Handles user authentication.
- **SignupOne, SignupTwo, SignupThree**: Multi-step process for new user registration.
- **Transactions**: Main dashboard for performing banking operations.
- **Deposit**: Module for depositing money.
- **Withdrawl**: Module for withdrawing money.
- **FastCash**: Quick withdrawal with predefined amounts.
- **BalanceEnquiry**: Displays the current account balance.
- **MiniStatement**: Shows recent transactions.
- **PinChange**: Allows users to change their account PIN.

---

## Technologies Used

- **Programming Language**: Java
- **GUI Framework**: Java Swing
- **Database**: MySQL (or any relational database)
- **Build Tool**: Java Compiler (JDK)

---

## How to Run the Project

1. **Prerequisites**:
   - Install Java Development Kit (JDK).
   - Install a MySQL database server.
   - Configure the database with the required schema and tables.

2. **Steps**:
   - Clone the repository to your local machine.
   - Open the project in an IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
   - Compile and run the `Login.java` file to start the application.
   - Ensure the database connection is properly configured in the `Conn` class.

---

## Database Schema

The project uses the following tables:

1. **login**:
   - Stores user credentials (card number and PIN).

2. **signup**:
   - Stores user personal details.

3. **bank**:
   - Stores transaction details (deposit, withdrawal).

4. **signupthree**:
   - Stores account type and facilities.

---

## Screenshots

- **Login Screen**:
  ![Login Screen](path/to/login-screenshot.png)

- **Transaction Dashboard**:
  ![Transaction Dashboard](path/to/transaction-screenshot.png)

---

## Future Enhancements

- Add support for online banking features.
- Implement email and SMS notifications for transactions.
- Enhance security with encryption for sensitive data.
- Add support for multiple currencies.

---

## Contributors

- **Developer**: [Your Name]
- **Mentor**: [Mentor Name]

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.