package fr.arpinum.scrumbut.mongo.mapping;

import fr.arpinum.scrumbut.domaine.ScrumBut;
import fr.bodysplash.mongolink.domain.mapper.ClassMap;

public class ScrumButMapping extends ClassMap<ScrumBut> {
    
    public ScrumButMapping() {
        super(ScrumBut.class);
    }

    @Override
    public void map() {
        id(element().getId()).auto();
        property(element().getRaison());
        property(element().getContournement());
    }
}
