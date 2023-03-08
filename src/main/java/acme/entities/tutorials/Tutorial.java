
package acme.entities.tutorials;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Tutorial extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------


	@Column(unique=true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}\\d\\d{3}")
	protected String			code;

	@NotBlank
	@Size(max = 75)
	protected String			title;

	@NotBlank
	@Size(max = 100)
	protected String			summary;

	@NotBlank
	@Size(max = 100)
	protected String			goals;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Time				estimatedTime;
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
