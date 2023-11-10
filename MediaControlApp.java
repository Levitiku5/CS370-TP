public class MediaControlApp {

    // The IP address of the Raspberry Pi on the local network
    private String raspberryPiAddress = "http://192.168.1.x:8000";
    
    public void playMedia(String mediaUrl) {
        sendCommandToServer(raspberryPiAddress + "/play?url=" + mediaUrl);
    }

    // Methods for pause, stop, etc.

    private void sendCommandToServer(String url) {
        // Implementation to send HTTP GET request to the given URL
        // This could be implemented using libraries like OkHttp for Android
    }
}
#Testing
