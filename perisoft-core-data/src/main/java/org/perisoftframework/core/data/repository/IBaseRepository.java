package org.perisoftframework.core.data.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseRepository<T, K extends Serializable> extends CrudRepository<T, K> {

	public List<T> findAll();

}
