package by.tms.hibernate.runner;

import by.tms.hibernate.service.OperationService;
import by.tms.hibernate.service.UserService;
import by.tms.hibernate.model.Operation;
import by.tms.hibernate.model.User;

public class Runner {
    public static void main(String[] args) {
        UserService userService = new UserService();
        OperationService operationService = new OperationService();
        User user = new User("Maksim", "Q", "password");
        userService.saveUser(user);
        Operation operation1 = new Operation(1, 2, "sum");
        operation1.setUser(user);
        user.addOperation(operation1);
        Operation operation2 = new Operation(5, 2, "sum");
        operation2.setUser(user);
        user.addOperation(operation2);
        userService.updateUser(user);
        operationService.getCalculatorOperation(operation1);
        operationService.getCalculatorOperation(operation2);
        System.out.println(operationService.findOperationById(1));
    }
}
