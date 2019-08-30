package com.nader.aria.nader_assistant.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="REFERENCES_SEQUENCES")
/*@NamedQuery(name = ReferencesSequence.GET_LAST_RANK_BY_DISCRIMINATOR,
        query = "select r.lastRank from ReferencesSequence as r where r.id = ( select max(r.id) from ReferencesSequence as r ) and r.discriminator =:discriminator ")*/

public final class ReferencesSequence extends BaseEntity {

        //public final static String GET_LAST_RANK_BY_DISCRIMINATOR = "referencesSequence.getLastRankByDiscriminator";

        public final static String AIM = "aim";
        public final static String SPRINT = "sprint";
        public final static String TASK = "task";
        public final static String IDEA = "idea";
        public final static String NOTE = "note";

        @Column(name="LAST_RANK")
        private Integer lastRank;


        @Column(name="DISCRIMINATOR")
        private String discriminator;

        public Integer getLastRank(){ return lastRank; }
        public void setLastRank(Integer lastRank){ this.lastRank = lastRank; }


        public String getDiscriminator(){ return discriminator; }
        public void setDiscriminator(String discriminator){ this.discriminator = discriminator; }


}
