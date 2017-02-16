package org.perisoftframework.core.data.controller;

import java.io.Serializable;
import java.util.List;

import org.perisoftframework.core.data.repository.IBaseRepository;
import org.perisoftframework.core.data.service.IBaseService;
import org.springframework.ui.Model;

public interface IBaseController<T, B extends IBaseService<R, T, K>, R extends IBaseRepository<T, K>, K extends Serializable> {

	public B getBusiness();
	
	public List<T> findAll(Model model);
	
	public T findById(K id, Model model);
	
	public T add(T t, Model model);

	public T edit(T t, Model model);
	
	public void delete(K k, Model model);
}
