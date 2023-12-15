package dao;

import java.util.List;

import model.student;

public interface studentDao {
	
	//create
	void add(student s);
	
	//read
	String queryAll1();
	List<student> queryAll2();    //比較彈性,事後可以調整呈現的內容
	
	//update
	
	//delete
}
