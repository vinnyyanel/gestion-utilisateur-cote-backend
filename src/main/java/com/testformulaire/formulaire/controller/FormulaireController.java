package com.testformulaire.formulaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testformulaire.formulaire.entities.FormulaireEntity;
import com.testformulaire.formulaire.models.formulaireModel;
import com.testformulaire.formulaire.service.FormulaireService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/formulaire")
public class FormulaireController {
	
	@Autowired
	FormulaireService formulaireService;
	
	
	@PostMapping("/create")
	void createUser(@RequestBody formulaireModel model) {
		FormulaireEntity form = new FormulaireEntity();
		form.setFirstName(model.getFirstName());
		form.setLastName(model.getLastName());
		form.setAge(model.getAge());
		this.formulaireService.createUser(form);
		
	}
	@GetMapping("/read")
	List<FormulaireEntity> userList(){
		return this.formulaireService.getFormulaireEntity();
	}
	
	@GetMapping("/sear/{id}")
	FormulaireEntity userBuyId(@PathVariable Long id){
		return this.formulaireService.getFormulaireEntityById(id);
	}
	
	@GetMapping("/seach/{firstName}")
	List<FormulaireEntity> findByFirstname(@PathVariable String firstName){
		return this.formulaireService.findByFirstname(firstName);
	}
	
	@PutMapping("/update/{id}")
	void userUpdate(@PathVariable Long id, @RequestBody formulaireModel model ){
		FormulaireEntity form = new FormulaireEntity();
		form=this.formulaireService.getFormulaireEntityById(id);
		form.setFirstName(model.getFirstName());
		form.setLastName(model.getLastName());
		form.setAge(model.getAge());
	this.formulaireService.createUser(form);
	}
	
	@DeleteMapping("/delete/{id}")
	void userDelete(@PathVariable Long id) {
		FormulaireEntity form = new FormulaireEntity();
		form=this.formulaireService.getFormulaireEntityById(id);
		this.formulaireService.deleteEntityById(form.getId());
	}
	

}
