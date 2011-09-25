package fr.arpinum.scrumbut.mongo;

import fr.arpinum.scrumbut.domaine.ScrumBut;
import fr.bodysplash.mongolink.MongoSession;

public class EntrepôtMongoScrumBut {
    public EntrepôtMongoScrumBut(MongoSession session) {
        this.session = session;
    }

    public void ajoute(ScrumBut élément) {
        session.save(élément);
    }

    public ScrumBut récupère(String id) {
        return session.get(id, ScrumBut.class);
    }

    private MongoSession session;
}
