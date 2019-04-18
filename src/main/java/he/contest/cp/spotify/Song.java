package he.contest.cp.spotify;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String artists;
	private Double danceability;
	private Double energy;
	private Integer key;
	private Double loudness;
	private Integer mode;
	private Double speechiness;
	private Double acousticness;
	private Double instrumentalness;
	private Double liveness;
	private Double valence;
	private Double tempo;
	private Integer duration_ms;
	private Integer time_signature;
	private Integer rank;
	
	public Song() {}
	
	/*
	 * public Song(String name, String artists, Integer rank) { super(); this.name =
	 * name; this.artists = artists; this.rank = rank; }
	 */

	public Song(Integer id, String name, String artists, Double danceability, Double energy, Integer key, Double loudness,
			Integer mode, Double speechiness, Double acousticness, Double instrumentalness, Double liveness,
			Double valence, Double tempo, Integer duration_ms, Integer time_signature, Integer rank) {
		super();
		this.id = id;
		this.name = name;
		this.artists = artists;
		this.danceability = danceability;
		this.energy = energy;
		this.key = key;
		this.loudness = loudness;
		this.mode = mode;
		this.speechiness = speechiness;
		this.acousticness = acousticness;
		this.instrumentalness = instrumentalness;
		this.liveness = liveness;
		this.valence = valence;
		this.tempo = tempo;
		this.duration_ms = duration_ms;
		this.time_signature = time_signature;
		this.rank = rank;
	}

	/*
	 * public Song(String name, String artists, Double danceability, Double energy,
	 * Integer key, Double loudness, Integer mode, Double speechiness, Double
	 * acousticness, Double instrumentalness, Double liveness, Double valence,
	 * Double tempo, Integer duration_ms, Integer time_signature, Integer rank) {
	 * super(); this.name = name; this.artists = artists; this.danceability =
	 * danceability; this.energy = energy; this.key = key; this.loudness = loudness;
	 * this.mode = mode; this.speechiness = speechiness; this.acousticness =
	 * acousticness; this.instrumentalness = instrumentalness; this.liveness =
	 * liveness; this.valence = valence; this.tempo = tempo; this.duration_ms =
	 * duration_ms; this.time_signature = time_signature; this.rank = rank; }
	 */

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists;
	}
	public Double getDanceability() {
		return danceability;
	}
	public void setDanceability(Double danceability) {
		this.danceability = danceability;
	}
	public Double getEnergy() {
		return energy;
	}
	public void setEnergy(Double energy) {
		this.energy = energy;
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Double getLoudness() {
		return loudness;
	}
	public void setLoudness(Double loudness) {
		this.loudness = loudness;
	}
	public Integer getMode() {
		return mode;
	}
	public void setMode(Integer mode) {
		this.mode = mode;
	}
	public Double getSpeechiness() {
		return speechiness;
	}
	public void setSpeechiness(Double speechiness) {
		this.speechiness = speechiness;
	}
	public Double getAcousticness() {
		return acousticness;
	}
	public void setAcousticness(Double acousticness) {
		this.acousticness = acousticness;
	}
	public Double getInstrumentalness() {
		return instrumentalness;
	}
	public void setInstrumentalness(Double instrumentalness) {
		this.instrumentalness = instrumentalness;
	}
	public Double getLiveness() {
		return liveness;
	}
	public void setLiveness(Double liveness) {
		this.liveness = liveness;
	}
	public Double getValence() {
		return valence;
	}
	public void setValence(Double valence) {
		this.valence = valence;
	}
	public Double getTempo() {
		return tempo;
	}
	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}
	public Integer getDuration_ms() {
		return duration_ms;
	}
	public void setDuration_ms(Integer duration_ms) {
		this.duration_ms = duration_ms;
	}
	public Integer getTime_signature() {
		return time_signature;
	}
	public void setTime_signature(Integer time_signature) {
		this.time_signature = time_signature;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", artists=" + artists + ", danceability=" + danceability
				+ ", energy=" + energy + ", key=" + key + ", loudness=" + loudness + ", mode=" + mode + ", speechiness="
				+ speechiness + ", acousticness=" + acousticness + ", instrumentalness=" + instrumentalness
				+ ", liveness=" + liveness + ", valence=" + valence + ", tempo=" + tempo + ", duration_ms="
				+ duration_ms + ", time_signature=" + time_signature + ", rank=" + rank + "]";
	}

}
