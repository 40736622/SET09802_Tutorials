package unit08;

import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class JukeBox {
	private LinkedList<Song> playlist = new LinkedList<Song>();
	
	public JukeBox() {}
	
	public void addSong(Song song) {
		this.playlist.add(song);
	}
	
	public void play() {
		Song song = this.playlist.remove();
		String output = String.format("Playing %s", song.getTitle());
		JOptionPane.showMessageDialog(null, output, "Playing song", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void printPlaylist() {
		String output = "This playlist includes the following songs:\n";
		
		for (Song song : playlist) {
			output += String.format("%s\n", song.getTitle());
		}
		
		JOptionPane.showMessageDialog(null, output, "Playlist", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void size() {
		String output = String.format("Playlist size: %d", this.playlist.size());
		JOptionPane.showMessageDialog(null, output, "Size", JOptionPane.PLAIN_MESSAGE);
	}
	
	public void addSongs(Collection<Song> songs) {
		this.playlist.addAll(songs);
	}
}