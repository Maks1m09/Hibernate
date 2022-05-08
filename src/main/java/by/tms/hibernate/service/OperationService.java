package by.tms.hibernate.service;

import by.tms.hibernate.dao.OperationDao;
import by.tms.hibernate.model.Operation;

public class OperationService {
    private OperationDao operationDao = new OperationDao();

    public Operation findOperationById(int id) {
        return operationDao.findOperationById(id);
    }

    public void getCalculatorOperation(Operation operation){
         operationDao.getCalculatorOperation(operation);
    }
}
