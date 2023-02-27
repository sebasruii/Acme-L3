
package acme.entities.offers;

import java.time.Duration;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import acme.framework.helpers.MomentHelper;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Offer extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int				id;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	@NotNull
	protected Date				instantiation;

	@NotBlank
	@Size(max = 75)
	protected String			heading;

	@NotBlank
	@Size(max = 100)
	protected String			summary;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				availabilityInit;
    
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				availabilityFinish;


	@Transient
	public boolean availabilityIsValid() {
		boolean result;
		final Duration instantiatonAvaibilityInit = MomentHelper.computeDuration(this.instantiation, this.availabilityInit);
		final Integer initLapse = instantiatonAvaibilityInit.compareTo(Duration.ofDays(1));
		final Integer avaibilityLapse = this.duration().compareTo(Duration.ofDays(7));
		result = initLapse >= 0 && avaibilityLapse >= 0;
		return result;
	}


	
	@Positive
	protected Integer	price;

	@URL
	protected String	link;

	// Derived attributes -----------------------------------------------------


	protected Duration duration() {
		return MomentHelper.computeDuration(this.availabilityInit, this.availabilityFinish);

	}

	// Relationships ----------------------------------------------------------

}
