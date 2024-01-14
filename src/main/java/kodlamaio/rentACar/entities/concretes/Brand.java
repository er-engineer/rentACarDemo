package kodlamaio.rentACar.entities.concretes;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Brand {
	private int id;
	private String name;
	
}
