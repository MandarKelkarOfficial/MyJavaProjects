/**Orignal Program by Mandar Kelkar */
import java.util.Scanner;
class Entry{
    Scanner sc = new Scanner(System.in);
    public void display() {
          System.out.println("Enter your name");
          String s =sc.nextLine();    
          System.out.println("Enter your token number");
          int a=sc.nextInt();
          System.out.println("Enter the catagoary number of which you want books of: \npress 1 for comics.\npress 2 for novels \npress 3 for Literatures.");
          int choice =sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter the code no of book you want :  \n01 Superman      05 Batman\n02 Spider-man    06 X-man\n03 The phantom   07 Capten America\n04 Spawn         18 Diabolik\n");
                    int choice1=sc.nextInt();
                    switch (choice1) {
                            case 01:
                            System.out.println("test");
                            break;
                            case 02:
                            System.out.println("test");
                            break;
                            case 03:
                            System.out.println("test");
                            break;
                            case 04:
                            System.out.println("test");
                            break;
                            case 05:
                            System.out.println("test");
                            break;
                            case 06:
                            System.out.println("test");
                            break;
                            case 07:
                            System.out.println("test");
                            break;
                            case 18:
                            System.out.println("test");
                            break;
                        default:
                        System.out.println("The choice you have entered does not exists");
                            break;
                    }
                    break;
                case 2:
                System.out.println("Enter the code no of book you want \n001 Anna Karenina.\n002 Greta Garbo in Anna Karenina. \n003 To Kill a Mockingbird. \n004 To Kill a Mockingbird. \n005 The Great Gatsby. F. \n006 One Hundred Years of Solitude. \n007 A Passage to India. \n108 Invisible Man. \n109 Don Quixote Beloved.\n");
                    int choice2=sc.nextInt();
                    switch (choice2) {
                        case 001:
                        System.out.println("test");
                        break;
                        case 002:
                        System.out.println("test");
                        break;
                        case 003:
                        System.out.println("test");
                        break;
                        case 004:
                        System.out.println("test");
                        break;
                        case 005:
                        System.out.println("test");
                        break;
                        case 006:
                        System.out.println("test");
                        break;
                        case 007:
                        System.out.println("test");
                        break;  
                        case 108:
                        System.out.println("test");
                        break;
                        case 109:
                        System.out.println("test");
                        break;
                    default:
                    System.out.println("The choice you have entered does not exists");
                        break;
                }

                    break;
                case 3:
                System.out.println("Enter the code no of book you want :");
                    int choice3=sc.nextInt();
                    switch (choice3) {
                        case 01:
                        System.out.println("test");
                        break;
                        case 02:
                        System.out.println("test");
                        break;
                        case 03:
                        System.out.println("test");
                        break;
                        case 04:
                        System.out.println("test");
                        break;
                        case 05:
                        System.out.println("test");
                        break;
                        case 06:
                        System.out.println("test");
                        break;
                        case 07:
                        System.out.println("test");
                        break;
                        case 18:
                        System.out.println("test");
                        break;
                    default:
                    System.out.println("The choice you have entered does not exists");
                        break;
                }
                    

                    break;
            
                default:
                System.out.println("OOPS! ... wrong choice your entry has been terminated");
                    break;
            }    
    }
}
class BookRegistration{
    public static void main(String[] args) {
        Entry e = new Entry();
        e.display();
    }
}