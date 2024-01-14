package kodlamaio.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;

public class InMemoryBrandRepository implements BrandRepository {
	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"Mercedes"));
		brands.add(new Brand(3,"Nissan"));
	}
	
	
	@Override
	public List<Brand> getAll() {
		brands = new ArrayList<Brand>();				
		return null;
	}

}
