package com.dream.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dream.springcloud.entities.Dept;
import com.dream.springcloud.service.DeptClientService;

import sl.org.objectweb.asm.tree.TableSwitchInsnNode;

@RestController
public class DeptController_Consumer {

	// private static final String REST_URL_PREFIX = "http://localhost:8001";

	@Autowired
	private DeptClientService service = null;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {

		return this.service.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

}
