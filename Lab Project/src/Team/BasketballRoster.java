package Team;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class BasketballRoster extends Roster {
   
    private int slot;
    private BasketballPlayer team[];
    private BasketballPlayer starters[];
    public BasketballRoster(){
        this.setTeamSize(12);
        this.setStartersSize(5);
         initTeam();
        this.team = new BasketballPlayer[12];
        this.starters = new BasketballPlayer[5];
    }

    
    public void establishTeam(){
        // Scanner input = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            int run = 10;
            System.out.println("How many players do you currently have? (Minimum 5, Max 13) ");

            // run = input.nextInt();
            // String test = input.readLine();
            run = Integer.parseInt(input.readLine());
            while (run < 5 || run > 13){
                System.out.println("Invalid Number");
                System.out.println("How many players do you currently have? (Minimum 5, Max 13) ");
                // run = input.nextInt();
                run = Integer.parseInt(input.readLine());
            }
           

           System.out.println("Please enter the players names"); 
            for(int i = 0; i < run; i++){
                this.addToTeam(i, input);
            }
            input.close();
        } catch(IOException exception){
            System.out.println("Exception: " + exception.getMessage());
        }

    }
        //Current issue does not set the players name
    public void addToTeam(int slot, BufferedReader input){
        System.out.println("What is the players name?" );
        // Scanner input = new Scanner(System.in);
        try {
            String nameToSet = input.readLine();
            this.team[slot] = new BasketballPlayer(nameToSet);
            // for (String nameToSet = input.readLine(); nameToSet != null; nameToSet = input.readLine()) {
            //     this.team[slot] = new BasketballPlayer(nameToSet);
            //     slot++;
                
            //  }
        } catch (Exception e) {
            System.out.println("Error:addToTeam " + e.getMessage());
        }
   
        

        // if (input.hasNext()) {
        //     String nameToSet = input.readLine();
        //     this.team[slot] = new BasketballPlayer(nameToSet);
        //     slot++;
        //     input.close();
        // }
       
    }

    public void getTeam(){
        for(int i = 0; i < team.length; i++){
            if(team[i] != null){
            System.out.println("Player " + (i + 1) + ": " + team[i].getName());
            }else{
                System.out.println("Player " + (i + 1) +": "+"Empty");
            }
        }
    }

    public void getStarters(){
        if(starters[0] != null){
        System.out.println("Point Guard 1: " + starters[0].getName() );
        }else{
            System.out.println("Point Guard 1: Empty");
        }
        if(starters[1] != null){
            System.out.println("Shooting Guard 2: " + starters[1].getName() );
            }else{
                System.out.println("Shooting Guard 2: Empty");
            }
         if(starters[2] != null){
            System.out.println("Small Forward 3: " + starters[2].getName() );
        }else{
            System.out.println("Small Forward 3: Empty");
        }
        if(starters[3] != null){
            System.out.println("Power Forward 4: " + starters[3].getName() );
            }else{
                System.out.println("Power Forward 4: Empty");
            }
         if(starters[4] != null){
            System.out.println("Center 5: " + starters[4].getName() );
        }else{
            System.out.println("Center 5: Empty");
        }
        

        
        
    }

    
    //public BasketballPlayer getSpecificPlayer(int num){
      //  return this.team[num];
    //}

  
    //public void setStarters(int size, BasketballPlayer player) {
      //  this.starters[size] = player;
    //}

    public void addToTeam(){
            
    }


}
