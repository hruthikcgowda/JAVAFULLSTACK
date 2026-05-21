class Employee {
    private int eId;
    private String eName;
    private long eNum;

    // Default constructor
    public Employee() {

    }

    // Parameterized constructor
    public Employee(int eId, String eName, long eNum) {
        this.eId = eId;
        this.eName = eName;
        this.eNum = eNum;
    }

    // Setter methods
    public void setEid(int eId) {
        this.eId = eId;
    }

    public void setEname(String eName) {
        this.eName = eName;
    }

    public void setEnum(long eNum) {
        this.eNum = eNum;
    }

    // Getter methods
    public int getEid() {
        return eId;
    }

    public String getEname() {
        return eName;
    }

    public long getEnum() {
        return eNum;
    }
}

class EmpDetails {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setEid(1);
        e1.setEname("Ajay");
        e1.setEnum(1234567890L);

        System.out.println("Employee 1 Details");
        System.out.println(e1.getEid());
        System.out.println(e1.getEname());
        System.out.println(e1.getEnum());

        Employee e2 = new Employee(2, "Arun", 9876543210L);

        System.out.println("Employee 2 Details");
        System.out.println(e2.getEid());
        System.out.println(e2.getEname());
        System.out.println(e2.getEnum());
    }
}