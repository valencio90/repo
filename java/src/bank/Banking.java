package bank;
import java.util.*;

/**
 * The Banking class represents a basic bank account with functionality for
 * getting user details, displaying account details, withdrawing money, and
 * depositing money.
 * 
 * @author valencio
 *
 */
public class Banking {

    int acNo;
    String name;
    int age;
    String address;
    long contactNo;
    int initialBalance = 0;

    Scanner input = new Scanner(System.in);

    /**
     * Gets user details including account number, name, age, address, and contact
     * number.
     */
    public void getUserDetails() {
        System.out.print("Enter account number:");
        acNo = input.nextInt();
        System.out.print("Enter user name:");
        name = input.next();
        System.out.print("Enter age:");
        age = input.nextInt();
        System.out.print("Enter address:");
        address = input.next();
        System.out.println("Enter contact number:");
        contactNo = input.nextLong();
    }

    /**
     * Displays the account details including account number, name, age, address,
     * contact number, and initial balance.
     */
    public void displayAccountDetails() {
        System.out.print("Account number:" + acNo + "\nName:" + name + "\nAge:" + age + "\nAddress:" + address
                + "\nContact number:" + contactNo + "\nInitial balance:" + initialBalance + "\n");
    }

    /**
     * Withdraws money from the account if the initial balance is greater than 0.
     * 
     * @throws IllegalArgumentException if the initial balance is empty.
     */
    public void withdrawAmount() {
        if (initialBalance <= 0) {
            throw new IllegalArgumentException("Bank balance is empty");
        } else {
            int withdraw = 0;
            System.out.print("How much money do you want to withdraw:");
            withdraw = input.nextInt();
            initialBalance = initialBalance - withdraw;
            System.out.print("Withdrawn " + withdraw+"\n");
            System.out.println("initial amount after withdrawing "+initialBalance+"\n");
        }
    }

    /**
     * Deposits money into the account.
     * 
     * @param deposit The amount to be deposited.
     */
    public void depositAmount(int deposit) {
        initialBalance += deposit;
        System.out.println(deposit + " deposited\n");
        System.out.println("initial amount after depositing "+initialBalance+"\n");
    }
}
