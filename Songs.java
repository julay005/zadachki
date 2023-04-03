package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    public static class Song {
        public String type;
        public String name;
        public String time;


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
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

        public void setTime(String time) {
            this.time = time;
        }

    }


    public  static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("_");

            String type = info[0];
            String name = info[1];
            String time = info[2];

            Song song = new Song();

            song.setType(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);

        }
        String typeSong = scanner.nextLine();

        if (typeSong.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song: songs) {
                if(song.getType().equals(typeSong)){
                    System.out.println(song.getName());
                }

            }
        }

    }
}
