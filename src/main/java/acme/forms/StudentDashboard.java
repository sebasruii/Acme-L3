
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	private Integer				totalActivities;

	private Double				avgActivityTime;
	private Double				devActivityTime;
	private Double				minActivityTime;
	private Double				maxActivityTime;

	private Double				avgLearningTime;
	private Double				devLearningTime;
	private Double				minLearningTime;
	private Double				maxLearningTime;

}
