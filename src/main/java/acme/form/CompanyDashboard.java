
package acme.form;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompanyDashboard extends AbstractForm {
	// Serialisation identifier ---------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -----------------------------------------------------------

	private int					totalPracticums;
	private double				avgSessionTime;
	private double				devSessionTime;
	private double				minSessionTime;
	private double				maxSessionTime;
	private double				avgPracticumTime;
	private double				devPracticumTime;
	private double				minPracticumTime;
	private double				maxPracticumTime;

	// Derived attributes ---------------------------------------------------

	// Relationships --------------------------------------------------------

}
