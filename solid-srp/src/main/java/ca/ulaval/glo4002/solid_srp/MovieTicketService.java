package ca.ulaval.glo4002.solid_srp;

public class MovieTicketService {

	private TicketPrinter printer;
	private TicketFactory factory;

	public MovieTicketService(TicketPrinter printer) {
		this.printer = printer;
	}

	// TODO add : a flag to know if this is a student. Apply 10%.
	// TODO add : a flag to know whether the ticket should be printed or not.
	public void generateMovieTicket(int personAge, boolean studentRebate, boolean print) {
		factory = new TicketFactory();
		if (print) {
			print(factory.createTicket(personAge, studentRebate));
		} else {
			factory.createTicket(personAge, studentRebate);
		}
	}

	private void print(MovieTicket ticket) {
		printer.print(ticket);
	}
}
