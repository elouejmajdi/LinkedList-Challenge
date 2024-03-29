package com.example.demo;

import java.util.*;

public class Album {

	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}

	public boolean addSong(String title, double duration) {

		if (findSong(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (Song song : songs) {
			if (song.getTitle().equals(title))
				return song;
		}
		return null;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber - 1;
		if ((index > 0) && (index <= this.songs.size())) {
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {

		Song song = findSong(title);
		if (song != null) {
			playList.add(song);
			return true;

		}
		System.out.println("This album does not have a title " + title);
		return false;

	}



}
