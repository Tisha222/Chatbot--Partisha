import java.util.Scanner;
public class Main
{


   //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
   //May want to create an array of goodbye answers.
   static String goodBye = "bye";
   static String[] response = {
       "Sorry, I am not completely sure. If you have any other questions, ask away!",
       "Sorry, could you rephrase your question?",
       "Sorry, I did not completely understand.",
       "Pardon, but I do not know the answer to your question. Can you please repeat?",
       "I don't know that information, please ask me anything else"
       };
    static String[] movieNames = {"smile", "conjuring", "megan", "m3gan", "mermaid", "ends with us", "fly me", "barbie", "beatle", "mean", "deadpool", "wolverine", "ghost", "buster", "frozen empire", "black panther", "wakanda"};
   static String[] food = {"popcorn", "nachos", "soda", "chocolate", "candy"};
   static double[] foodPrice = {3.99, 4.99, 2.99, 1.99, 0.99};
   //static String[] response2 = {"I hope that helped! You can always ask me more!", "It was nice chatting with you!", "Lets talk another time!"};
      public static void main(String[] args)
      {
       Scanner in = new Scanner (System.in);//Creates scanner object.
       //Creates a second scanner object.


       System.out.println("Hello! I am Partisha and I am a bot that can help answer questions regarding our movie theater.");
       System.out.println("Do you want to watch any one of these genres such as horror, romance, comedy, or action today? You can always just type 'bye' to exit the chat.");
       String userResp = in.nextLine();
       String userRespLower = userResp.toLowerCase();
       //in.nextLine() uses the scanner object to get the user's responnse as a String
       //System.out.println(userResp);
       //System.out.println("Bot says blah, expects an int now");
       //int numResp = in2.nextInt();//Gets the user's input as an integer.
       while (true) {
               if(isGoodbye(userRespLower)){
                       System.out.println("I hope that helped! You can always ask me more!");
                       break;
               }
               checkWord(userRespLower);
               userResp = in.nextLine();
               userRespLower = userResp.toLowerCase();
       }
     


       //You will need to make sure your chatbot continues looping until it sees certain keywords from the user such as "bye","goodbye"...
       // do you need a while loop or a for loop?
        
       //Consider: How do I check what the user says and compare it to my keywords? What methods do I have?
           
      }


      public static boolean isGoodbye(String a) {
               if (a.equalsIgnoreCase("bye")) {
                       return true;
               }
      
       return false;
       }


