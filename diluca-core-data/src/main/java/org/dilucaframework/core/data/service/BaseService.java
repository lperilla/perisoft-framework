package org.dilucaframework.core.data.service;

import java.io.Serializable;
import java.util.List;

import org.dilucaframework.core.data.repository.BaseRepository;

public interface BaseService<R extends BaseRepository<T, K>, T, K extends Serializable> {

	public R getRepository();
	
	public T save(T t);
	
	public List<T> findAll();
	
	public void delete(K k);
		
}
