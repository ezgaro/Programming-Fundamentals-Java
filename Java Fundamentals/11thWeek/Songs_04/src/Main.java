import javax.naming.ldap.SortResponseControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Song{
        private String typeList;
        private String name;
        private String time;

        public Song (String typeList , String name , String time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTime(String time) {
            this.time = time;
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> listSongs = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");
            Song currentSong = new Song(inputSongArr[0] , inputSongArr[1] ,inputSongArr[2]);
            listSongs.add(currentSong);
        }
        String command = scanner.nextLine();
        if(command.equals("All")) {
            for(Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for(Song item: listSongs) {
                if(item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}

