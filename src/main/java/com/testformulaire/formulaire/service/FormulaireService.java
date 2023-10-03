package com.testformulaire.formulaire.service;

import java.util.List;

import com.testformulaire.formulaire.entities.FormulaireEntity;


public interface FormulaireService  {
	
	void createUser(FormulaireEntity e);
	List<FormulaireEntity> getFormulaireEntity();
	List<FormulaireEntity> findByFirstname(String firstName);
	FormulaireEntity getFormulaireEntityById(Long id);
	void deleteEntityById(Long id);

}
