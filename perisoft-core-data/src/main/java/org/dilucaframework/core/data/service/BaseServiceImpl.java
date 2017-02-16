package org.dilucaframework.core.data.service;

import java.io.Serializable;
import java.util.List;

import org.dilucaframework.core.data.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseServiceImpl<R extends BaseRepository<T, K>, T, K extends Serializable> implements BaseService<R, T, K> {

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