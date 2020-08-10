public class Main {
    public static void main(String[] args) {
        String role = "admin"; //if case is int then switch string to int = 1;

        switch (role){ //comparing the calue of rule with String 
            case "admin":
            System.out.println("You're an admin");
            break;

            case "moderator":
            System.out.println("You're a moderator");
            break;

            default:
            System.out.println("You're a guest");
        }
        // //this is the same thing as the code above just not using switch
        // //if (role == "admin")
        //     System.out.println("You're an admin");
        // //else if (role == "moderator")
        //     System.out.println("You're a moderator");
        // else
        //     System.out.println("You're a guest");

    }
    
}