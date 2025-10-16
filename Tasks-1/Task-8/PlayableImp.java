class MusicPlayer implements Playable
{
    @Override
    public void play()
    {
        System.err.println("i am musicplayer");
    }
}
class VideoPlayer implements Playable
{
    @Override
    public void play()
    {
        System.err.println("i am videoplayer");
    }
}
public class PlayableImp
{
    public static void main(String[] args) {
        MusicPlayer m=new MusicPlayer();
        m.method();
        System.err.println(Playable.playing());
        m.play();
        VideoPlayer v= new VideoPlayer();
        v.play();
    }
}