package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		// System.out.println("\n=== TEST 1: department insert ====");
		// Department dep = new Department(null, "Discos");
		// departmentDao.insert(dep);
		// System.out.println("Inserted! New id = " + dep.getId());
		
		System.out.println("\n=== TEST 2: department findById ====");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);
				
		System.out.println("\n=== TEST 3: department update ====");
		dep2 = departmentDao.findById(1);
		dep2.setName("Material Escolar");		
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
	}
}
