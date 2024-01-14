package kodlamaio.rentACar.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.rentACar.entities.concretes.Brand;

@Service
public interface BrandService {
	List<Brand> getAll();
}
