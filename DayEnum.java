// Enum to represent the different types of movie tickets
enum TicketType {
    REGULAR, VIP, STUDENT, SENIOR
}

// MovieTicket class to handle ticket prices based on type
class MovieTicket {
    private static final double BASE_PRICE = 10.0;
    private TicketType type;

    // Constructor
    public MovieTicket(TicketType type) {
        this.type = type;
    }

    // Method to calculate ticket price based on type
    public double getTicketPrice() {
        switch (type) {
            case VIP:
                return BASE_PRICE + 5.0;  // Additional charge for VIP tickets
            case STUDENT:
                return BASE_PRICE * 0.8;  // 20% discount for Student tickets
            case SENIOR:
                return BASE_PRICE * 0.7;  // 30% discount for Senior tickets
            default:
                return BASE_PRICE;        // Regular price for Regular tickets
        }
    }

    // Override toString method to display ticket type and price
    @Override
    public String toString() {
        return type + " Ticket Price: $" + String.format("%.2f", getTicketPrice());
    }
}

// Main class to demonstrate the ticket system
public class Main {
    public static void main(String[] args) {
        // Creating tickets for each type
        MovieTicket regularTicket = new MovieTicket(TicketType.REGULAR);
        MovieTicket vipTicket = new MovieTicket(TicketType.VIP);
        MovieTicket studentTicket = new MovieTicket(TicketType.STUDENT);
        MovieTicket seniorTicket = new MovieTicket(TicketType.SENIOR);

        // Displaying the price for each ticket type
        System.out.println(regularTicket);
        System.out.println(vipTicket);
        System.out.println(studentTicket);
        System.out.println(seniorTicket);
    }
}
