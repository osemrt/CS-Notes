package flyweight;

import java.util.HashMap;

public class PlayerFactory {


    private static HashMap<PlayerType, Player> playerHashMap = new HashMap<>();

    public static Player getPlayer(PlayerType playerType){

        Player player = null;

        if(playerHashMap.containsKey(playerType)){
            player = playerHashMap.get(playerType);
        }else{

            switch (playerType){
                case Counter_Terrorist :
                    System.out.println("A counter-terrorist was created");
                    player = new CounterTerrorist();
                    break;
                case Terrorist :
                    System.out.println("A terrorist was created");
                    player = new Terrorist();
                    break;
                default :
                    System.out.println("Unreachable code!");

            }

            playerHashMap.put(playerType, player);


        }

        return player;

    }


}
