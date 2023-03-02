package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CarRepo;
import com.example.demo.Service.Entity.Cars;

@Service
public class Cser {
	@Autowired

	private CarRepo cr;

	public Cars addAll(Cars c) {
		return cr.save(c);
	}

	public List<Cars> getAll() {
		return cr.findAll();
	}

	public List<Cars> find(int own) {
		return cr.find(own);
	}
	public List<Cars> findadd(String add) {
		return cr.findadd(add);
	}
	public List<Cars> findct(String ct) {
		return cr.findct(ct);
	}
	public List<Cars> findownct(int own, String ct) {
		return cr.findownct(own,ct);
	}

}
