package org.example;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class NoteService {
    public static ArrayList<Notes> notes=new ArrayList<>();
    public static void createNotes(Scanner sc, int currentUser)
    {
        if(currentUser == 0) {
            System.out.println("Please login first!");
            return;
        }
        System.out.print("Enter the title of notes: ");
        String title=sc.next();
        sc.nextLine();

        System.out.print("Enter the content of notes: ");
        String content= sc.nextLine();

        Notes n=new Notes(title,content,currentUser);

        if(notes.add(n))
            System.out.println("Notes created Successfully!");
        else
            System.out.println("Failed to create notes:) ");

    }
    public static void UpdateNotes(Scanner sc, int currentUser) {

        System.out.print("Enter the title of notes: ");
        String title = sc.next();
        sc.nextLine();

        boolean updated=false;

        for (Notes n : notes) {
            if (n.getTitle().toLowerCase().contains(title.toLowerCase()) && n.getUserId() == currentUser) {
                System.out.println("Existing Content: " + n.getContent());
                System.out.println("New Content: ");
                String new_content = sc.nextLine();
                n.setContent(new_content);
                updated = true;
                break;
            }
        }
        System.out.println(updated ? "Content updated Successfully!" : "No such notes exist :)");
    }
    public static void deleteNotes(Scanner sc, int currentUser) {

        System.out.print("Enter the title of notes: ");
        String title = sc.next();

        Iterator<Notes> it=notes.iterator();

        while (it.hasNext()) {
            Notes n=it.next();
            if (n.getTitle().equalsIgnoreCase(title) && n.getUserId() == currentUser) {
                it.remove();
                System.out.println("Notes deleted Successfully!");
                return;
            }
        }
        System.out.println("No such notes exist :)");
    }
    public static void searchNotes(Scanner sc, int currentUser) {

        System.out.print("Enter the title of notes: ");
        String title = sc.next();

        for (Notes n : notes) {
            if (n.getUserId() == currentUser && n.getTitle().toLowerCase().contains(title.toLowerCase()) ) {
                System.out.println("Notes found!");
                System.out.println("Title: "+n.getTitle()+"\nContent: "+n.getContent());
                return;
            }
        }

        System.out.println("No such notes exist :)");
    }
    public static void readNotes(Scanner sc, int currentUser) {

        System.out.println("Reading the Notes\n");
        System.out.println("1. Read specific notes\n2. Read all notes");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();

        if(choice==1)
            readSingleNotes(sc,currentUser);
        else if(choice==2)
            readAllNotes(sc,currentUser);
        else
            System.out.println("Invalid choice!");

    }
    public static void readSingleNotes(Scanner sc, int currentUser) {
        System.out.print("Enter the title of notes: ");
        String title = sc.next();

        for (Notes n : notes) {
            if (n.getTitle().toLowerCase().contains(title.toLowerCase()) && n.getUserId() == currentUser) {
                System.out.println("Title: " + n.getTitle() + "\nContent: " + n.getContent());
                return;
            }
        }

        System.out.println("No such notes exist :)");
    }
    public static void readAllNotes(Scanner sc, int currentUser) {
        boolean found = false;
        for (Notes n : notes) {
            if (n.getUserId() == currentUser) {
                found = true;
                System.out.println("Title: " + n.getTitle() + "\nContent: " + n.getContent() + "\n");
            }
        }
        if (!found) System.out.println("No notes found!");
    }
}
