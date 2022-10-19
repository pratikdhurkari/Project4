package com.rays.proj4.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.rays.pro4.Bean.FacultyBean;
import com.rays.pro4.Exception.ApplicationException;
import com.rays.pro4.Exception.DuplicateRecordException;
import com.rays.pro4.Model.FacultyModel;

/**
 * Faculty  Model Test classes.
 * 
 * @author Pratik Dhurkari
 *
 */
public class FacultyTest {

	public static FacultyModel model= new FacultyModel();
	
	public static void main(String[] args) throws DuplicateRecordException {
		testadd();
		//testDelete();
		//testUpdate();
		//testFindByPk();
		//testFindByEmailId();
		//testList();
		//testsearch();
		
		
	}
	
	
	
	
public static void testadd() throws DuplicateRecordException {
		
		try {
			FacultyBean bean = new FacultyBean();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			//bean.setId(1);
			bean.setFirstName("Sachin");
			bean.setLastName("Jaiswal");
			bean.setGender("Male");
			bean.setEmailId("sachinjaiswal@gmail.com");
			bean.setMobileNo("8542153362");
			bean.setCollegeId(2);
			bean.setCourseId(5);
			bean.setDob(sdf.parse("15/02/1980"));
			bean.setSubjectId(1);
			bean.setCreatedBy("admin");
			bean.setModifiedBy("admin");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
			
			model.add(bean);
			
			System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
public static void testDelete(){
	
	try{
		FacultyBean bean=new FacultyBean();
		long pk=1L;
		
		bean.setId(pk);
		model.delete(bean);
		FacultyBean deletebean = model.findByPK(pk);
		if(deletebean != null){
			System.out.println("Test Delete fail");
		}
	}catch(ApplicationException e){
		e.printStackTrace();
	}
}
public static void testUpdate() {
	try {
		FacultyBean bean = model.findByPK(1L);
		bean.setFirstName("akash");
		//bean.setDescription("commerce");
		model.update(bean);
		System.out.println("update succ");
		
			/*
			 * FacultyBean updateBean=model.findByPK(2L);
			 * if(!"ram".equals(updateBean.getFirstName())){
			 * System.out.println("test update fail"); }
			 */
		 
		 
	}catch(ApplicationException e) {
		e.printStackTrace();
	}catch(DuplicateRecordException e) {
		e.printStackTrace();
	}
}
public static void testFindByPk() {
	try {
		FacultyBean bean=new FacultyBean();
		long pk=1L;
		bean=model.findByPK(pk);
		if(bean==null) {
			System.out.println("test findbypk fail");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getGender());
		System.out.println(bean.getEmailId());
		System.out.println(bean.getMobileNo());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}catch(ApplicationException e) {
		e.printStackTrace();
	}
}
public static void testFindByEmailId() {
    try {
        FacultyBean bean = new FacultyBean();
        bean = model.findByEmailId("ram@gmail.com");
        if (bean != null) {
            System.out.println("Test Find By EmailId fail");
        }
        System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getGender());
		System.out.println(bean.getEmailId());
		System.out.println(bean.getMobileNo());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
    } catch (ApplicationException e) {
        e.printStackTrace();
    }
}

public static void testList(){
	 try{
		FacultyBean bean = new FacultyBean();
		 List list=new ArrayList();
		 list=model.list(1,10);
		 
		 if(list.size() < 0){
			 System.out.println("Test list fail");
		 }
		 Iterator it = list.iterator();
		 while(it.hasNext()){
			 bean=(FacultyBean) it.next();
			 System.out.println(bean.getId());
				System.out.println(bean.getFirstName());
				System.out.println(bean.getLastName());
				System.out.println(bean.getGender());
				System.out.println(bean.getEmailId());
				System.out.println(bean.getMobileNo());
				System.out.println(bean.getCollegeId());
				System.out.println(bean.getCollegeName());
				System.out.println(bean.getCreatedBy());
				System.out.println(bean.getModifiedBy());
				System.out.println(bean.getCreatedDatetime());
				System.out.println(bean.getModifiedDatetime());
			 
		 }
	 }catch(ApplicationException e){
		 e.printStackTrace();
	 }
	 
}

public static void testsearch() {
	try {
		FacultyBean bean = new FacultyBean();
		List list = new ArrayList();
		list=model.search(bean);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			bean= (FacultyBean) it.next();
			
			System.out.println(bean.getId());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getLastName());
			System.out.println(bean.getGender());
			System.out.println(bean.getEmailId());
			System.out.println(bean.getMobileNo());
			
		}
	}catch(ApplicationException e) {
		e.printStackTrace();
	}
}
	
}
