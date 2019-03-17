package com.xworkz.orm.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.orm.entity.PopularionEntity;
import com.xworkz.orm.repository.PopulationRepositary;

public class SpringOrmTester {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("resource/context.xml");
		PopulationRepositary pop=context.getBean(PopulationRepositary.class);
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		
		PopularionEntity entity=new PopularionEntity();
		entity.setState("goa");
		entity.setGender("female");
		entity.setEmployementPercentage(new Double(40));
		
		pop.save(entity);
		

	}

}
