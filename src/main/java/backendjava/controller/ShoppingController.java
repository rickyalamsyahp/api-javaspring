package com.example.springpj.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpj.model.User;
import com.example.springpj.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class ShoppingrController {

	@Autowired
	UserRepository userRepo;
	
	// mengambil semua data user
	@GetMapping("/")
	public List<User> all(){
		return userRepo.findAll();
	}
	
	// membuat data baru
	@PostMapping("/")
	public User add(@RequestParam("Name") String Name, @RequestParam("CreatedDate") String CreatedDate) {
		
		User user = new User();
		user.setName(Name);
        user.setCreatedDate(CreatedDate);
      
		
		return userRepo.save(user);
	}
	
	// mengubah data
	@PutMapping("/{id}")
	public User update(@PathVariable("id") Long id,@RequestParam("Name") String Name, @RequestParam("CreatedDate") String CreatedDate) {
		
		User user = new User();
		user.setId(id);
	    user.setName(Name);
        user.setCreatedDate(CreatedDate);
		
		
		return userRepo.save(user);
	}
	
	// menghapus data
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		
		User user = new User();
		user.setId(id);
		
		userRepo.delete(user);
	}
	
	// mengambil satu data user
	@GetMapping("/{id}")
	public Optional<User> find(@PathVariable("id") Long id){
		return userRepo.findById(id);
	}
	
}
