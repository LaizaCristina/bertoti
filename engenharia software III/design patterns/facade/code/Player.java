class Player {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;
    private SubtitlePlayer subtitlePlayer;

    public Player() {
        audioPlayer = new AudioPlayer();
        videoPlayer = new VideoPlayer();
        subtitlePlayer = new SubtitlePlayer();
    }

    public void playAudio(String audioFile) {
        audioPlayer.playAudio(audioFile);
    }

    public void playVideo(String videoFile) {
        videoPlayer.playVideo(videoFile);
    }

    public void showSubtitles(String subtitleFile) {
        subtitlePlayer.showSubtitles(subtitleFile);
    }
}