package fr.arpinum.scrumbut.domaine;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestsScrumBut {

    @Test
    public void peutCréerUnScrumBut() {
        final ScrumBut scrumBut = new ScrumBut("on a pas le temps de faire des tests", "donc on fait les recettes en chine");

        assertThat(scrumBut.getRaison(), is("on a pas le temps de faire des tests"));
        assertThat(scrumBut.getContournement(), is("donc on fait les recettes en chine"));
    }
}
