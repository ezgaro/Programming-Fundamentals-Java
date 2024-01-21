import java.util.*;

public class Main {
    static Map<String , Integer> types = Map.of("S" , 4 , "H" ,3 , "D" , 2 , "C", 1);
    static Map<String , Integer> power = new HashMap<>() {{
        put("2" , 2);
        put("3" ,3);
        put("4" , 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("10", 10);
        put("J", 11);
        put("Q" , 12);
        put("K" , 13);
        put("A" , 14);
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String , Set<String>> players = new LinkedHashMap<>();
        while(!input.equals("JOKER")) {
            String[] currInp = input.split(":");
            String playerName = currInp[0];
            if(!players.containsKey(playerName)) {
                players.put(playerName , new HashSet<>());
            }
            String[] cards = currInp[1].split(", ");
            players.get(playerName).addAll(Arrays.asList(cards));

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> stringSetEntry : players.entrySet()) {
            String playerName = stringSetEntry.getKey();
            int points = calculatePoints(stringSetEntry.getValue());
            System.out.printf("%s: %d\n" , playerName , points);
        }
    }

    private static int calculatePoints(Set<String> cards) {
        int points = 0;

        for (String card : cards) {
            String cardPower = card.substring(0, card.length() - 1);
            String type = String.valueOf(card.charAt(card.length() - 1));
            Integer powerValue = power.get(cardPower);
            Integer typeValue = types.get(type);
            if (powerValue != null && typeValue != null) {
                points += powerValue * typeValue;
            }
        }
        return points;
    }
}