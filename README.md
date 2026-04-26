# Notes Management System (Java Console App)

  A simple Java-based console application to manage personal notes with user authentication.
  Built using Object-Oriented Programming (OOP) principles and clean design practices.

# Features
     - User registration and login
     - Create, update, and delete notes
     - Search notes by title
     - View individual notes or all notes
     - Notes are user-specific (each user can access only their own notes)
      
# Concepts Used
    This project demonstrates the use of core Object-Oriented Programming principles:

       - Encapsulation
       - Data members are private and accessed via getters/setters
       - Abstraction
       - Business logic separated into service classes (UserService, NoteService)
       - Separation of Concerns
       - Clear division between:
       - Models (data)
       - Services (logic)
       - Main (application flow)
       - Polymorphism (Basic Level)
       - Different methods performing operations on the same object
      
# Project Structure

      src/
       ├── model/
       │    ├── User.java
       │    └── Note.java
       ├── service/
       │    ├── UserService.java
       │    └── NoteService.java
       └── Main.java
       
# How to Run

      1. Clone the repository
      2. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)
      3. Run the Main.java file
      
# Sample Output
    ---Notes Application---
    
    MENU
    1. Register User
    2. Login User
    3. Create Notes
    4. Update Notes
    5. Search Notes
    6. Read Notes
    7. Delete Notes
    8. Logout
    9. Close Application
    
    Enter your choice: 3
    Enter the title of notes: Deadlock
    Enter the content of notes: Two or more processes waiting for each other's resources to complete their tasks.
    Notes created Successfully!

# Screenshots

<img width="1919" height="1015" alt="image" src="https://github.com/user-attachments/assets/1f62ff10-1b8e-40d0-8a06-4878d837bbdc" />


<img width="661" height="484" alt="Screenshot 2026-04-12 165328" src="https://github.com/user-attachments/assets/9f023ea8-31d1-4f48-b1e7-00c681f2700b" />

# Learning Outcome

    - Understood how to design applications using OOP principles
    - Implemented authentication logic
    - Built a menu-driven system with clean architecture
    - Learned separation between data, logic, and control flow
    
# Future Improvements

    - Store data in a database instead of memory
    - Add a GUI or web interface
    - Improve search functionality

# Author

Abarna Jeyabharathi L

# Support

If you like this project, give it a **star ⭐ on GitHub**.
