
package acme.entities.student;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Size(max = 75)
	protected String			statement;

	@NotBlank
	@Size(max = 100)
	private List<String>		strongFeatures;

	@NotBlank
	@Size(max = 100)
	private List<String>		weakFeatures;

	@URL
	protected String			information;
}
