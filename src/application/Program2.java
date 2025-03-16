package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department insert ====");
		Department dep = new Department(null, "Discos");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
	}
}
