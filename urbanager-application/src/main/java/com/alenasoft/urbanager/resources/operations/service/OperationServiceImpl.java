package com.alenasoft.urbanager.resources.operations.service;

import com.alenasoft.urbanager.api.Result;
import com.alenasoft.urbanager.resources.operations.dao.ResultDaoImpl;

import javax.inject.Inject;

public class OperationServiceImpl implements OperationService {

    @Inject
    private ResultDaoImpl dao;

    @Override
    public long sum(int num1, int num2) {
        Result result = new Result();
        result.operation = "Sum";
        result.number1 = num1;
        result.number2 = num2;
        result.result = num1 + num2;
        return this.dao.create(result);
    }

    @Override
    public Result getById(long id) {
        return this.dao.findById(id);
    }
}
