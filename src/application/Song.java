package application;

public class Song {
	private String name;
	private String artist;
	private String album;
	private int year;
	
	public Song (String name, String artist, String album, int year) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	
	//Getter methods
	public String getName(){
		return name;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getAlbum(){
		return album;
	}
	
	public int getYear(){
		return year;
	}
	
	//Setter methods
	public void setName(String newName) {
		name = newName;
	}
	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	public void setAlbum(String newAlbum) {
		album = newAlbum;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}
	
	
	@Override
	public String toString() { return artist + "-" + name; }
	
}
