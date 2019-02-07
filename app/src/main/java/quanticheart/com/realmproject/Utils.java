package quanticheart.com.realmproject;

import android.app.Activity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

import io.realm.RealmList;

public class Utils {


    public static void createObjectToRealm(Activity activity) {
        Gson gson = new GsonBuilder().create();
        RealmObjectTest p = gson.fromJson(getJsonString(activity), RealmObjectTest.class);
        System.out.println(p);
    }

//    public static void createListObjectToRealm(Activity activity) {
//        RealmList<RealmObjectTest> listRealm = new RealmList<>();
//        JSONArray jsonArray =  getJSONArray(activity);
//        for (int i = 0; i <jsonArray.length(); i++) {
////            try {
////                listRealm.add(getRealmObject(jsonArray.getJSONObject(i)));
////            } catch (JSONException e) {
////                e.printStackTrace();
////            }
//        }
//    }

    //==============================================================================================
    //
    // ** Create Object from Gson
    //
    //==============================================================================================
//    private static RealmObjectTest getRealmObject(JSONObject json){
//        Gson gson = new GsonBuilder().create();
//        return gson.fromJson(json, RealmObjectTest.class);
//    }

    private static RealmObjectTest getRealmObject(String json){
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(json, RealmObjectTest.class);
    }

    //==============================================================================================
    //
    // ** Create ObjectFile
    //
    //==============================================================================================

//    public static JSONArray getJSONArray(Activity activity) {
//        JSONArray obj = null;
//        try {
//            return obj = new JSONArray(getJsonString(activity));
//
//            for (int i = 0; i < obj.length(); i++) {
//                JSONObject json = obj.getJSONObject(i);
//                Log.w("Json File Name", json.getString("nm"));
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    //==============================================================================================
    //
    // ** GetString from Json File
    //
    //==============================================================================================

    private static String getJsonString(Activity activity) {
        InputStream is;
        try {
            is = activity.getAssets().open("json.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            return new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}