package Week2A;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {

    public static void main(String[] args) {
        System.out.println(getSongStrings());
    }//main

    public static List<String> getSongStrings(){
        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$1U");
        songs.add("havana");
        songs.add("Cassidy");
        songs.add("50 Ways");
        return songs;
    }//method
}//class
