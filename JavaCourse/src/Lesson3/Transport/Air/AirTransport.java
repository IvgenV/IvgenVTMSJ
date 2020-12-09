package Lesson3.Transport.Air;

import Lesson3.Transport.Transport;

public class AirTransport extends Transport {

    private int wingspan;
    private int minrunway;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinrunway() {
        return minrunway;
    }

    public void setMinrunway(int minrunway) {
        this.minrunway = minrunway;
    }
}
