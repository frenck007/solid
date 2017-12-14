package ca.ulaval.glo4002.solid_srp;

public class TicketFactory {

	private static final int MAXIMUM_AGE_CHILD_PRICE = 10;

	public MovieTicket createTicket(int personAge, boolean studentRebate) {

		if (personAge > MAXIMUM_AGE_CHILD_PRICE) {
			if (studentRebate) {
				return new StudentRegularMovieTicket();
			} else {
				return new RegularMovieTicket();
			}
		} else {
			if (studentRebate) {
				return new StudentChildMovieTicket();
			} else {
				return new ChildMovieTicket();
			}
		}
	}
}
