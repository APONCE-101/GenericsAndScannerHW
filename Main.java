public class Main {
    public static void main(String[] args) {
        Department<Wind> winds = new Department<>("Wind Instruments");
        Department<Stringed> strings = new Department<>("Stringed Instruments");
        Department<Percussion> percussion = new Department<>("Percussion Instruments");

        Wind w1 = new Wind("French Horn");
        Wind w2 = new Wind("Flute");
        Wind w3 = new Wind("Clarinet");

        Stringed s1 = new Stringed("Bass");
        Stringed s2 = new Stringed("Guitar");
        Stringed s3 = new Stringed("Violin");

        Percussion p1 = new Percussion("Snare Drum");
        Percussion p2 = new Percussion("Timpani");
        Percussion p3 = new Percussion("Gong");

        winds.addInstrument(w1);
        winds.addInstrument(w2);
        winds.addInstrument(w3);

        strings.addInstrument(s1);
        strings.addInstrument(s2);
        strings.addInstrument(s3);

        percussion.addInstrument(p1);
        percussion.addInstrument(p2);
        percussion.addInstrument(p3);

    }
}

