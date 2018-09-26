package me.dunit.dota.test;

import me.dunit.dota.OpenDotaAPIWrapper;
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
    public void getMatches() {
        OpenDotaAPIWrapper.getMatches(ID);
    }

    @Test
    public void getPlayer() {
        OpenDotaAPIWrapper.getPlayer(ID);
    }

    @Test
    public void getPlayerWL() {
        OpenDotaAPIWrapper.getPlayerWL(ID);
    }

    @Test
    public void getPlayerRecentMatches() {
        OpenDotaAPIWrapper.getPlayerRecentMatches(ID);
    }

    @Test
    public void getPlayerMatches() {
        OpenDotaAPIWrapper.getPlayerMatches(ID);
    }

    @Test
    public void getPlayerHeroes() {
        OpenDotaAPIWrapper.getPlayerHeroes(ID);
    }

    @Test
    public void getPlayerPeers() {
        OpenDotaAPIWrapper.getPlayerPeers(ID);
    }

    @Test
    public void getPlayerPros() {
        OpenDotaAPIWrapper.getPlayerPros(ID);
    }

    @Test
    public void getPlayerTotals() {
        OpenDotaAPIWrapper.getPlayerTotals(ID);
    }

    @Test
    public void getPlayerCounts() {
        OpenDotaAPIWrapper.getPlayerCounts(ID);
    }

    @Test
    public void getPlayerWardMap() {
        OpenDotaAPIWrapper.getPlayerWardMap(ID);
    }

    @Test
    public void getPlayerWordCloud() {
        OpenDotaAPIWrapper.getPlayerWordCloud(ID);
    }

    @Test
    public void getPlayerRatings() {
        OpenDotaAPIWrapper.getPlayerRatings(ID);
    }

    @Test
    public void getPlayerRankings() {
        OpenDotaAPIWrapper.getPlayerRankings(ID);
    }

    @Test
    public void getHeroStats() {
        OpenDotaAPIWrapper.getHeroStats();
    }

    @Test
    public void postPlayerRefresh() {
        OpenDotaAPIWrapper.postPlayerRefresh(ID);
    }

    @Test
    public void getProPlayers() {
        OpenDotaAPIWrapper.getProPlayers();
    }

    @Test
    public void getProMatches() {
        OpenDotaAPIWrapper.getProMatches();
    }

    @Test
    public void getPublicMatches() {
        OpenDotaAPIWrapper.getPublicMatches();
    }

    @Test
    public void getDistributions() {
        OpenDotaAPIWrapper.getDistributions();
    }

    @Test
    public void getStatus() {
        OpenDotaAPIWrapper.getStatus();
    }

    @Test
    public void getHealth() {
        OpenDotaAPIWrapper.getHealth();
    }

    @Test
    public void getHeroes() {
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