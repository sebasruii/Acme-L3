
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	// Atributes
	@Temporal(TemporalType.TIME)
	@PastOrPresent
	@NotNull
	protected Date				moment;

	@NotBlank
	@Size(max = 75)
	protected String			title;

	@NotBlank
	@Size(max = 100)
	protected String			message;

	protected Boolean			critical;

	@URL
	protected String			link;
}
