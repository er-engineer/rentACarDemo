package kodlamaio.rentACar.dataAccess.abstracts;

import java.util.List;



import kodlamaio.rentACar.entities.concretes.Brand;

public interface BrandRepository{
	List<Brand> getAll(); 
}
