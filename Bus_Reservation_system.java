/**Original Bus_Reservation_system program by Mandar.Kelkar */
import java.util.Scanner;
class Bus_Reservation_system{
    Scanner sc = new Scanner(System.in);
    public void display(){
        System.out.println("Enter your destination: \n1.From Mumbai to Pune\n2.From Pune to Delhi\n3.From Mumbai to Malvan\n4.From Chennai to Kolhapur");
        int choice = sc.nextInt();
             switch (choice){
                 case 1:
                     System.out.println("Please select time slot for you journey Mumbai to pune  10 am,11 am, 12 pm");
                     int a = sc.nextInt();
                         switch (a) {
                              case 10:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 11:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 12:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                          
                              default:
                                  System.out.println("Not available");
                                  break;
                                   }

                                   System.out.println("How do you intend pay . Please select from options\n<<List of amount payable per person\n\n1.From Mumbai to Pune pay = Rs.400/");
                                   System.out.println("\nPress '1' for Razor pay \nPress '2' for Paytm\nPress '3' for Gpay.");
                                   int choice1 = sc.nextInt();
                                   switch (choice1) {
                                       case 1:// Razor pay code
                                           System.out.println("Enter your Family members\n");
                                           int amount=sc.nextInt();
                                           int total = amount*400;
                                           System.out.println("Enter your mobile number\n");
                                           double phonenumber=sc.nextDouble();
                                           System.out.println("Your phone number"+phonenumber);
                                           System.out.println("Enter last four digits of your Account number\n");
                                           int Accountnum = sc.nextInt();
                                           System.out.println("Processing......\nBing! yor payment was sucessful.\n Your total bill is "+ total);
                                           break;
                                       case 2://paytm code
                                           System.out.println("Enter your Family members\n");
                                           int amount1=sc.nextInt();
                                           int total3= amount1*400;
                                           System.out.println("Enter your mobile number\n");
                                           double phonenumber2=sc.nextDouble();
                                           System.out.println("Your phone number"+phonenumber2);
                                           System.out.println("Enter last four digits of your Account number\n");
                                           int Accountnum2 = sc.nextInt();
                                           System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total3);   
                                           break;
                                       case 3://Gpay code
                                           System.out.println("Enter your mobile number\n");
                                           double  phonenumber4=sc.nextDouble();
                                           System.out.println("Your phone number"+phonenumber4);
                                           System.out.println("Enter your members");
                                           int mrm = sc.nextInt();
                                           int total2=mrm*400;
                                           System.out.println("Enter last four digits of your Account number\n");
                                           int Accountnum22 = sc.nextInt();
                                           System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total2);    
                                           break;
                                       default:
                                           System.out.println("OOps ! wrong option . case terminated.");
                                           break;
                                   }
                    break;
                 case 2:
                     System.out.println("Please select time slot for you journey  Pune to Delhi 10 am,11 am, 12 pm");
                     int b = sc.nextInt();
                         switch (b) {
                              case 10:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 11:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 12:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                     
                              default:
                                  System.out.println("Not available");
                                  break;
                                     }

