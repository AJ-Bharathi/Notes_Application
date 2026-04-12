package org.example;
import java.util.Scanner;

public class Main {
    public static Scanner sc= new Scanner(System.in);
    public static int currentUser=0;
    public static void Menu() {
        System.out.println("\n---Notes Application---\n");
        System.out.println("MENU");
        System.out.println("1. Register User\n2. Login User\n3. Create Notes\n4. Update Notes\n5. Search Notes\n6. Read Notes\n7. Delete Notes\n8. Logout\n9. Close Application\n");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
            UserService userService=new UserService();
            NoteService noteService =new NoteService();
            boolean isLoop=true;
            while(isLoop) {
                Menu();
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        userService.registerUser(sc);
                        break;
                    case 2:
                        currentUser=userService.loginUser(sc);
                        break;
                    case 3:
                        noteService.createNotes(sc, currentUser);
                        break;
                    case 4:
                        noteService.UpdateNotes(sc, currentUser);
                        break;
                    case 5:
                        noteService.searchNotes(sc, currentUser);
                        break;
                    case 6:
                        noteService.readNotes(sc, currentUser);
                        break;
                    case 7:
                        noteService.deleteNotes(sc, currentUser);
                        break;
                    case 8:
                        currentUser=userService.logoutUser();
                        break;
                    case 9:
                        System.out.println("Closing Application");
                        isLoop=false;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }
