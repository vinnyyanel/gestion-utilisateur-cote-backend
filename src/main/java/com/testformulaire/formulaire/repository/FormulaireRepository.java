package com.testformulaire.formulaire.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.testformulaire.formulaire.entities.FormulaireEntity;

@EnableJpaRepositories
public interface FormulaireRepository extends JpaRepository<FormulaireEntity , Long>{

	
	/*void createUser(FormulaireEntity e);
	List<FormulaireEntity> getFormulaireEntity();
	List<FormulaireEntity> findByFirstname(String firstName);
	FormulaireEntity getFormulaireEntityById(Long id);
	void deleteEntityById(Long id);*/

	List<FormulaireEntity> findByFirstName(String firstName);
}
