package me.dunit.dota;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Java wrapper for the Open Dota API.
 * <p>
 * This class contain methods for most of the API calls available in the
 * Open Dota API.
 * <p>
 * Please respect the usage limitations (keep request rate to approximately 3/s)
 */
@SuppressWarnings("UnusedReturnValue")
class OpenDotaAPIWrapper {
    static private final String apiBase = "https://api.opendota.com/api/";

    /**
     * Returns match information.
     *
     * @param id match id.
     * @return JSONObject containing match information.
     */
    static JSONObject getMatches(int id) {
        String apiFunc = "matches/" + id;
        return new JSONObject(getData(apiBase + apiFunc));
    }

    /**
     * Returns player information.
     *
     * @param id player id.
     * @return JSONObject containing player information.
     */
    static JSONObject getPlayer(int id) {
        String apiFunc = "/players/" + id;
        return new JSONObject(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a player's win/loss count.
     *
     * @param id player id.
     * @return JSONObject containing win/loss count.
     */
    static JSONObject getPlayerWL(int id) {
        String apiFunc = "/players/" + id + "/wl";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    /**
     * Returns a player's recent matches played.
     *
     * @param id player id.
     * @return JSONArray containing recent matches.
     */
    static JSONArray getPlayerRecentMatches(int id) {
        String apiFunc = "/players/" + id + "/recentmatches";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a player's matches played.
     *
     * @param id player id.
     * @return JSONArray containing matches.
     */
    static JSONArray getPlayerMatches(int id) {
        String apiFunc = "/players/" + id + "/matches";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a player's heroes played history.
     *
     * @param id player id.
     * @return JSONArray containing heroes played.
     */
    static JSONArray getPlayerHeroes(int id) {
        String apiFunc = "/players/" + id + "/heroes";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns players played with.
     *
     * @param id player id.
     * @return JSONArray containing players played with.
     */
    static JSONArray getPlayerPeers(int id) {
        String apiFunc = "/players/" + id + "/peers";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns pro players played with.
     *
     * @param id player id.
     * @return JSONArray containing pro players played with.
     */
    static JSONArray getPlayerPros(int id) {
        String apiFunc = "/players/" + id + "/pros";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a player's life time stats (ingame information, kills, deaths, gpm, etc).
     *
     * @param id player id.
     * @return JSONArray containing player life time stats.
     */
    static JSONArray getPlayerTotals(int id) {
        String apiFunc = "/players/" + id + "/totals";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a player's win/loss count for a range of different
     * categories (radiant/dire, lane role, game mode, etc).
     *
     * @param id player id.
     * @return JSONObject containing player win/loss counts.
     */
    static JSONObject getPlayerCounts(int id) {
        String apiFunc = "/players/" + id + "/counts";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns number of wards placed in matches played.
     *
     * @param id player id.
     * @return JSONObject containing number of placed in played matches.
     */
    static JSONObject getPlayerWardMap(int id) {
        String apiFunc = "/players/" + id + "/wardmap";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a player's words said/read in matches played.
     *
     * @param id player id.
     * @return JSONObject containing words said/read.
     */
    static JSONObject getPlayerWordCloud(int id) {
        String apiFunc = "/players/" + id + "/wordcloud";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    /**
     * Returns a player's rating history.
     *
     * @param id player id.
     * @return JSONArray containing player rating.
     */
    static JSONArray getPlayerRatings(int id) {
        String apiFunc = "/players/" + id + "/ratings";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    /**
     * Returns a player's rankings.
     *
     * @param id player id.
     * @return JSONArray containing player rankings.
     */
    static JSONArray getPlayerRankings(int id) {
        String apiFunc = "/players/" + id + "/rankings";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    /**
     * Request the valve database to refresh a player's match history.
     * <p>
     * <p> Use this if the auto update of a player's match history is too slow.
     *
     * @param id player id.
     */
    static void postPlayerRefresh(int id) {
        String apiFunc = "/players/" + id + "/refresh";
        postData(apiBase + apiFunc);
    }

    /**
     * Returns all pro players.
     *
     * @return JSONArray containing pro players.
     */
    static JSONArray getProPlayers() {
        String apiFunc = "proplayers";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns all ongoing pro matches.
     *
     * @return JSONArray containing ongoing pro matches.
     */
    static JSONArray getProMatches() {
        String apiFunc = "proplayers";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    // TODO: Additional query parameters support

    /**
     * Returns a random sample of public matches.
     *
     * @return JSONArray containing public matches.
     */
    static JSONArray getPublicMatches() {
        String apiFunc = "publicMatches";
        return new JSONArray(getData(apiBase + apiFunc));
    }


    /**
     * Returns detailed information for each hero.
     *
     * @return JSONArray with detailed heroes information.
     */
    static JSONArray getHeroStats() {
        String apiFunc = "herostats";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    /**
     * Returns distribution of MMR data by bracket and country.
     *
     * @return JSONObject containing MMR distribution.
     */
    static JSONObject getDistributions() {
        String apiFunc = "distributions";
        return new JSONObject(getData(apiBase + apiFunc));
    }


    //TODO: Implement GET/rankings (top players by hero)


    /**
     * Returns service statistics.
     *
     * @return JSONObject containing service statistics.
     */
    static JSONObject getStatus() {
        String apiFunc = "status";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    /**
     * Returns service health report.
     *
     * @return JSONObject containing service health information.
     */
    static JSONObject getHealth() {
        String apiFunc = "health";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    /**
     * Returns simple information for each hero.
     *
     * @return JSONArray containing simple hero information.
     * @see me.dunit.dota.OpenDotaAPIWrapper#getHeroStats
     */
    static JSONArray getHeroes() {
        String apiFunc = "heroes";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    /**
     * Downloads a hero image and stores it at the specified location.
     *
     * @param id   hero id.
     * @param path location to store image.
     * @throws IOException if there is an IO exception when storing image.
     */
    static void getHeroImage(int id, String path) throws IOException {
        JSONArray heroes = getHeroStats();

        // TODO: Handle index inconsistency
        // Ugly hack, should be handled more gracefully
        // This is done because the index and id is not consistent
        JSONObject hero;
        if (id < 23) {
            hero = heroes.getJSONObject(id - 1);
        } else {
            hero = heroes.getJSONObject(id - 2);
        }

        String apiFunc = hero.getString("img");

        try (InputStream in = new URL(apiBase.substring(0, apiBase.length() - 5) + apiFunc).openStream()) {
            Files.copy(in, Paths.get(path + "/" + id + ".png"));
        }
    }

    /**
     * Method used internally to create connection and make a GET request to
     * the Open Dota API wrapper.
     *
     * @param apiCall the specific API call.
     * @return A string result.
     */
    private static String getData(String apiCall) {
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(apiCall);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            while ((output = br.readLine()) != null) {
                result.append(output);
            }

            conn.disconnect();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return result.toString();
    }

    /**
     * Method used internally to create connection and make a POST request to
     * the Open Dota API Wrapper.
     *
     * @param apiCall the specific API call.
     */
    private static void postData(String apiCall) {

        try {
            URL url = new URL(apiCall);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            conn.disconnect();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}