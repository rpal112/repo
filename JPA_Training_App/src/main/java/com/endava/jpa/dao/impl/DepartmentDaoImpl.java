package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.DepartmentDao;
import com.endava.jpa.model.Department;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import javax.persistence.Query;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@PersistenceContext
	private EntityManager entityManager;

	private String QUERY_FIND_DEPARTMENT_BY_NAME = "Select d from Department d where d.name = :dep_name";

	@Override
	public Department find(int id) {
		return entityManager.find(Department.class, id);
	}
        
	public List<Department> find(String departmentName) {
//		return entityManager.createQuery(QUERY_FIND_DEPARTMENT_BY_NAME)
//				.setParameter("dep_name", departmentName)
//				.getResultList();
            Query query = entityManager.createNamedQuery("Department.getByName");
            query.setParameter("name", departmentName);
            return query.getResultList();
	}

	@Override
	public void save(Department toBeSaved) {
		entityManager.persist(toBeSaved);
	}

	@Override
	public Department update(Department toBeUpdated) {
		return entityManager.merge(toBeUpdated);
	}

	@Override
	public void remove(Department toBeRemoved) {
		entityManager.remove(toBeRemoved);
	}
}
