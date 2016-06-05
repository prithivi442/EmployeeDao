/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_task2.Dao;

import dao_task2.entity.Employee;
import java.util.List;

/**
 *
 * @author Prithivi Raj
 */
public interface EmployeeDao {
    int insert(Employee c);
    List<Employee> getAll();
    Employee getById(int id);
}
