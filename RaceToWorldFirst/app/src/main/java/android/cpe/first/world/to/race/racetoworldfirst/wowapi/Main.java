package android.cpe.first.world.to.race.racetoworldfirst.wowapi;

import android.app.Activity;
import android.cpe.first.world.to.race.racetoworldfirst.R;
import android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.Player;
import android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.PlayerAchievement;
import android.cpe.first.world.to.race.racetoworldfirst.wowapi.model.playerachievement.AchievementResponse;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Main extends Activity {

  private static final String TAG = Main.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_layout);

    AchivementJSON thread = new AchivementJSON();
    thread.execute();
  }

  class AchivementJSON extends AsyncTask<Void, Void, Void> {

    Map<String, List<Player>> playerList = new HashMap<>();
    @SuppressWarnings("serial")
    Map<Long, String> achievementList = new HashMap<Long, String>() {{
      put(8966l, "Mythic: Gruul");
      put(8967l, "Mythic: Oregorger");
      put(8968l, "Mythic: Hans'gar and Franzok");
      put(8956l, "Mythic: Beastlord Darmac");
      put(8932l, "Mythic: Flamebender Ka'graz");
      put(8969l, "Mythic: Operator Thogar");
      put(8970l, "Mythic: Blast Furnace");
      put(8971l, "Mythic: Kromog");
      put(8972l, "Mythic: Iron Maidens");
      put(8973l, "Mythic: Blackhand's Crucible");
    }};

    public AchivementJSON() {
      insertData();
    }

    public void insertData() {
      //		playerList.put("Paragon", Arrays.asList(
      //				new Player ("Verestrasz", "lightnings-blade", "eu"),
      //				new Player ("Lappe", "lightnings-blade", "eu"),
      //				new Player ("Alzu", "lightnings-blade", "eu"),
      //				new Player ("Seita", "lightnings-blade", "eu"),
      //				new Player ("Riksu", "lightnings-blade", "eu"),
      //				new Player ("Devai", "lightnings-blade", "eu"),
      //				new Player ("Luumu", "lightnings-blade", "eu"),
      //				new Player ("Zelliiz", "lightnings-blade", "eu"),
      //				new Player ("Verdishamonk", "lightnings-blade", "eu"),
      //				new Player ("Fraggoji", "lightnings-blade", "eu"),
      //				new Player ("Seijta", "lightnings-blade", "eu")
      //				));
      //
      //		playerList.put("Method", Arrays.asList(
      //				new Player ("Sco", "twisting-nether", "eu"),
      //				new Player ("Kreps", "twisting-nether", "eu"),
      //				new Player ("Raziee", "twisting-nether", "eu"),
      //				new Player ("Drquyn", "twisting-nether", "eu"),
      //				new Player ("Perfecto", "twisting-nether", "eu"),
      //				new Player ("Smootie", "twisting-nether", "eu"),
      //				new Player ("Twold", "twisting-nether", "eu"),
      //				new Player ("Rogerbrown", "twisting-nether", "eu"),
      //				new Player ("Apko", "twisting-nether", "eu")
      //				));

      playerList.put("Blood Legion", Arrays.asList(
          new Player("Zoomkins", "illidan", "us"),
          new Player("Jacktronic", "illidan", "us"),
          new Player("Ahdehl", "illidan", "us"),
          new Player("Arold", "illidan", "us"),
          new Player("Hypnotized", "illidan", "us"),
          new Player("Brozooka", "illidan", "us"),

          new Player("Zachlock", "illidan", "us"),
          new Player("Absalom", "illidan", "us"),
          new Player("Perran", "illidan", "us"),
          new Player("Shuttletwo", "illidan", "us"),
          new Player("Ahdehll", "illidan", "us"),
          new Player("Kutaa", "illidan", "us"),
          new Player("Madison", "illidan", "us"),
          new Player("Riggatron", "illidan", "us"),
          new Player("Riggmonlee", "illidan", "us"),
          new Player("Scholtes", "illidan", "us")
      ));

      //		playerList.put("Exorsus", Arrays.asList(
      //				new Player ("Домек", "ревущий-фьорд", "eu"),
      //				new Player ("Моранах", "ревущий-фьорд", "eu"),
      //				new Player ("Сэу", "ревущий-фьорд", "eu"),
      //				new Player ("Штырьпожоще", "ревущий-фьорд", "eu"),
      //				new Player ("Споз", "ревущий-фьорд", "eu"),
      //				new Player ("Вейхем", "ревущий-фьорд", "eu"),
      //				new Player ("Дейси", "ревущий-фьорд", "eu"),
      //				new Player ("Ёмпос", "ревущий-фьорд", "eu"),
      //				new Player ("Шаморан", "ревущий-фьорд", "eu"),
      //				new Player ("Надоубивать", "ревущий-фьорд", "eu")
      //				));
      //
      //		playerList.put("Style War", Arrays.asList(
      //				new Player ("西瓦修斯", "thousand-needles", "cn"),
      //				new Player ("玖伍肆叁", "thousand-needles", "cn"),
      //				new Player ("米米雕", "thousand-needles", "cn"),
      //				new Player ("荣姣姣", "thousand-needles", "cn"),
      //				new Player ("斯塔斯之猎", "thousand-needles", "cn"),
      //				new Player ("劣质枪法", "thousand-needles", "cn"),
      //				new Player ("汉宫易", "thousand-needles", "cn"),
      //				new Player ("斷風賢", "thousand-needles", "cn"),
      //				new Player ("偶吧欧巴", "thousand-needles", "cn")
      //				));

     playerList.put("Ascension", Arrays.asList(
          new Player ("Kovak", "barthilas", "us"),
          new Player ("Pasteryy", "barthilas", "us")/*,
          new Player ("Marrsyy", "barthilas", "us"),
          new Player ("Plsmonies", "barthilas", "us"),
          new Player ("Luice", "barthilas", "us"),
          new Player ("Korvakqt", "barthilas", "us"),
          new Player ("Sashafierce", "barthilas", "us"),
          new Player ("Loregasm", "barthilas", "us"),
          new Player ("Anthrall", "barthilas", "us"),
          new Player ("Xariaz", "barthilas", "us")*/
      ));

      playerList.put("Midwinter", Arrays.asList(
          new Player ("Kennyloggins", "sargeras", "us")/*,
          new Player ("Stenhaldi", "sargeras", "us"),
          new Player ("Thebiggman", "sargeras", "us"),
          new Player ("Affinity", "sargeras", "us"),
          new Player ("Siory", "sargeras", "us"),
          new Player ("Dashima", "sargeras", "us"),
          new Player ("Exoticflower", "sargeras", "us"),
          new Player ("Kevsenior", "sargeras", "us"),
          new Player ("Angz", "sargeras", "us"),
          new Player ("Vigilate", "sargeras", "us"),
          new Player ("Doxie", "sargeras", "us"),
          new Player ("Slootbag", "sargeras", "us"),
          new Player ("Jarinky", "sargeras", "us"),
          new Player ("Hesp", "sargeras", "us")*/
      ));

      	/*playerList.put("Ascendance", Arrays.asList(
      				new Player ("Sennari", "draenor", "eu"),
      				new Player ("Stash", "draenor", "eu"),
      				new Player ("Orby", "draenor", "eu"),
      				new Player ("Cherdin", "draenor", "eu"),
      				new Player ("Rammo", "draenor", "eu"),
      				new Player ("Eriya", "draenor", "eu"),
      				new Player ("Rammoz", "draenor", "eu"),
      				new Player ("Derwinn", "draenor", "eu"),
      				new Player ("Pipex", "draenor", "eu"),
      				new Player ("Camthalion", "draenor", "eu")
      				));*/
    }

    private ArrayList<PlayerAchievement> getPlayerAchievements(Player player) {
      ArrayList<PlayerAchievement> achievements = new ArrayList<>();
      HttpGet httpUtil = new HttpGet(String.format("http://%s/api/wow/character/%s/%s?fields=achievements",
          mapRegionHost(player.getRegion()),
          player.getRealm(),
          player.getName()));

      GsonBuilder gsonBuilder = new GsonBuilder();
      Gson gson =  gsonBuilder.create();
      AchievementResponse response = gson.fromJson(getJsonString(httpUtil), AchievementResponse.class);

      for (Long achievementId: response.getAchievements().getAchievementsCompleted()) {
        try {
          achievements.add(new PlayerAchievement(
              achievementId,
              response.getAchievements().getAchievementsCompletedTimestamp().get( response.getAchievements().getAchievementsCompleted().indexOf(achievementId))));
        } catch (Exception e) {

        }
      }
      return achievements;
    }

    private String mapRegionHost(String region) {
      String result;
      switch (region) {
        case "cn":
          result = "www.battlenet.com.cn";
          break;
        default:
          result = region + ".battle.net";
          break;
      }
      return result;
    }

    @Override
    protected Void doInBackground(Void... params) {
      Map<Long, String> tempBossList = achievementList;

      for (String guildName: playerList.keySet()) {

        for (Player player : playerList.get(guildName)) {
          try {
            ArrayList<PlayerAchievement> achives = getPlayerAchievements(player);
            for (Long bossId : tempBossList.keySet()) {
              boolean bossFound = false;
              for (int i = 0; i < achives.size(); i++) {
                if (achives.get(i).getAchievementId().equals(bossId)) {
                  Log.d(TAG, String.format("%s\" has achieved \"%s\" at %s",
                      guildName,
                      tempBossList.get(bossId),
                      achives.get(i).getUTCtime()));
                  bossFound = true;
                  i = achives.size();
                }
              }
              if (bossFound) {
                break;
              }
            }
          } catch (Exception e) {
            Log.d(TAG, "Error in loading player" + e.getMessage());
          }
        }
      }

      return null;
    }

    public String getJsonString(HttpGet httpGet) {
      String responseString  = null;
      HttpClient httpclient = new DefaultHttpClient();
      try {
        HttpResponse response = httpclient.execute(httpGet);
        StatusLine statusLine = response.getStatusLine();
        if(statusLine.getStatusCode() == HttpStatus.SC_OK){
          ByteArrayOutputStream out = new ByteArrayOutputStream();
          response.getEntity().writeTo(out);
          responseString = out.toString();
          out.close();
        } else{
          //Closes the connection.
          response.getEntity().getContent().close();
        }
      } catch (IOException e) {
        //TODO Handle problems..
      }
      return responseString;
    }
  }

}
