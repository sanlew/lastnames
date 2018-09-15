package com.javafx.lastnames.model;

public class Connection {

	private String topic;

	public Lastname connect(String name, String [] suffixes, String type){
		Topic t = new Topic();
		topic = t.findTopic(name, type);

		Lastname l = new Lastname();
		if(suffixes!=null){
			l.setNominative(topic+suffixes[2]);
			l.setGenitive(topic+suffixes[3]);
			l.setDative(topic+suffixes[4]);
			l.setAccusative(topic+suffixes[5]);
			l.setInstrumental("z "+topic+suffixes[6]);
			l.setLocative("o "+topic+suffixes[7]);
			l.setVocative(topic+suffixes[8]);
		}
		else
		{
			l.setNominative(name);
			l.setGenitive("Brak wzorca odmiany");
			l.setDative("Brak wzorca odmiany");
			l.setAccusative("Brak wzorca odmiany");
			l.setInstrumental("Brak wzorca odmiany");
			l.setLocative("Brak wzorca odmiany");
			l.setVocative("Brak wzorca odmiany");
		}

		return l;

	}

}
