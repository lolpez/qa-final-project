package com.alenasoft.urbanager.resources.operations.dao;

import com.alenasoft.urbanager.api.Example;
import com.alenasoft.urbanager.api.Result;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

public class ResultDaoImpl extends AbstractDAO<Result> implements ResultDao {

    public ResultDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public long create(Result result) {
        return this.persist(result).id;
    }

    @Override
    public Result findById(long id) {
        return this.get(id);
    }
}
