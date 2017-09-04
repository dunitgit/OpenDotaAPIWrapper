package me.dunit.dota;

import org.junit.Test;

public class OpenDotaAPIWrapperTest {

    private final int id = 1;

    @Test
    public void getMatches() throws Exception {
        OpenDotaAPIWrapper.getMatches(id);
    }

    @Test
    public void getPlayers() throws Exception {
        OpenDotaAPIWrapper.getPlayers(id);
    }

    @Test
    public void getPlayersWL() throws Exception {
        OpenDotaAPIWrapper.getPlayersWL(id);
    }

    @Test
    public void getPlayersRecentMatches() throws Exception {
        OpenDotaAPIWrapper.getPlayersRecentMatches(id);
    }

    @Test
    public void getPlayersMatches() throws Exception {
        OpenDotaAPIWrapper.getPlayersMatches(id);
    }

    @Test
    public void getPlayersHeroes() throws Exception {
        OpenDotaAPIWrapper.getPlayersHeroes(id);
    }

    @Test
    public void getPlayersPeers() throws Exception {
        OpenDotaAPIWrapper.getPlayersPeers(id);
    }

    @Test
    public void getPlayersPros() throws Exception {
        OpenDotaAPIWrapper.getPlayersPros(id);
    }

    @Test
    public void getPlayersTotals() throws Exception {
        OpenDotaAPIWrapper.getPlayersTotals(id);
    }

    @Test
    public void getPlayersCounts() throws Exception {
        OpenDotaAPIWrapper.getPlayersCounts(id);
    }

    @Test
    public void getPlayersWardMap() throws Exception {
        OpenDotaAPIWrapper.getPlayersWardMap(id);
    }

    @Test
    public void getPlayersWordCloud() throws Exception {
        OpenDotaAPIWrapper.getPlayersWordCloud(id);
    }

    @Test
    public void getPlayersRatings() throws Exception {
        OpenDotaAPIWrapper.getPlayersRatings(id);
    }

    @Test
    public void getPlayersRankings() throws Exception {
        OpenDotaAPIWrapper.getPlayersRankings(id);
    }

    @Test
    public void getHeroStats() throws Exception {
        OpenDotaAPIWrapper.getHeroStats();
    }

    @Test
    public void postPlayerRefresh() throws Exception {
        OpenDotaAPIWrapper.postPlayerRefresh(id);
    }

    @Test
    public void getProPlayers() throws Exception {
        OpenDotaAPIWrapper.getProPlayers();
    }

    @Test
    public void getProMatches() throws Exception {
        OpenDotaAPIWrapper.getProMatches();
    }

    @Test
    public void getPublicMatches() throws Exception {
        OpenDotaAPIWrapper.getPublicMatches();
    }

    @Test
    public void getDistributions() throws Exception {
        OpenDotaAPIWrapper.getDistributions();
    }

    @Test
    public void getStatus() throws Exception {
        OpenDotaAPIWrapper.getStatus();
    }

    @Test
    public void getHealth() throws Exception {
        OpenDotaAPIWrapper.getHealth();
    }

    @Test
    public void getHeroes() throws Exception {
        OpenDotaAPIWrapper.getHeroes();
    }

}