package socialmedia;

public class YouTubeAdapter implements SocialMediaEntry {
	
	YouTubeAdapter(YouTubeVideo temp){
		video = temp;
	}
	
	private YouTubeVideo video;
	
	public String getUser() {
		return video.getAuthor();
	}

	public String getPostText() {
		return video.getTitle();
	}
}
