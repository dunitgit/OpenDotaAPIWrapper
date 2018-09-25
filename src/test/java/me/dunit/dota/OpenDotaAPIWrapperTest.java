package me.dunit.dota;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;

// TODO: Correctness tests

/**
 * Test of API calls
 * Only HTTP errors are caught
 * This is not a correctness test
 */
public class OpenDotaAPIWrapperTest {

    private final int ID = 1;

    @Rule
    public final TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void getMatches() throws Exception {
        OpenDotaAPIWrapper.getMatches(ID);
    }

    @Test
    public void getPlayer() throws Exception {
        OpenDotaAPIWrapper.getPlayer(ID);
    }

    @Test
    public void getPlayerWL() throws Exception {
        OpenDotaAPIWrapper.getPlayerWL(ID);
    }

    @Test
    public void getPlayerRecentMatches() throws Exception {
        OpenDotaAPIWrapper.getPlayerRecentMatches(ID);
    }

    @Test
    public void getPlayerMatches() throws Exception {
        OpenDotaAPIWrapper.getPlayerMatches(ID);
    }

    @Test
    public void getPlayerHeroes() throws Exception {
        OpenDotaAPIWrapper.getPlayerHeroes(ID);
    }

    @Test
    public void getPlayerPeers() throws Exception {
        OpenDotaAPIWrapper.getPlayerPeers(ID);
    }

    @Test
    public void getPlayerPros() throws Exception {
        OpenDotaAPIWrapper.getPlayerPros(ID);
    }

    @Test
    public void getPlayerTotals() throws Exception {
        OpenDotaAPIWrapper.getPlayerTotals(ID);
    }

    @Test
    public void getPlayerCounts() throws Exception {
        OpenDotaAPIWrapper.getPlayerCounts(ID);
    }

    @Test
    public void getPlayerWardMap() throws Exception {
        OpenDotaAPIWrapper.getPlayerWardMap(ID);
    }

    @Test
    public void getPlayerWordCloud() throws Exception {
        OpenDotaAPIWrapper.getPlayerWordCloud(ID);
    }

    @Test
    public void getPlayerRatings() throws Exception {
        OpenDotaAPIWrapper.getPlayerRatings(ID);
    }

    @Test
    public void getPlayerRankings() throws Exception {
        OpenDotaAPIWrapper.getPlayerRankings(ID);
    }

    @Test
    public void getHeroStats() throws Exception {
        OpenDotaAPIWrapper.getHeroStats();
    }

    @Test
    public void postPlayerRefresh() throws Exception {
        OpenDotaAPIWrapper.postPlayerRefresh(ID);
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

    @Test
    public void getHeroImage() throws Exception {
        File getHeroImageTmpTestFolder = tmpFolder.newFolder("getHeroImageTmpTestFolder");
        OpenDotaAPIWrapper.getHeroImage(ID, getHeroImageTmpTestFolder.toString());
    }

    // A second test is performed to address the id/index inconsistency
    @Test
    public void getHeroImage2() throws Exception {
        File getHeroImageTmpTestFolder = tmpFolder.newFolder("getHeroImageTmpTestFolder2");
        OpenDotaAPIWrapper.getHeroImage(ID + 50, getHeroImageTmpTestFolder.toString());
    }

    // TODO: Test bad API GET response
    @Test
    public void badAPIGETResponse() {
        OpenDotaAPIWrapper.getHeroes();
    }

    // TODO: Test bad API POST response
    @Test
    public void badAPIPostResponse() {
        OpenDotaAPIWrapper.postPlayerRefresh(ID);
    }

}