package kodlamaio.rentACar.business.concretes;

import java.util.List;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	// Loosly Coupled
	
	@Override
	public List<Brand> getAll() {
		
		return brandRepository.getAll();
	}

}
