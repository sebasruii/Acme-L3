
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

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.practicums.Practicum;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "practicumSession")
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

	@NotNull
	protected LocalDate			startDate;

	@NotNull
	protected LocalDate			finishDate;

	@URL
	protected String			link;


	@Transient
	public boolean IsValid() {
		boolean result = false;
		final Period period1 = Period.between(this.finishDate, this.startDate);
		final Period period2 = Period.between(this.startDate, LocalDate.now());
		if (period1.getDays() >= 7 && period2.getDays() >= 7)
			result = true;
		return result;
	}

	// Derived attributes ----------------------------------------------------

	// Relationships ---------------------------------------------------------


	@ManyToOne()
	@JoinColumn(name = "practicum_id")
	private Practicum practicum;

}
