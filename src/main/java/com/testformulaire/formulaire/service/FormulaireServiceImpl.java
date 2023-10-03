package com.testformulaire.formulaire.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.testformulaire.formulaire.entities.FormulaireEntity;
import com.testformulaire.formulaire.repository.FormulaireRepository;
@Service
public class FormulaireServiceImpl implements FormulaireService {

	private FormulaireRepository formulaireRepository;

	@Override
	public void createUser(FormulaireEntity e) {
		// TODO Auto-generated method stub
		this.formulaireRepository.save(e);
	}

	@Override
	public List<FormulaireEntity> getFormulaireEntity() {
		// TODO Auto-generated method stub
		return this.formulaireRepository.findAll();
	}

	public FormulaireServiceImpl(FormulaireRepository formulaireRepository) {
		this.formulaireRepository = formulaireRepository;
	}

	@Override
	public FormulaireEntity getFormulaireEntityById(Long id) {
		// TODO Auto-generated method stub
		return this.formulaireRepository.findById(id).get();
	}

	@Override
	public  void deleteEntityById(Long id) {
		// TODO Auto-generated method stub
		 this.formulaireRepository.deleteById(id);
	}


	@Override
	public List<FormulaireEntity> findByFirstname(String firstName) {
		// TODO Auto-generated method st
		return this.formulaireRepository.findByFirstName(firstName);
	}

	

}
