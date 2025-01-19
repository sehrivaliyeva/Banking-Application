# Banking Application

This project is a comprehensive **Banking Application** developed using the **Spring Framework**. 
The application provides core banking functionalities, user account management, various banking operations, email notifications via SMTP, and database integration for persistent storage.

## Features

1. **User Management**  
   - Create and manage users with different account types.

2. **Banking Operations**  
   - Credit processing.  
   - Cash withdrawal and deposits.  
   - Fund transfers between accounts.  
   - Transaction logging for accountability.

3. **SMTP Email Notifications**  
   - Send transaction details and notifications to users via email.

4. **Account Management**  
   - Create and manage multiple accounts per user.

5. **Database Integration**  
   - Persistent storage of users, accounts, and transaction records using **MySQL**.

6. **API Documentation**  
   - Integrated **Swagger UI** for easy access to API endpoints and their usage.

7. **PDF Generation**  
   - Generate reports or transaction summaries in PDF format using **iTextPDF**.

---

## Technologies Used

### Frameworks & Libraries
- **Spring Boot**
  - Spring Data JPA
  - Spring Web
  - Spring Boot DevTools
  - Spring Mail

- **Lombok**  
  For reducing boilerplate code (e.g., getters, setters, constructors).

- **SpringDoc**  
  For generating Swagger UI and OpenAPI documentation.

- **iTextPDF**  
  For generating PDF reports.

### Database
- **MySQL**  
  For storing user, account, and transaction details.

---

## Prerequisites

- **Java 17** 
- **Maven**
- **MySQL Database**
- A valid **SMTP server** configuration for email notifications.

---

## Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
