package com.example.Jadwal_EPL_2549.model;

import com.google.gson.annotations.SerializedName;

public class TeamsItem{

	@SerializedName("idTeam")
	private String idTeam;

	@SerializedName("strTeamBadge")
	private String strTeamBadge;

	public void setIdTeam(String idTeam){
		this.idTeam = idTeam;
	}

	public String getIdTeam(){
		return idTeam;
	}

	public void setStrTeamBadge(String strTeamBadge){
		this.strTeamBadge = strTeamBadge;
	}

	public String getStrTeamBadge(){
		return strTeamBadge;
	}
}