package org.example;

import org.example.TPEnum.MessageType;
import org.example.TPEnum.Priority;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type de Message?");
        String message = sc.next();
        Priority priorite = MessageType.getPriority(message);
        if( priorite == null){
            while(priorite == null){
                System.out.println("veuillez réessayer");
                 message = sc.next();
                 priorite = MessageType.getPriority(message);
            }

        }
            System.out.println(message + " " + priorite);
    }
}