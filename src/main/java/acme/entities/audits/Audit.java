
package acme.entities.audits;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Audit extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank(message = "Code cannot be blank")
	@Pattern(regexp = "[A-Z]{1,3}[0-9][0-9]{3}", message = "Code must match pattern '[A-Z]{1,3}[0-9][0-9]{3}'")
	protected String			code;

	@NotBlank(message = "Conclusion cannot be blank")
	@Size(max = 100, message = "Conclusion must be shorter than 101 characters")
	protected String			conclusion;

	@NotBlank(message = "Strong points cannot be blank")
	@Size(max = 100, message = "Strong points must be shorter than 101 characters")
	protected String			strongPoints;

	@NotBlank(message = "Weak points cannot be blank")
	@Size(max = 100, message = "Weak points must be shorter than 101 characters")
	protected String			weakPoints;

	protected int				mark;
}
