package org.perisoftframework.core.data.controller;

import java.io.Serializable;
import java.util.List;

import org.perisoftframework.core.data.repository.IBaseRepository;
import org.perisoftframework.core.data.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class BaseController<T, B extends IBaseService<R, T, K>, R extends IBaseRepository<T, K>, K extends Serializable> implements IBaseController<T, B, R, K> {

	@Autowired
	private B business;

	@RequestMapping
	public List<T> findAll(Model model) {
		return this.getBusiness().findAll();
	}

	@RequestMapping("/id/{id}")
	public T findById(@PathVariable K id, Model model) {
		return this.getBusiness().findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public T add(@RequestBody T t, Model model) {
		return this.getBusiness().save(t);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestParam K k, Model model) {
		this.getBusiness().delete(k);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public T edit(@RequestBody T t, Model model) {
		return this.getBusiness().save(t);
	}

	public B getBusiness() {
		return business;
	}

	public void setBusiness(B business) {
		this.business = business;
	}

}