                                     System.out.println("How do you intend pay . Please select from options\n<<List of amount payable per person\n\n2.From Pune to Delhi pay Rs.600/-\n");
                                     System.out.println("\nPress '1' for Razor pay \nPress '2' for Paytm\nPress '3' for Gpay.");
                                     int choice2 = sc.nextInt();
                                     switch (choice2) {
                                         case 1:// Razor pay code
                                             System.out.println("Enter your Family members\n");
                                             int amount4=sc.nextInt();
                                             int total4 = amount4*600;
                                             System.out.println("Enter your mobile number\n");
                                             double phonenumber4=sc.nextDouble();
                                             System.out.println("Your phone number"+phonenumber4);
                                             System.out.println("Enter last four digits of your Account number\n");
                                             int Accountnum4 = sc.nextInt();
                                             System.out.println("Processing......\nBing! yor payment was sucessful.\n Your total bill is "+ total4);
                                             break;
                                         case 2://paytm code
                                             System.out.println("Enter your Family members\n");
                                             int amount5=sc.nextInt();
                                             int total35= amount5*600;
                                             System.out.println("Enter your mobile number\n");
                                             double phonenumber5=sc.nextDouble();
                                             System.out.println("Your phone number"+phonenumber5);
                                             System.out.println("Enter last four digits of your Account number\n");
                                             int Accountnum5 = sc.nextInt();
                                             System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total35);   
                                             break;
                                         case 3://Gpay code
                                             System.out.println("Enter your mobile number\n");
                                             double  phonenumber6=sc.nextDouble();
                                             System.out.println("Your phone number"+phonenumber6);
                                             System.out.println("Enter your mambers");
                                             int mrm23 = sc.nextInt();
                                             int total26=mrm23*600;
                                             System.out.println("Enter last four digits of your Account number\n");
                                             int Accountnum226 = sc.nextInt();
                                             System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total26);    
                                             break;
                                         default:
                                             System.out.println("OOps ! wrong option . case terminated.");
                                             break;
                                     }
                    break;
                 case 3:
                     System.out.println("Please select time slot for you journey  Mumbai to Malvan 10 am,11 am, 12 pm");
                     int c = sc.nextInt();
                         switch (c) {
                              case 10:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 11:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 12:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                     
                              default:
                                 System.out.println("Not available");
                                 break;
                                    }

                                    System.out.println("How do you intend pay . Please select from options\n<<List of amount payable per person\n\n3.From Mumbai to Malvan pay Rs.300/-\n");
                                    System.out.println("\nPress '1' for Razor pay \nPress '2' for Paytm\nPress '3' for Gpay.");
                                    int choice3 = sc.nextInt();
                                    switch (choice3) {
                                        case 1:// Razor pay code
                                            System.out.println("Enter your Family members\n");
                                            int amount43=sc.nextInt();
                                            int total43 = amount43*300;
                                            System.out.println("Enter your mobile number\n");
                                            double phonenumber43=sc.nextDouble();
                                            System.out.println("Your phone number"+phonenumber43);
                                            System.out.println("Enter last four digits of your Account number\n");
                                            int Accountnum43 = sc.nextInt();
                                            System.out.println("Processing......\nBing! yor payment was sucessful.\n Your total bill is "+ total43);
                                            break;
                                        case 2://paytm code
                                            System.out.println("Enter your Family members\n");
                                            int amount53=sc.nextInt();
                                            int total353= amount53*300;
                                            System.out.println("Enter your mobile number\n");
                                            double phonenumber53=sc.nextDouble();
                                            System.out.println("Your phone number"+phonenumber53);
                                            System.out.println("Enter last four digits of your Account number\n");
                                            int Accountnum53 = sc.nextInt();
                                            System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total353);   
                                            break;
                                        case 3://Gpay code
                                            System.out.println("Enter your mobile number\n");
                                            double  phonenumber64=sc.nextDouble();
                                            System.out.println("Your phone number"+phonenumber64);
                                            System.out.println("Enter your mambers");
                                            int mrm4 = sc.nextInt();
                                            int total264=mrm4*300;
                                            System.out.println("Enter last four digits of your Account number\n");
                                            int Accountnum2264 = sc.nextInt();
                                            System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total264);    
                                            break;
                                        default:
                                            System.out.println("OOps ! wrong option . case terminated.");
                                            break;
                                    }
                    break;
                 case 4:
                    System.out.println("Please select time slot for you journey Chennai to Kolhapur 10 am,11 am, 12 pm"); 
                    int d = sc.nextInt();
                          switch (d) {
                              case 10:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 11:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                              case 12:
                                  System.out.println("You have selected the time slot please fill up the following details");
                                  break;
                          
                              default:
                                  System.out.println("Not available");
                                  break;
                                     }

                                     System.out.println("How do you intend pay . Please select from options\n<<List of amount payable per person\nFrom Chennai to Kolhapur pay Rs.800/-\n");
                                     System.out.println("\nPress '1' for Razor pay \nPress '2' for Paytm\nPress '3' for Gpay.");
                                     int choice4 = sc.nextInt();
                                     switch (choice4) {
                                         case 1:// Razor pay code
                                             System.out.println("Enter your Family members\n");
                                             int amount435=sc.nextInt();
                                             int total435 = amount435*800;
                                             System.out.println("Enter your mobile number\n");
                                             double phonenumber435=sc.nextDouble();
                                             System.out.println("Your phone number"+phonenumber435);
                                             System.out.println("Enter last four digits of your Account number\n");
                                             int Accountnum435 = sc.nextInt();
                                             System.out.println("Processing......\nBing! yor payment was sucessful.\n Your total bill is "+ total435);
                                             break;
                                         case 2://paytm code
                                             System.out.println("Enter your Family members\n");
                                             int amount536=sc.nextInt();
                                             int total3536= amount536*800;
                                             System.out.println("Enter your mobile number\n");
                                             double phonenumber536=sc.nextDouble();
                                             System.out.println("Your phone number"+phonenumber536);
                                             System.out.println("Enter last four digits of your Account number\n");
                                             int Accountnum536 = sc.nextInt();
                                             System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total3536);   
                                             break;
                                         case 3://Gpay code
                                             System.out.println("Enter your mobile number\n");
                                             double  phonenumber647=sc.nextDouble();
                                             System.out.println("Your phone number"+phonenumber647);
                                             System.out.println("Enter your mambers");
                                             int mrm47 = sc.nextInt();
                                             int total2647=mrm47*800;
                                             System.out.println("Enter last four digits of your Account number\n");
                                             int Accountnum22647 = sc.nextInt();
                                             System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total2647);    
                                             break;
                                         default:
                                             System.out.println("OOps ! wrong option . case terminated.");
                                             break;
                                     }
                    break;    
                
                 default:
                 System.out.println("OOPS! Wrong choice . Please select between 1 to 4");
                    break;
                    }

                    /*Main block for online payment..... This same block is used in every case only variables are changed */

 //--------------------------------------------------------------------------------------------------------------------------------------                
           /*     System.out.println("How do you intend pay . Please select from options\n<<List of amount payable per person\n\n1.From Mumbai to Pune pay = Rs.400/-\n2.From Pune to Delhi pay Rs.400/-\n3.From Mumbai to Malvan pay Rs.400/-\n4.From Chennai to Kolhapur pay Rs.400/-\nEnd of the list>>");
                System.out.println("\nPress '1' for Razor pay \nPress '2' for Paytm\nPress '3' for Gpay.");
                int choice4 = sc.nextInt();
                switch (choice4) {
                    case 1:// Razor pay code
                        System.out.println("Enter your Family members\n");
                        int amount435=sc.nextInt();
                        int total435 = amount435*400;
                        System.out.println("Enter your mobile number\n");
                        double phonenumber435=sc.nextDouble();
                        System.out.println("Your phone number"+phonenumber435);
                        System.out.println("Enter last four digits of your Account number\n");
                        int Accountnum435 = sc.nextInt();
                        System.out.println("Processing......\nBing! yor payment was sucessful.\n Your total bill is "+ total435);
                        break;
                    case 2://paytm code
                        System.out.println("Enter your Family members\n");
                        int amount536=sc.nextInt();
                        int total3536= amount536*400;
                        System.out.println("Enter your mobile number\n");
                        double phonenumber536=sc.nextDouble();
                        System.out.println("Your phone number"+phonenumber536);
                        System.out.println("Enter last four digits of your Account number\n");
                        int Accountnum536 = sc.nextInt();
                        System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total3536);   
                        break;
                    case 3://Gpay code
                        System.out.println("Enter your mobile number\n");
                        double  phonenumber647=sc.nextDouble();
                        System.out.println("Your phone number"+phonenumber647);
                        System.out.println("Enter your mambers");
                        int mrm47 = sc.nextInt();
                        int total2647=mrm47*400;
                        System.out.println("Enter last four digits of your Account number\n");
                        int Accountnum22647 = sc.nextInt();
                        System.out.println("Processing......\nBing! yor payment was sucessful.\nYour total bill is "+total2647);    
                        break;
                    default:
                        System.out.println("OOps ! wrong option . case terminated.");
                        break;
                }*/      
/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
            }
     public void PersonalDetails(){
                         System.out.println("Enter your name: ");
                         String name = sc.nextLine();
                         System.out.println("Enter your mobile number: ");
                         double number=sc.nextDouble();
                         System.out.println("Enter your Family members");
                         int num=sc.nextInt();
                         System.out.println("Enter the date in ddmmyyyy format without any slash or dash.");
                         int date =sc.nextInt();
                         System.out.println("Do you want retun ticket?.\nIf yess press 1 or press 2 to no");
                         int rt =sc.nextInt();
                         if(rt==1){
                            System.out.println("Please Enter when you want return ticket in ddmmyyyy format without any slash or dash and members");
                            int rts=sc.nextInt();
                            int mem=sc.nextInt();
                         }else
                         {
                            System.out.println("Please proced to next details");
                         }
     }
                        
    public static void main(String[] args) { 
        
        Bus_Reservation_system a = new Bus_Reservation_system();
        Bus_Reservation_system b = new Bus_Reservation_system();
       a.PersonalDetails();
       b.display();

    }
}
