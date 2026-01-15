package Exercicio_AulaExceptions.Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Exercicio_AulaExceptions.Model.Entites.Reservation;
import Exercicio_AulaExceptions.Model.Exceptions.DomainException;

public class program {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
        System.out.print("Room Number: ");
        Integer rommNumber = sc.nextInt();

        System.out.print("Checkin Date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        
        System.out.print("CheckOut Date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        Reservation reservation = new Reservation(rommNumber, checkIn, checkOut);
        System.out.println("Reservation: " + reservation);

        System.out.println();
        System.out.println("Enter data to updated the reservation: ");
        System.out.print("Checkin Date (dd/MM/yyyy): ");
        checkIn = sdf.parse(sc.next());
        
        System.out.print("CheckOut Date (dd/MM/yyyy): ");
        checkOut = sdf.parse(sc.next());

        reservation.updatedDates(checkIn, checkOut);
        System.out.println("Reservation: " + reservation);
    }
    catch (ParseException e){
        System.out.println("Invalid date formate");
    }
    catch (DomainException e){
        System.out.println("Error in reservation: " + e.getMessage());
    }
    catch (RuntimeException e){
        System.out.println("Unexpected error ");
    }

    sc.close();

    }

}
