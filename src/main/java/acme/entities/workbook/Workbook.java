
package acme.entities.workbook;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Workbook extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			sumary;

	@NotNull
	protected TypeActivity		typeActivity;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				periodInit;

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	protected Date				periodFinish;

	@URL
	protected String			optionalnfo;

}
