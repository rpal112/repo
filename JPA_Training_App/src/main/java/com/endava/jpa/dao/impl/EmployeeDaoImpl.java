package com.endava.jpa.dao.impl;

import com.endava.jpa.dao.EmployeeDao;
import com.endava.jpa.model.Employee;
import java.util.List;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;
    private String QueryFindEmployeeByCityAndByDep = "SELECT e FROM Employee e WHERE e.address.city = :city and e.department.id = :id ";
    

    public Employee find(int id) {
        return entityManager.find(Employee.class, id);
    }

    public List<Employee> find(String employeeName) {
        Query query = entityManager.createNamedQuery("Employee.getByName");
        query.setParameter("name", employeeName);
        return query.getResultList();
    }

    public void save(Employee toBeSaved) {
        entityManager.persist(toBeSaved);
    }

    public void update(Employee toBeUpdated) {
        entityManager.merge(toBeUpdated);
    }

    public void remove(Employee toBeRemoved) {
        entityManager.remove(toBeRemoved);
    }

    public List<Employee> findByCityAndByDepartment(String city, int id) {
        return entityManager.createQuery(QueryFindEmployeeByCityAndByDep)
                .setParameter("city", city)
                .setParameter("id", id)
                .getResultList();
    }

    
}
