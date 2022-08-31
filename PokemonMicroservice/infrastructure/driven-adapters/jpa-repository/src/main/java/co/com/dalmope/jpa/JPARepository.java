package co.com.dalmope.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<, String>, QueryByExampleExecutor<Object/* change for adapter model */> {
}
