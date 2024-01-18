package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{

	public List<Student> findByUnameAndPass(String uname, String pass);

	@Query("from Student")
	public List<Student> getAllRecordofStudents();


	@Modifying
	@Transactional
	@Query("UPDATE Student SET mobno = :mobno, name=:name, pass=:pass, uname=:uname WHERE id=:id")
	public void update(@Param("id") int id, @Param("mobno") String mobno, @Param("name") String name, @Param("uname") String uname, @Param("pass") String pass);

	@Modifying
	@Transactional
	@Query("delete from Student where id=:id")
	public void deleteRecords(int id);
	
	@Query(value = "select * from Student where uname=:un and pass=:ps", nativeQuery = true)
	public List<Student> getDataByUnameAndPass(String un, String ps);

}
