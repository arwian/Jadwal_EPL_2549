package com.example.Jadwal_EPL_2549.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Match_akandatang {

	@SerializedName("events")
	private List<EventsItem> events;

	public void setEvents(List<EventsItem> events){
		this.events = events;
	}

	public List<EventsItem> getEvents(){
		return events;
	}
}