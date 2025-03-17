package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
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
		
		/*
		System.out.println("\n=== TEST 4: department findAll ====");
		List<Department> listDepartment = new ArrayList<>(departmentDao.findAll());
		for (Department obj : listDepartment) {
			System.out.println(obj);
		}
		*/		
		
		/*
		System.out.println("\n=== TEST 4: department deleteById ====");
		System.out.print("Digite um ID para deletar um departamento: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Departamento " + id + " Deletado com sucesso!");
		*/
		sc.close();
	}
}
