package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("\n=== TEST 1: department insert ====");
		Department dep = new Department(null, "Discos");
		departmentDao.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		*/
		
		/*
		System.out.println("\n=== TEST 2: department findById ====");
		Department dep2 = departmentDao.findById(1);
		System.out.println(dep2);
		*/
		
		/*
		System.out.println("\n=== TEST 3: department update ====");
		dep2 = departmentDao.findById(1);
		dep2.setName("Cosméticos");		
		departmentDao.update(dep2);
		System.out.println("Update completed");
		*/
		
		System.out.println("\n=== TEST 4: department findAll ====");
		List<Department> listDepartment = new ArrayList<>(departmentDao.findAll());
		for (Department obj : listDepartment) {
			System.out.println(obj);
		}		
	}
}
