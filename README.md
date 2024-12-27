# Dompet Pintar

## Overview
**Dompet Pintar** is a smart wallet application developed using **Java** and a **phpMyAdmin** database. The system is designed to provide essential features for financial transactions, including balance management, top-ups, and payments. With a user-friendly interface and a reliable backend, the application offers a seamless and secure experience for users.

This project involves a thorough system analysis to identify both functional and non-functional requirements, ensuring that the application meets the needs of its users. Key features include user registration, secure login, mathematical operations for balance calculation, and high system performance.

## Features

### Functional Requirements
- **User Login**: Secure authentication using username and password.
- **Account Registration**: Allows new users to create an account.
- **Transaction Management**: Handles payment and top-up transactions.
- **Balance Calculation**: Performs mathematical operations to update the user’s balance.

### Non-Functional Requirements
- **Performance**: Ensures the application runs efficiently with minimal latency.
- **Security**: Protects user data, including passwords and transaction details.
- **Usability**: Provides an intuitive and user-friendly interface.

## Database Design

### Database Name: `dbakun`
**Table Name**: `tbldata`
- `username`: Stores the username of the user.
- `email`: Stores the email address of the user.
- `password`: Stores the hashed password for secure authentication.
- `balance`: Stores the user's account balance.

## Tools & Technology Stack
- **NetBeans IDE 17**: For Java development.
- **XAMPP**: To set up the local server and manage the phpMyAdmin database.
- **phpMyAdmin/MySQL**: Used to design and manage the database.
- **Figma**: For UI/UX design and schematic diagrams.

## Getting Started

### Prerequisites
1. Install **NetBeans IDE 17**.
2. Set up **XAMPP** to host the MySQL database.
3. Clone this repository:
   ```bash
   git clone https://github.com/Zidsly/Java-CRUD-E-Wallet.git
