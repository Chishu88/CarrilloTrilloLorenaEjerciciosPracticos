package org.example.models;

import org.example.exception.InvalidReservationException;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reservation {

    private String name;
    private String destiny;
    private LocalDate dateOfTravel;
    private Set<String> numberSeat;

    private static final int MAX_SEATS_AVAILABLE = 50;
    private static final int MAX_SEATS_PER_PERSON = 4;

    public Reservation() {
        this.numberSeat = new HashSet<>();
    }

    public Reservation(String name, String destiny, LocalDate dateOfTravel, Set<String> numberSeat) {
        this.name = name;
        this.destiny = destiny;
        this.dateOfTravel = dateOfTravel;
        this.numberSeat = numberSeat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public LocalDate getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(LocalDate dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Set<String> getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(Set<String> numberSeat) {
        this.numberSeat = numberSeat;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "name='" + name + '\'' +
                ", destiny='" + destiny + '\'' +
                ", dateOfTravel=" + dateOfTravel +
                ", numberSeat=" + numberSeat +
                '}';
    }

    public void makeReservation() {
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Enter your name: ");
                name = scanner.nextLine();

                // Check if the name is provided
                if (name.isEmpty()) {
                    System.out.println("Name is required for the reservation. Please enter a valid name.");
                }
            } while (name.isEmpty());

            System.out.println("Enter your destination: ");
            destiny = scanner.nextLine();

            System.out.println("Enter the travel date (YYYY-MM-DD): ");
            dateOfTravel = LocalDate.parse(scanner.nextLine());

            System.out.println("Enter the list of desired seats (maximum " + MAX_SEATS_PER_PERSON + " seats per person.): ");
            String seatsInput = scanner.nextLine();
            String[] seatsArray = seatsInput.split(",\\s*");

            // Check if more seats are being reserved than allowed per person
            if (seatsArray.length > MAX_SEATS_PER_PERSON) {
                throw new InvalidReservationException("Cannot reserve more than " + MAX_SEATS_PER_PERSON + " seats per person.");
            }

            // Check if there are enough available seats
            if (numberSeat.size() + seatsArray.length > MAX_SEATS_AVAILABLE) {
                throw new InvalidReservationException("Not enough available seats for the reservation.");
            }

            // Check if any seat is already reserved
            for (String seat : seatsArray) {
                if (numberSeat.contains(seat)) {
                    throw new InvalidReservationException("Seat " + seat + " is already reserved.");
                }

                numberSeat.add(seat);
            }

            // Reservation is successful
            System.out.println("Reservation successful for " + name + " on the flight to " + destiny +
                    " on the date " + dateOfTravel + " for seats " + numberSeat + ".");
        } catch (InvalidReservationException e) {
            System.out.println("Reservation error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
