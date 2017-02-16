package org.perisoftframework.core.data.service;

import java.io.Serializable;
import java.util.List;

import org.perisoftframework.core.data.repository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseService<R extends IBaseRepository<T, K>, T, K extends Serializable> implements IBaseService<R, T, K> {

	@Autowired(required = true)
	private R repository;

	public T save(T t) {
		return this.getRepository().save(t);
	}

	public List<T> findAll() {
		return this.getRepository().findAll();
	}

	public void delete(K k) {
		this.getRepository().delete(k);
	}

	public R getRepository() {
		return repository;
	}

}