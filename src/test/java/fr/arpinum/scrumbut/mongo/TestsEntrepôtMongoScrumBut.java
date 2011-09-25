package fr.arpinum.scrumbut.mongo;

import fr.arpinum.scrumbut.domaine.ScrumBut;
import fr.bodysplash.mongolink.test.FakePersistentContext;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class TestsEntrepôtMongoScrumBut {

    @Rule
    public FakePersistentContext context = new FakePersistentContext("fr.arpinum.scrumbut.mongo.mapping");

    @Test
    public void peutPersister() {
        final ScrumBut scrumBut = new ScrumBut("test", "tagada");
        final EntrepôtMongoScrumBut entrepôt = new EntrepôtMongoScrumBut(context.getSession());

        entrepôt.ajoute(scrumBut);
        context.getSession().clear();

        final ScrumBut scrumTrouvé = entrepôt.récupère(scrumBut.getId());
        assertThat(scrumTrouvé, not(scrumBut));
        assertThat(scrumTrouvé, notNullValue());
        assertThat(scrumTrouvé.getRaison(), is( "test"));
        assertThat(scrumTrouvé.getContournement(), is("tagada"));
    }
}
