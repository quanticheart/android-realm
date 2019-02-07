package quanticheart.com.realmproject;

import io.realm.RealmList;
import io.realm.RealmObject;

public class RealmObjectListTest extends RealmList {

    RealmList<RealmObjectTest> list;

    public RealmList<RealmObjectTest> getList() {
        return list;
    }

    public void setList(RealmList<RealmObjectTest> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "RealmObjectListTest{" +
                "list=" + list +
                '}';
    }
}
