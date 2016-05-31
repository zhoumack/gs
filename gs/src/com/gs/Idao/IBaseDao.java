package com.gs.Idao;

import java.io.Serializable;
import java.util.List;


public interface IBaseDao<T> {
	//不根据id加载实体
	public Integer add(T  entityClass);
	//根据id加载实体
	public T get(Class<T>  entityClass,Serializable id);
	//保存实体
	Serializable save(T entity);
	//更新实体
	void update(T entity);
	//删除实体
	void delete(T entity);
	//根据id删除实体
	void delete(Class<T> entityClass,Serializable id);
	//获取所有实体
	List<T> findAll(Class<T> entityClass);
	//获取实体总数
	long findCount(Class<T> entityClass);
	
}
