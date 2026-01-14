package Exercicio_Exceptions.Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Exercicio_Exceptions.Model.Entites.Reservation;

public class program {
    public static void main(String[] args) throws ParseException {

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Room Number: ");
    Integer rommNumber = sc.nextInt();

    System.out.print("Checkin Date (dd/MM/yyyy): ");
    Date checkIn = sdf.parse(sc.next());
    System.out.print("CheckOut Date (dd/MM/yyyy): ");
    Date checkOut = sdf.parse(sc.next());

    Reservation reservation = null;
    if (! checkOut.after(checkIn)) {
        System.out.println("Error reservation: check-out date must be after check-in date");
    }
    else {
        reservation = new Reservation(rommNumber, checkIn, checkOut);
        System.out.println("Reservation: " + reservation);
    }

    System.out.println();

    System.out.println("Enter data to updated the reservation: ");

    System.out.print("Checkin Date (dd/MM/yyyy): ");
    checkIn = sdf.parse(sc.next());

    System.out.print("CheckOut Date (dd/MM/yyyy): ");
    checkOut = sdf.parse(sc.next());

    String error = reservation.updatedDates(checkIn, checkOut);
    if (error != null) {
        System.out.println("Error in reservation: " + error);
    }
    else {
        System.out.println("Reservation: " + reservation);
    }
    
    
    sc.close();
    }

}
