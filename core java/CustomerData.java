class Customer {
    private int cId;
    private String cName;
    private long cNum;

    // setter method
    public void setData(int cId, String cName, long cNum) {
        cId = cId;
        cName = cName;
        cNum = cNum;
    }

    // Getter methods
    public int getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }

    public long getcNum() {
        return cNum;
    }
}

class CustomerData {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.setData(1,"Hruthik",9807654321L);

        System.out.println("Employee 1 Details");
        System.out.println(c.getcId());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());
    }
}