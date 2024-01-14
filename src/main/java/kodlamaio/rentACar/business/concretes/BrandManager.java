package kodlamaio.rentACar.business.concretes;

import java.util.List;

import kodlamaio.rentACar.business.abstracts.BrandService;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BrandManager implements BrandService{
	private BrandRepository  brandRepository;
	
	
	@Override
	public List<Brand> getAll() {
		
		return brandRepository.getAll();
	}

}
