
package acme.entities.practicumSessions;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import acme.entities.practicums.Practicum;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PracticumSession extends AbstractEntity {

	// Serialisation identifier ----------------------------------------------
	private static final long	serialVersionUID	= 1L;

	// Attributes ------------------------------------------------------------
	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			sumary;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date			startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date			finishDate;

	@URL
	protected String			link;


	// Derived attributes ----------------------------------------------------

	// Relationships ---------------------------------------------------------


	@ManyToOne(optional=false)
	@Valid
	@NotNull
	private Practicum practicum;

}
