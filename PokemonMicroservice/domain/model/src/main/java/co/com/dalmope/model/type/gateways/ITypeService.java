package co.com.dalmope.model.type.gateways;

import co.com.dalmope.model.type.Type;

import java.util.List;

public interface ITypeService {
    List<Type> findAll();
    Type findById(Long id);
    Type save(Type type);
    void delete(Type type);
    Type update(Type type);
}
