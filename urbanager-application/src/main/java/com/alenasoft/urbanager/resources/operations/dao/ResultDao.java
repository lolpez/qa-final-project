package com.alenasoft.urbanager.resources.operations.dao;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.api.Result;

public interface ResultDao {

    long create(Result result);

    Result findById(long id);
}
