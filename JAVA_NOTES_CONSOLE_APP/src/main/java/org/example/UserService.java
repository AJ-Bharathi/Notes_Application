package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class UserService {
    public static ArrayList<User> user=new ArrayList<>();
    public static HashSet<Integer> userIDs=new HashSet<>();
    private static Random random=new Random();
    public static int currentUser=0;
    public static void registerUser(Scanner sc)
    {
        System.out.print("Enter your username: ");
        String userName=sc.next();
        System.out.print("Enter your password: ");
        String password=sc.next();
        System.out.print("Enter your email: ");
        String email= sc.next();
        for(User u : user) {
            if(u.getEmail().equals(email)) {
                System.out.println("Email already exists!");
                return;
            }
        }
        int userID=userIDGenerator();
        User u= new User(userID,email,password,userName);
        if(user.add(u)) {
            System.out.println("Your User ID : " + userID);
            System.out.println("Registered Successfully!");
        }
        else
            System.out.println("Registration Failed!");
    }
    public static int userIDGenerator()
    {
        int userID=random.nextInt(100,200);
        while(true) {
            if (userIDs.add(userID)) {
                return userID;
            } else
                userID = random.nextInt(100, 200);
        }
    }
    public static int loginUser(Scanner sc)
    {
        System.out.print("Enter user ID: ");
        int userID=sc.nextInt();
        System.out.print("Enter password: ");
        String password=sc.next();
        for(User u:user) {
            if (u.getUserID()==userID && u.getPassword().equals(password)) {
                System.out.println("Welcome " + u.getUserName());
                return userID;
            }
        }
        System.out.println("Invalid credentials!");
        return 0;
    }
    public static int logoutUser() {
        System.out.println("Logged out Successfully!");
        return 0;
    }
}
