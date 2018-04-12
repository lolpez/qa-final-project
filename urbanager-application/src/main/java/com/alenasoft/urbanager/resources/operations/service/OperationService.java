package com.alenasoft.urbanager.resources.operations.service;

import com.alenasoft.urbanager.api.Result;

public interface OperationService {
    long sum(int num1, int num2);

    Result getById(long id);
}
