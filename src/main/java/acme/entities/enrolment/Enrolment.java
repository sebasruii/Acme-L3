
package acme.entities.enrolment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.entities.student.Student;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Enrolment extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "^[A-Z]{1,3}//d{3}$")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			motivation;

	@NotBlank
	@Length(max = 100)
	protected String			goals;

	// Relationships ---------------------------------------------------------

	@Valid
	@NotNull
	@ManyToOne(optional = false)
	protected Student			student;

	@Valid
	@NotNull
	@ManyToOne(optional = false)
	protected Course			course;
}
