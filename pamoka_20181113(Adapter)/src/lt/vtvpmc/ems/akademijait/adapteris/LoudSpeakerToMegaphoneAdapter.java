package lt.vtvpmc.ems.akademijait.adapteris;

public class LoudSpeakerToMegaphoneAdapter implements Megaphone {

    private LoudSpeaker loudspeaker;

    public LoudSpeakerToMegaphoneAdapter(LoudSpeaker loudspeaker) {
        this.loudspeaker = loudspeaker;
    }

    @Override
    public String speak(String message) {
        return this.loudspeaker.speakInto(message);
    }

}
