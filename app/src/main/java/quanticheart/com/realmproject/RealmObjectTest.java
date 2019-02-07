package quanticheart.com.realmproject;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class RealmObjectTest extends RealmObject implements Serializable {

//    Realm suporta os seguintes tipos de campo:
//    boolean, byte, short, int, long, float, double, String, Datee byte[],
//    assim como os tipos de caixas Boolean, Byte, Short, Integer, Long, Floate Double.
//    Subclasses de RealmObjecte RealmList<? extends RealmObject>são usadas para modelar relacionamentos.

//    Apenas Boolean, Byte, Short, Integer, Long, Float, Double, String, byte[]e Datepodem ser anotados com Obrigatório.

    @Required
    @PrimaryKey
    private String id;
    @Required
    private String nm;
    private String cty;
    private String hse;
    private String yrs;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getHse() {
        return hse;
    }

    public void setHse(String hse) {
        this.hse = hse;
    }

    public String getYrs() {
        return yrs;
    }

    public void setYrs(String yrs) {
        this.yrs = yrs;
    }

    @Override
    public String toString() {
        return "RealmObjectTest{" +
                "id='" + id + '\'' +
                ", nm='" + nm + '\'' +
                ", cty='" + cty + '\'' +
                ", hse='" + hse + '\'' +
                ", yrs='" + yrs + '\'' +
                '}';
    }
}
