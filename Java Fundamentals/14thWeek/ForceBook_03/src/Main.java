import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.next();


        LinkedHashMap<String , List<String>> map = new LinkedHashMap<>();
        while(!command.equals("Lumpawaroo")) {
            if(command.contains(" | ")) {
                String group = command.split(" \\| ")[0];
                String user = command.split(" \\| ")[1];
                if(!map.containsKey(group)) {
                    map.put(group , new ArrayList<>());
                }

                boolean isExistUser = false;
                for(List<String> listUsers : map.values()) {
                    if(listUsers.contains(user)) {
                        isExistUser = true;
                    }
                }
                if(!isExistUser) {
                    map.get(group).add(user);
                }

            } else if(command.contains(" -> ")) {
                String group = command.split(" -> ")[0];
                String user = command.split(" -> ")[1];

                map.entrySet().forEach(entry -> entry.getValue().remove(user));

                if(map.containsKey(group)) {
                    map.get(group).add(user);
                } else {
                    map.put(group , new ArrayList<>());
                    map.get(group).add(user);
                }

                System.out.printf("%s joins the %s side!%n" , user , group);
            }
            command = scanner.next();
        }
        map.entrySet().stream().filter(entry -> !entry.getValue().isEmpty())
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey() , entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });
    }
}