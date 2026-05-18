import java.util.Scanner;
class Employee{
    int id;
    String name;
    int salary;
}
public class arraylist{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Employee e1 = null;
        System.out.println("Enter number of employees:");
        int n = scan.nextInt();
        Employee[] ar = new Employee[n];

        for(int i=0;i<ar.length;i++){
            e1 = new Employee();
            System.out.println("Enter employee ID:");
            e1.id = scan.nextInt();
            System.out.println("Enter employee Name:");
            e1.name = scan.next();
            System.out.println("Enter employee salary:");
            e1.salary = scan.nextInt();
            ar[i] = e1;
        }
        for (int i=0;i<ar.length;i++){
            System.out.println(ar[i].id+ " " +ar[i].name+" " + ar[i].salary+ " " );
        }
    }
}

