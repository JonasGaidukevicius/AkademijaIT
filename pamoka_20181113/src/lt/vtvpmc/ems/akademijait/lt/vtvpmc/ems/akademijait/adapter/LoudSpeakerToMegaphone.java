package lt.vtvpmc.ems.akademijait.lt.vtvpmc.ems.akademijait.adapter;

public class LoudSpeakerToMegaphone implements Megaphone {

    LoudSpeaker loadspeaker;

    public LoudSpeakerToMegaphone(LoudSpeaker loadspeaker){
        this.loadspeaker = loadspeaker;
    }

    @Override
    public String speak(String message) {
        return null;
    }
}
