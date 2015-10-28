package com.adanac.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.adanac.gyl.base.dao.impl.BaseDaoImpl;
import com.adanac.gyl.basedata.dao.DepartmentDao;
import com.adanac.gyl.basedata.domain.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
