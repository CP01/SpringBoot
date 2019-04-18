package he.contest.cp.spotify;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
	
	@Autowired
	private SongsRepo songRepo;
	
	@RequestMapping("/song")
	public List<Song> getAllSongs() {
		return songRepo.findAll();
	}
	
	@RequestMapping("/song/{id}")
	public Optional<Song> getSong(@PathVariable Integer id) {
		return songRepo.findById(id);
	}
	
	@PostMapping("/song")
	public void addNewSong(@RequestBody Song song) {
		songRepo.save(song);
	}

}