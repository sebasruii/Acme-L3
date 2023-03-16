
package acme.entities.audits;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Audit extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank()
	@Pattern(regexp = "^[A-Z]{1,3}\\d{3}$")
	protected String			code;

	@NotBlank()
	@Length(max = 100)
	protected String			conclusion;

	@NotBlank()
	@Length(max = 100)
	protected String			strongPoints;

	@NotBlank()
	@Length(max = 100)
	protected String			weakPoints;
}
