
package acme.entities.practicumSessions;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.Valid;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

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
	private Practicum practicum;

}
