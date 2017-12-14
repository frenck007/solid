package ca.ulaval.glo4002.solid_srp;

public class StudentRegularMovieTicket extends MovieTicket {

	private static final float PRICE = 15.0f;
	private static final float STUDENT_REBATE = 0.15f;

	public StudentRegularMovieTicket() {
		super(PRICE * (1 - STUDENT_REBATE));
	}
}
