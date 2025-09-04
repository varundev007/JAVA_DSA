package Hashing;

import java.util.HashMap;

public class itineraryForTickets {
    public static void main(String[] args) {
        HashMap<String, String> tickets= new HashMap<>();
        tickets.put("chennai", "bangaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
        String start= getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print("->"+ tickets.get(start));
            start=tickets.get(start);
        }
    }
    public static String getStart(HashMap<String,String> tickets) {
        HashMap<String, String> revTickets = new HashMap<>();
        for (String key : tickets.keySet()) {
            revTickets.put(tickets.get(key), key);
        }
        for(String  key : tickets.keySet()){
            if(!revTickets.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}
