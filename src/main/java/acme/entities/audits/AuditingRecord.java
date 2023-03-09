
package acme.entities.audits;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.time.DurationMin;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditingRecord extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank(message = "Subject cannot be blank")
	@Length(max = 75, message = "Subject must be shorter than 76 characters")
	protected String			subject;

	@NotBlank(message = "Assessment cannot be blank")
	@Length(max = 100, message = "Assessment must be shorter than 101 characters")
	protected String			assessment;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	protected Date				periodStart;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	@DurationMin(hours = 1)
	protected Date				periodEnd;

	@Valid
	@NotNull
	@ManyToOne(optional = false)
	protected Audit				audit;

	@NotBlank(message = "Mark cannot be blank")
	@Pattern(regexp = "A\\+?|B|C|F-?", message = "Mark must be one of 'A+', 'A', 'B', 'C', 'F', or 'F-'")
	protected String			mark;

	@URL
	protected String			link;

}
