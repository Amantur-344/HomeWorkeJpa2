package com;

import com.db.DeppartmentDb;
import com.db.EmployeeDb;
import com.db.GenericDB;
import com.entity.Car;
import com.entity.Department;
import com.entity.Employee;

import java.util.List;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) {

        Department department1 = new Department("soft");
        Department department2 = new Department("test");
        DeppartmentDb.create(department1);
        DeppartmentDb.create(department2);

        Employee employee1 = new Employee("Kevin",30,department1);
        EmployeeDb.create(employee1);
        Employee employee2 = new Employee("Alex", 25,department2);
        EmployeeDb.create(employee2);
        Employee employee3 = new Employee("Rudolf",27,department1);
        EmployeeDb.create(employee3);


        for (int i = 0; i < 10; i++) {
            Car car = new Car("Audi-" + i);
            GenericDB <Car> carGenericDB = new GenericDB<>();
            carGenericDB.create(car);
        }

//        List<Employee> employees = EmployeeDb.getAll().stream().forEach(x -> System.out.println(x));
//        List<Employee> employees = EmployeeDb.getAll();//Мето который возвращает значения в классе employee в SQL
//        for (Employee e:employees) {
//            System.out.println(e);
//      }
//        List<Employee> employees = EmployeeDb.getAll();
//        Stream<Employee> employeeStream = employees.stream();
//
//        employeeStream.filter(x -> x.getName().contains("A")).forEach(x -> System.out.println(x));
//
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setAge(36);
//        employee.setName("Adam");
//
//        EmployeeDb.update(employee);//Обновляем (заменяем) значения
     }
}
