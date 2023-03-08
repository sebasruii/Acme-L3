
package acme.entities.lectures;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture extends AbstractEntity {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Atributes
	@NotBlank
	@Size(max = 75)
	protected String			title;

	@NotBlank
	@Size(max = 100)
	protected String			lectureAbstract;

	// In hours
	@Positive
	@NotNull
	protected Double			estimatedLearningTime;

	@NotBlank
	@Size(max = 100)
	protected String			body;

	@NotNull
	protected LectureType		lectureType;

	@URL
	protected String			moreInfo;
}
