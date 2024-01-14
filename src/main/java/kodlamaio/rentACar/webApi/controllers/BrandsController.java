package kodlamaio.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;
	// Dependency Injection with lombok.
	
	@GetMapping
	public List<Brand> getAll() {
		return brandService.getAll();
	}
		

}
