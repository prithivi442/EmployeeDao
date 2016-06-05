/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_task2.Dao;

import dao_task2.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prithivi Raj
 */
public class EmployeeDaoimpl implements EmployeeDao {
    List<Employee> employeelist = new ArrayList<>();

    public int insert(Employee e) {
        employeelist.add(e);
        return 1;
        
    }

    @Override
    public Employee getById(int id) {
        for(Employee e:getAll()){
            if(e.getId()==id){
                return e;
            }
        }
        return null;

    }


    @Override
    public List<Employee> getAll() {
        System.out.println("got all?");
        return employeelist;

    }

  
}
