package unit08;

import java.util.ArrayList;
import java.util.Collection;

public class JukeBoxDemo {

	public static void main(String[] args) {
		JukeBox jukebox = new JukeBox();
		
		Song s1 = new Song("GIRLS BE - Who Are You");
		Song s2 = new Song("Satellite Lovers - How much I love you, baby");
		Song s3 = new Song("Miruano  - Paper Moon");
		
		jukebox.addSong(s1);
		jukebox.addSong(s2);
		jukebox.addSong(s3);
		
		jukebox.printPlaylist();
		jukebox.size();
		
		jukebox.play();

		Collection<Song> moreSongs = new ArrayList<Song>();
		
		moreSongs.add(new Song("mei ehara - A Lidless Man"));
		moreSongs.add(new Song("Ichiko Aoba - Easter Lily"));
		
		jukebox.addSongs(moreSongs);
		jukebox.printPlaylist();
		jukebox.size();
		
	}

}
