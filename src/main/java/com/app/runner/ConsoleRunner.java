package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		/*repo.findAll(Sort.by(Direction.DESC,"prodCode"))
		.forEach(System.out::println);*/
		
		//--findAll(Pageable)--
		/*repo.findAll(PageRequest.of(2, 2))
		.forEach(System.out::println);*/
		
		/*Product p=new Product();
		p.setProdCost(3.3);
		Example<Product> ex=Example.of(p);
		repo.findAll(ex).forEach(System.out::println);*/
		
		/*Product p=new Product();
		p.setProdCost(3.3);
		Example<Product> ex=Example.of(p);
		repo.findAll(ex,Sort.by(Direction.DESC,"prodCode"))
		.forEach(System.out::println);*/
		
		/*Product p=new Product();
		p.setProdCost(3.3);
		Example<Product> ex=Example.of(p);
		repo.findAll(ex,PageRequest.of(1, 2))
		.forEach(System.out::println);*/
		
		repo.findAllById(Arrays.asList(5,6,7,8))
		.forEach(System.out::println);
		
		
				
	}

}
