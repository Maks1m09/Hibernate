package by.tms.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "operations")

public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "num1")
    private double num1;
    @Column(name = "num2")
    private double num2;
    @Column(name = "result")
    private double result;
    @Column(name = "operand")
    private String operand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Operation() {
    }

    public Operation(double num1, double num2, String operand) {
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                ", operand='" + operand + '\'' +
                '}';
    }
}
