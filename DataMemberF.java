import java.util.Scanner;

public class DataMemberF {

    String name, address, subject_spec;
    int phone;
    float month_sal, Income_tax;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.print("Enter name = ");
        name = sc.nextLine();
        System.out.print("Enter address = ");
        address = sc.nextLine();
        System.out.print("Enter subject_spec = ");
        subject_spec = sc.nextLine();
        System.out.print("Enter phone number = ");
        phone = sc.nextInt();
        System.out.print("Enter monthly_salary = ");
        month_sal = sc.nextFloat();
    }

    public void display() {
        System.out.println("Name" + "\t  " + "Address" + "\t  " + "Subject specialization" + "\t  " + "salary");
        System.out.print(name + "\t " + address + "\t   " + subject_spec + "\t  " + month_sal);
    }

    public void cal() {
        float annual_sal = month_sal * 12;
        if (annual_sal > 175000) {
            float tax = (5 * annual_sal) / 100;
            System.out.println(tax + " is your tax");
        }
        else{
            System.out.println("No tax below 175000 annual income");
        }
    }

    public static void main(String[] args) {
       DataMemberF ob = new DataMemberF();
        ob.input();
        ob.cal();
        ob.display();
    }
}