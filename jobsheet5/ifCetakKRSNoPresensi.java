package jobsheet5;
import java.util.Scanner;
public class ifCetakKRSNoPresensi {
     static Scanner sc = new Scanner(System.in); 
     public static void main(String[] args) {
        System.out.println("===Print KRS SIAKAD===");
        System.out.print("Have the tuition fees been paid in full (TRUE/FALSE): ");
        boolean uktlunas = sc.nextBoolean();
            if (uktlunas) {
            System.out.print("UKT payment has been verified");
            System.out.println("KRS can now be printed and you can ask the academic advisor to sign it");
            } else {
            System.out.print("Registration rejected. Please pay UKT first.");
            }
        }
     }