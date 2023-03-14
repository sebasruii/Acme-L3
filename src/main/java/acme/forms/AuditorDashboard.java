
package acme.forms;

import acme.forms.Statistic;
import acme.framework.data.AbstractForm;

public class AuditorDashboard extends AbstractForm {

	protected static final long	serialVersionUID	= 1L;

	private Integer				totalNumAudits;

	// Average, deviation, minimum, and maximum number of auditing records in audits.
	private Statistic			audits;

	// Average, deviation, minimum, and maximum time of auditing records.
	private Statistic			auditRecs;
}
