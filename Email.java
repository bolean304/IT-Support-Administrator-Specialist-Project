package Emailapp;

import java.util.Scanner;

public class Email {
        private String firstname;
        private String lastname;
        private String password;
        private String department;
        private int mailboxCapacity;
        private int defaultPasswordlength=10;
        private String alternateEmail;
        private String companySuffix="company.com";
        private String email;
        
        //Constructor to receive the first name and last name
        public Email(String firstname, String lastname) {
        	this.firstname=firstname;
        	this.lastname=lastname;
        	//System.out.println("Email created: "+this.firstname +" "+ this.lastname);
        	
        	//call a method asking for the department -return the department
        	this.department=setdepartment();
        	//System.out.print("Department: "+ this.department);
        	
        	//call a method that returns a random password
        	this.password=randomPassword(defaultPasswordlength);
        	System.out.println("\nyour password is: "+ password);	
        	
        	//combines elements to generate email
        	email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix; 
        	//System.out.println("Your email is:"+ email);
        			}
        
        //Ask for the department
        private String setdepartment(){
          System.out.println("New worker: "+firstname+ ". Department Codes\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter the department code");
          Scanner in=new Scanner(System.in);
          int depchoice=in.nextInt();
          if(depchoice==1) {return "sales";}
          else if (depchoice==2) {return "dev";}
          else if (depchoice==3) { return "acct";}
          else { return "";}
        }
        
        //Generate a random password
          private String randomPassword(int length) {
        	  String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        	  char[] password=new char[length];
        	  for(int i=0;i<length;i++) {
        	 int rand=(int)(Math.random() * passwordset.length());
        	 password[i]=passwordset.charAt(rand);
        	  }
        	  return new String(password);
          }
        
        //set the mailbox capacity
          public void setMailboxCapacity(int capacity) {
        	  this.mailboxCapacity=capacity;
          }
        
        //set the alternate mail
          public void setAlternameEmail(String altEmail) {
        	  this.alternateEmail=altEmail;
          }
        
        //change the method
         public void changePassword(String password) {
        	 this.password=password;
         }
        public int getMailboxCapacity() {return mailboxCapacity;}
        public String getAlternateEmail() { return alternateEmail; }
        public String getPassword() { return password;}
        
        public String showinfo() {
        	return "DISPLAY NAME: "+firstname +" "+lastname+
        	       "\nCOMPANY EMAIL: "+email+
        	       "\nMAILBOX CAPACITY: "+ mailboxCapacity + "mb";
        }
} 
