package com.example.demo;

import java.util.*;

public class Main {

	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {

		Album album = new Album("Hip Hop", "Cardi B");
		album.addSong("Love", 2.90);
		album.addSong("yes", 4.29);
		album.addSong("Holy man", 5);
		album.addSong("Hold on", 3.28);
		album.addSong("You can't do it right", 7.11);

		albums.add(album);

		album.addSong("Speed King", 2.90);
		album.addSong("Oh yeah", 4.29);
		album.addSong("big heart", 5.01);
		album.addSong("Money", 3.28);
		album.addSong("I hate you after that night", 7.11);

		albums.add(album);

		LinkedList<Song> playlist = new LinkedList<Song>();
		albums.get(0).addToPlayList("You can't do it right", playlist);
		albums.get(0).addToPlayList(2, playlist);
		albums.get(1).addToPlayList("Money", playlist);
		albums.get(1).addToPlayList(4, playlist);

		play(playlist);

	}

	private static void play(LinkedList<Song> playlist) {
		ListIterator<Song> iterator = playlist.listIterator();
		if (playlist == null || playlist.size() == 0) {
			System.out.println("No songs in playlist !!");
		} else {
			System.out.println("Now playing " + iterator.next().toString());
		}

	}

}
