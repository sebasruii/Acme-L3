
package acme.entities.audits;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditingRecord extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@NotBlank(message = "Subject cannot be blank")
	@Size(max = 75, message = "Subject must be shorter than 76 characters")
	protected String			subject;

	@NotBlank(message = "Assessment cannot be blank")
	@Size(max = 100, message = "Assessment must be shorter than 101 characters")
	protected String			assessment;

	protected LocalDateTime		period;

	@NotBlank(message = "Mark cannot be blank")
	@Pattern(regexp = "A\\+?|B|C|F-?", message = "Mark must be one of 'A+', 'A', 'B', 'C', 'F', or 'F-'")
	protected String			mark;

	@URL
	protected String			link;

}
