
package acme.entities.tutorials;

import java.time.Duration;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import acme.framework.helpers.MomentHelper;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Session extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int				id;

	@NotBlank()
	@Size(max = 75)
	protected String			title;

	@NotBlank()
	@Size(max = 100)
	protected String			summary;

	@NotNull
	protected TypeSession		type;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				sessionInit;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				sessionFinish;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------


	protected Duration duration() {
		return MomentHelper.computeDuration(this.sessionInit, this.sessionFinish);

	}
	// Relationships ----------------------------------------------------------

}
