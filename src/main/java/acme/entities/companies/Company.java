
package acme.entities.companies;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Company {

	@NotBlank
	@Size(max = 75)
	protected String	name;

	@NotBlank
	@Size(max = 26)
	protected String	vat;

	@NotBlank
	@Size(max = 100)
	protected String	summary;

	@URL
	protected String	link;
}
