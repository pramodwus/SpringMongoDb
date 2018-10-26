package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.app.dao.EmpRepository;
import com.app.entity.Employee;
@Service
public class EmpServiceImpl implements EmpServiceDao
{
@Autowired
private EmpRepository repo;
@Override
public boolean AddEmp(Employee e) 
{
	boolean b=false;
	try
	{
		System.out.println(e);
		repo.save(e);
		b=true;
	}
	catch(Exception e1)
	{
		e1.printStackTrace();
	}
	return b;
}
@Override
	public List<Employee> AllEmp() 
    {
	   
		List<Employee> list=repo.findAll();
	   
		return list;
	}
@Override
	public boolean DeleteEmp(int eid) 
    {
	    boolean b=false;
		try
		{
			repo.deleteById(eid);
			b=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}
@Override
	public boolean UpdateEmp(Employee e) {
		// TODO Auto-generated method stub
	 boolean b=false;
	  try
	  {
		  
		 repo.save(e);
		  
		  b=true;
	  }
	  catch(Exception e1)
	  {
		  e1.printStackTrace();
	  }
		return b;
	}
}
