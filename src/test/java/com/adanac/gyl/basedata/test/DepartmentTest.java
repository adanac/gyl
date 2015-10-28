package com.adanac.gyl.basedata.test;

import org.junit.Test;

import com.adanac.gyl.basedata.dao.DepartmentDao;
import com.adanac.gyl.query.basedata.DepartmentQuery;
import com.adanac.gyl.test.utils.SpringUtils;

public class DepartmentTest extends SpringUtils{
	@Test
	public void testGetCount(){
		DepartmentDao departmentDao = (DepartmentDao)context.getBean("departmentDao");
		DepartmentQuery baseQuery = new DepartmentQuery();
		int count = departmentDao.getCount(baseQuery);
		System.out.println(count);
	}
}
