package quanticheart.com.realmproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class DatabaseProject {

    private static String DATABASE_NAME = "testerealm.realm";
    private static int DATABASE_VERSION = 1;

    public static void createDatabase(Activity activity) {

        Realm.init(activity);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder()
                .name(DATABASE_NAME)
                .schemaVersion(DATABASE_VERSION)
                .build();
        Realm.setDefaultConfiguration(realmConfig);
    }

    public static void closeDatabase() {
        if (realm != null)
            realm.close();
    }

    @SuppressLint("StaticFieldLeak")
    private static Realm realm;

//    public static void insertDatabase(final RealmObjectTest realmObjectTest) {
//        realm = Realm.getDefaultInstance();
//        realm.beginTransaction();
//        realm.copyToRealm(realmObjectTest);
//        realm.commitTransaction();
//    }


    public static void insertDatabase(final RealmObjectTest realmObjectTest) {
        realm = Realm.getDefaultInstance();
        try {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    realm.insertOrUpdate(realmObjectTest);
//                    realm.copyToRealm(realmObjectTest);
                }
            });
        } catch (Exception ignored) {

        }
    }

    public static void getDatabase() {
        RealmResults<RealmObjectTest> results = realm.where(RealmObjectTest.class).findAll();
    }

    public static void deleteDatabase() {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                RealmResults<RealmObjectTest> results = realm.where(RealmObjectTest.class).findAll();
                results.deleteAllFromRealm();
//                results.deleteFirstFromRealm();
//                results.deleteFromRealm(1);
//                results.deleteLastFromRealm();
            }
        });
    }

    private void readEmployeeRecords() {

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                RealmResults<RealmObjectTest> results = realm.where(RealmObjectTest.class).findAll();
//                textView.setText("");
                for (RealmObjectTest employee : results) {
//                    textView.append(employee.name + " age: " + employee.age + " skill: " + employee.skills.size());
                }
            }
        });


    }
}
