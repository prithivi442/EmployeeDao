/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_task2;

import dao_task2.Dao.EmployeeDao;
import dao_task2.Dao.EmployeeDaoimpl;
import dao_task2.entity.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Prithivi Raj
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        BufferedReader reader = new BufferedReader(new FileReader("d:/rawdata.csv"));
        String line = null;
        Employee employee = new Employee();
        EmployeeDao employeedao = new EmployeeDaoimpl();
        StringBuilder builder = new StringBuilder();
        while((line=reader.readLine())!=null){
            String[] tokens = line.split(",");
            
            if(tokens.length>=6){
                employee.setId(Integer.parseInt(tokens[0]));
                employee.setFname(tokens[1]);
                employee.setLname(tokens[2]);
                employee.setEmail(tokens[3]);
                employee.setPh(tokens[4]);
                employee.setSalary(tokens[5]);
               // employee.setStatus((tokens[6].equals("1"))?true:false);
                if(tokens[6].equals("1")){
                    employee.setStatus(true);
                }
                else employee.setStatus(false);
                
                
            }
            else{
                builder.append(line +"\n");
            }
             
        }
             reader.close();   
             FileWriter writer =new FileWriter("d:/garbage.csv");
             writer.write(builder.toString());
             writer.close();
             System.out.println(employeedao.getAll());
             employeedao.insert(employee);
        
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
    }
    
}
