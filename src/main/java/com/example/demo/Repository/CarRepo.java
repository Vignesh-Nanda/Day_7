package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Service.Entity.Cars;


public interface CarRepo extends JpaRepository<Cars, Integer> {
	@Query("SELECT cr FROM Cars cr where cr.own =?1")
	public List<Cars> find(int own);
	@Query("SELECT cr FROM Cars cr where cr.add =?1")
	public List<Cars> findadd(String add);
	@Query("SELECT cr FROM Cars cr where cr.ct =?1")
	public List<Cars> findct(String add);
	@Query("SELECT cr FROM Cars cr where cr.own =?1 and cr.ct=?2")
	public List<Cars> findownct(int own,String ct);


}
