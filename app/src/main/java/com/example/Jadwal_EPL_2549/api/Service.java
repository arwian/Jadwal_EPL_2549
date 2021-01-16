package com.example.Jadwal_EPL_2549.api;

import com.example.Jadwal_EPL_2549.model.Match_akandatang;
import com.example.Jadwal_EPL_2549.model.Match_berlalu;
import com.example.Jadwal_EPL_2549.model.TeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {
    @GET("eventspastleague.php")
    Call<Match_berlalu> getPreviousMatch(@Query("id") String id);

    @GET("eventsnextleague.php")
    Call<Match_akandatang> getNextMatch(@Query("id") String id);

    @GET("lookupteam.php")
    Call<TeamResponse> getTeam(@Query("id") String id);
}
