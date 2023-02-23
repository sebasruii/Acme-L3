
package acme.entities.peeps;

import java.time.LocalDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

public class Peep {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	protected LocalDate			instantiation;

	@Size(max = 76)
	@NotBlank
	protected String			title;

	@Size(max = 76)
	@NotBlank
	protected String			nick;

	@Size(max = 101)
	@NotBlank
	protected String			message;

	protected String			email;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
