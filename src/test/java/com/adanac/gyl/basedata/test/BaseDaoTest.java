package com.adanac.gyl.basedata.test;

import org.junit.Test;

import com.adanac.gyl.base.dao.BaseDao;
import com.adanac.gyl.query.basedata.DepartmentQuery;
import com.adanac.gyl.test.utils.SpringUtils;

public class BaseDaoTest extends SpringUtils{
	@Test
	public void testBaseDao_Count(){
		BaseDao baseDao = (BaseDao)context.getBean("baseDao");
		DepartmentQuery baseQuery = new DepartmentQuery();
		baseQuery.setName("44");
		int count = baseDao.getCount(baseQuery);
		System.out.println(count);
	}
}
