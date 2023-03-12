
package acme.entities.lectures;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.NatureType.NatureType;
import acme.entities.courses.Course;
import acme.framework.data.AbstractEntity;
import acme.roles.Lecturer;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture extends AbstractEntity {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes
	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			lectureAbstract;

	// In hours
	@Positive
	@NotNull
	protected Double			estimatedLearningTime;

	@NotBlank
	@Length(max = 100)
	protected String			body;

	@NotNull
	protected NatureType		lectureType;

	@URL
	protected String			moreInfo;

	// Relationships
	@ManyToOne(optional = true)
	@Valid
	protected Course			course;

	@ManyToOne(optional = false)
	@Valid
	protected Lecturer			lecturer;
}
