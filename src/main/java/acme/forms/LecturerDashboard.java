
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LecturerDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						handsOnLecturesCount;
	Integer						theoryLecturesCount;
	Statistics					lecturesStatistics;
	Statistics					coursesStatistics;

}
