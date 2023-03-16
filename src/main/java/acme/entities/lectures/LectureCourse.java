
package acme.entities.lectures;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import acme.entities.courses.Course;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LectureCourse {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Relationships
	@ManyToOne(optional = false)
	@Valid
	@NotNull
	protected Course			course;

	@ManyToOne(optional = false)
	@Valid
	@NotNull
	protected Lecture			lecturer;
}
