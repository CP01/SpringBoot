package he.contest.cp.spotify;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepo extends JpaRepository<Song, Integer> {

	//Song findOne(Integer id);

}
