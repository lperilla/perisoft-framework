package org.perisoftframework.core.data.service;

import java.io.Serializable;
import java.util.List;

import org.perisoftframework.core.data.repository.IBaseRepository;

public interface IBaseService<R extends IBaseRepository<T, K>, T, K extends Serializable> {

	public R getRepository();

	public T save(T t);

	public List<T> findAll();

	public void delete(K k);

}
