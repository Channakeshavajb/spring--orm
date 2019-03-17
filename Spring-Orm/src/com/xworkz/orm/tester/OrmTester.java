package com.xworkz.orm.tester;

import com.xworkz.orm.entity.PopularionEntity;
import com.xworkz.orm.repository.PopulationRepositary;

public abstract class OrmTester {

	public static void main(String[] args) {

		PopularionEntity entity=new PopularionEntity();
		entity.setState("karnataka");
		entity.setGender("male");
		entity.setEmployementPercentage(30.0);
		
		PopulationRepositary populationRepositary=new PopulationRepositary();
		populationRepositary.save(entity);
		
		
	}

}
