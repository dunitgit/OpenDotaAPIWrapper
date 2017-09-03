package dk.dbs.dota;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@SuppressWarnings("UnusedReturnValue")
class OpenDotaAPIWrapper {
    static private final String apiBase = "https://api.opendota.com/api/";

    static JSONObject getMatches(int id) {
        String apiFunc = "matches/" + id;
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONObject getPlayers(int id) {
        String apiFunc = "/players/" + id;
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONObject getPlayersWL(int id) {
        String apiFunc = "/players/" + id + "/wl";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersRecentMatches(int id) {
        String apiFunc = "/players/" + id + "/recentmatches";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersMatches(int id) {
        String apiFunc = "/players/" + id + "/matches";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersHeroes(int id) {
        String apiFunc = "/players/" + id + "/heroes";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersPeers(int id) {
        String apiFunc = "/players/" + id + "/peers";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersPros(int id) {
        String apiFunc = "/players/" + id + "/pros";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersTotals(int id) {
        String apiFunc = "/players/" + id + "/totals";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONObject getPlayersCounts(int id) {
        String apiFunc = "/players/" + id + "/counts";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONObject getPlayersWardMap(int id) {
        String apiFunc = "/players/" + id + "/wardmap";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONObject getPlayersWordCloud(int id) {
        String apiFunc = "/players/" + id + "/wordcloud";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersRatings(int id) {
        String apiFunc = "/players/" + id + "/ratings";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPlayersRankings(int id) {
        String apiFunc = "/players/" + id + "/rankings";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static void postPlayerRefresh(int id) {
        String apiFunc = "/players/" + id + "/refresh";
        postData(apiBase + apiFunc);
    }

    static JSONArray getProPlayers() {
        String apiFunc = "proplayers";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getProMatches() {
        String apiFunc = "proplayers";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getPublicMatches() {
        String apiFunc = "publicMatches";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONArray getHeroStats() {
        String apiFunc = "proMatches";
        return new JSONArray(getData(apiBase + apiFunc));
    }

    static JSONObject getDistributions() {
        String apiFunc = "distributions";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONObject getStatus() {
        String apiFunc = "status";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONObject getHealth() {
        String apiFunc = "health";
        return new JSONObject(getData(apiBase + apiFunc));
    }

    static JSONArray getHeroes() {
        String apiFunc = "heroes";
        return new JSONArray(getData(apiBase + apiFunc));
    }

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

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

        return result.toString();
    }

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

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}