      public static void checkWord(String a) {
       Scanner in2 = new Scanner (System.in);
//        boolean isMovieAdded = constructMovie(a);
//        boolean isFoodAdded = constructFood(a);
        if (a.contains("action")) {
                System.out.print("That's my favorite! Some action movies currently playing are ");
                System.out.print("\033[1mDeadpool and Wolverine, Ghostbusters: Frozen Empire, and Black Panther: Wakanda Forever!\033[0m");  
                System.out.println(" Type the name of the movie you want to watch an I can add it to your shopping cart! Enter 'bye' to exit chat");

               }
       else if (a.contains("horror")) {
               System.out.print("Ooh.. I love a scary movie! The horror movies playing in our theatre are ");
               System.out.print("\033[1m Smile 2, Conjuring 3, and M3GAN.\033[0m");
               System.out.println(" Are you interested in watching any of these thrillers? Enter in the movie name you would like to watch so it can be added to your shopping cart! Just type 'bye' if you choose to stop the chat.");
               
               }
       else if (a.contains("romance")) {
               System.out.print("Aww, how sweet! Some heartwarming romance movies playing today are ");
                System.out.print("\033[1mIt Ends With Us, The Little Mermaid, and Fly Me to the Moon.\033[0m");
                System.out.println(" Let me know which of these movies interests you, and I will add it to your shopping cart! Remeber, you can always enter 'bye' to exit this chat.");
                
        }
       else if (a.contains("comedy")) {
               System.out.print("We all love to have a good laugh from time to time! Some hilarious comedy movies you may like are ");
               System.out.print("\033[1mBarbie, BeetleJuice, and Mean Girls.\033[0m ");
               System.out.println("Tell me which movie you want to watch today so I can add it to your shopping cart! You can end this chat by typing 'bye'.");
               
               }
       else if (a.contains("deadpool")|| a.contains("wolverine")) {
               System.out.println("Such an amazing choice! This movie is starts off when Deadpool's peaceful existence comes crashing down when the Time Variance Authority recruits him to help safeguard the multiverse!");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
               
       }
       else if (a.contains("ghost") ||
               a.contains("buster") ||
               a.contains("frozen") ||
               a.contains("empire")) {
               System.out.println("I love that movie! So the movie begins with the Spengler family as they return to the iconic New York City firehouse where the original Ghostbusters have taken ghost-busting to the next level.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }


       else if (a.contains("panther") ||
               a.contains("black") ||
               a.contains("wakanda")) {
               System.out.println("Good choice! Queen Ramonda, Shuri, M'Baku, Okoye and the Dora Milaje fight to protect their nation from intervening world powers in the wake of King T'Challa's death. ");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("smile")) {
               System.out.println("Oh my! What a thrilling selction! About to embark on a new world tour, global pop sensation Skye Riley begins to experience increasingly terrifying and inexplicable events.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("conjuring")) {
               System.out.println("The movie starts off with paranormal investigators Ed and Lorraine Warren take on one of the most sensational cases of their careers after a cop stumbles upon a dazed and bloodied young man walking down the road.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("m3gan") ||
               a.contains("megan")) {
               System.out.println("How exciting... and scary! M3GAN is a marvel of artificial intelligence, a lifelike doll that's programmed to be a child's greatest companion and a parent's greatest ally.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("ends") ||
               a.contains("with")) {
               System.out.println("What a wonderful selection! Lily Bloom moves to Boston to chase her lifelong dream of opening her own business.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("little") ||
               a.contains("mermaid")) {
               System.out.println("Oooh! A classic reinvented in live action! The youngest of King Triton's daughters, Ariel is a beautiful and spirited young mermaid with a thirst for adventure.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("fly me") ||
               a.contains("moon")) {
               System.out.println("How romantic! Sparks fly between a marketing executive and a NASA official as he makes preparations for the Apollo 11 moon landing. I am not telling any spoilers so get ready for a heartwarming experience!");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("barbie")) {
               System.out.println("I knew you had great choice, that's my favorite! Barbie and Ken are having the time of their lives in the colorful and seemingly perfect world of Barbie Land.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("beetle") ||
               a.contains("juice")) {
               System.out.println("You sure are in for a good laugh with that one! Still haunted by Beetlejuice, Lydia's life gets turned upside down when her daughter discovers a portal to the afterlife.");
               constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               constructFood(a);
       }
       else if (a.contains("mean") ||
               a.contains("girls")) {
               System.out.println("I love a good remake of a classic crowd favorite! New student Cady Heron gets welcomed into the top of the social food chain by an elite group of popular girls called the Plastics, ruled by the conniving queen bee Regina George.");
               //constructMovie(a);
               //String userFood = in2.nextLine();
               //String userFoodLower = userFood.toLowerCase();
               //constructFood(a);
       }

        else if(!constructMovie(a) && !constructFood(a)){
                System.out.println(getRandomResponse());
        }
      
      // else {       
        //System.out.println(getRandomResponse());
        
               //  for (int j = 0; j<movieNames.length; j++) {
               //                         if(!a.contains(movieNames[j])) {
               //                                 getRandomResponse();
               //                         }
               //                 }
               //  for (int k = 0; k<food.length; k++) {
               //                         if(!a.contains(food[k])) {
               //                                 getRandomResponse();
               //                         }
               //                 }
               // if(!constructMovie(a)||!constructFood(a)){


               // }
     
//        constructMovie(a);
//        for (int j = 0; j<movieNames.length; j++) {
//         if(!a.contains(movieNames[j])) {
//                 System.out.println(getRandomResponse());
//                 break;
//                 }
//         }
//        constructFood(a); 
//          for (int k = 0; k<food.length; k++) {
//                 if(!a.contains(food[k])) {
//                         System.out.println(getRandomResponse());
//                         break;
//                 }
//         }

        
       
      
      //}
      
      }
      static ShoppingCart cart = new ShoppingCart("a", "f", 0.0);
             
             
       public static boolean constructMovie(String a) {
               for (int i=0; i<movieNames.length; i++){
                       if(a.contains(movieNames[i])){
                               cart.setMovie(a);
                               cart.setPrice(10.0);
                               System.out.println(a+" is added to your shopping cart and your current cost is $" + cart.getPrice());
                               System.out.println("Would your like to select ONE snack from our menu? We have cheesy nachos for $4.99, butter popcorn for $3.99, soda for $2.99, chocolate for $1.99, and candy for $0.99.");
                                return true;
                       }
                }
                return false;
         }
       public static boolean constructFood(String f) {
               boolean foodAdded = false;
               f = f.toLowerCase();
               //double b =0.0;
               for (int i=0; i<food.length; i++){
                       if(f.contains(food[i])) {
                               //b = (double)i;
                               cart.setPrice(cart.getPrice()+ (double)foodPrice[i]);
                               System.out.println(food[i]+ " has been added to the shopping cart. Your total is now $"+ cart.getPrice());
                               System.out.println("Please enter 'bye' to begin watching your movie once you have finished shopping with us.");
                               foodAdded = true;
                               break;
                       }
               }
                       if (!foodAdded){
                               if(f.contains("no")||f.contains("don't")){
                                       System.out.println("Okay, enjoy your movie! Enter 'bye' if you are done shopping with us.");
                                       return true;
                               }
                       }
                       // else if (f.contains("no")|| f.contains("don't")){
                       //         System.out.println("Okay, enjoy your movie! Enter 'bye' if you are done shopping with us.");
                       // }
                       return foodAdded;
              
       }
                                     


      //Create other methods that might be helpful down here.
      //For example a method called checkWord where the user traverses through an array to check if a word matches.
     
      //One method you might need is getRandomResponse()
      public static String getRandomResponse(){
       int a = (int)(Math.random()*response.length);
       return response[a];
       }
    
 


}