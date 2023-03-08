
package acme.entities.practicums;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import acme.entities.practicumSessions.PracticumSession;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Practicum extends AbstractEntity {

	// Serialisation identifier ----------------------------------------------

	protected static final long		serialVersionUID	= 1L;

	// Attributes ------------------------------------------------------------
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}\\d\\d{3}")
	protected String				code;

	@NotBlank
	@Length(max = 75)
	protected String				title;

	@NotBlank
	@Length(max = 100)
	protected String				summary;

	@NotBlank
	@Length(max = 100)
	protected ArrayList<String>		goals;

	// Derived attributes ----------------------------------------------------

	// Relationships ---------------------------------------------------------


}
