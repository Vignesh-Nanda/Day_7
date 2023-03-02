package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Cser;
import com.example.demo.Service.Entity.Cars;

@RestController
public class CarCont {

	@Autowired
	private Cser cs;
	
	@GetMapping("/get")
	public List<Cars> get()
	{
		return cs.getAll();
	}
	
	@PostMapping("/add")
	public Cars postDetails(@RequestBody Cars c)
	{
		return cs.addAll(c);
	}
	@GetMapping("/get/{own}")
	public List<Cars> find(@PathVariable("own")int own)
	{
		return cs.find(own);
	}
	@GetMapping("/getadd/{add}")
	public List<Cars> findadd(@PathVariable("add")String add)
	{
		return cs.findadd(add);
	}
	@GetMapping("/getct/{ct}")
	public List<Cars> findct(@PathVariable("ct")String ct)
	{
		return cs.findct(ct);
	}
	@GetMapping("/get/{own}/getct/{ct}")
	public List<Cars> findownct(@PathVariable("own")int own,@PathVariable("ct") String ct)
	{
		return cs.findownct(own,ct);
	}
}
