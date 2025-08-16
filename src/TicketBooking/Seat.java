package TicketBooking;

public class Seat {

    private int seatNumber;
    private  boolean isBooked;

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
