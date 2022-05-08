package by.tms.hibernate.dao;

import by.tms.hibernate.model.Operation;
import by.tms.hibernate.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class OperationDao {

    public Operation findOperationById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Operation.class, id);
    }

    public void getCalculatorOperation(Operation operation) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        double result = 0;
        switch (operation.getOperand()) {
            case "sum": {
                result = operation.getNum1() + operation.getNum2();
                break;
            }
            case "minus": {
                result = operation.getNum1() - operation.getNum2();
                break;
            }
            case "divide": {
                result = operation.getNum1() / operation.getNum2();
                break;
            }
            case "multiply": {
                result = operation.getNum1() * operation.getNum2();
                break;
            }
        }
        operation.setResult(result);
        session.update(operation);
        tx1.commit();
        session.close();
    }
}
