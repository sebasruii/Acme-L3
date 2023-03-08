
package acme.roles;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;

public class Assistant extends AbstractRole {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Length(max = 75)
	@NotBlank
	protected String			supervisor;

	@Length(max = 100)
	@NotBlank
	protected String			expertiseFields;

	@Length(max = 100)
	@NotBlank
	protected String			summary;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
