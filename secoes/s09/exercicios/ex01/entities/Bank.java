package s09.exercicios.ex01.entities;

public class Bank {
    private static final double WITHDRAWAL_FEE = 5.0;

    private int id;
    private String name;
    private double deposit = 0.0;

    //getters and setters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDeposit() {
        return deposit;
    }

    //Constructor

    public Bank(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Bank(int id, String name, double initialDeposit) {
        this.id = id;
        this.name = name;
        deposit(initialDeposit);
    }

    // METHODS
    public void deposit(double deposit) {
        this.deposit += deposit;
    }

    public void subtraction(double deposit){
        this.deposit -= deposit + WITHDRAWAL_FEE;
    }

    public String toString() {
        return "Account "
                + id
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", getDeposit());
    }
}
