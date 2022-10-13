package org.example.TPEnum;

public enum MessageType {

    A,
    B,
    C,
    D;

    public static  Priority getPriority(String message) {
       Priority priority = null;
        switch(message){
            case "A":
                priority = Priority.valueOf("HIGH");

                break;
            case "B":
                priority = Priority.valueOf("MEDIUM");
                break;
            case "C":
            case "D":
                priority =  Priority.valueOf("LOW");
                break;
            default:
                System.out.println("Pas de message associé");
        }
        return priority;
    }
}
