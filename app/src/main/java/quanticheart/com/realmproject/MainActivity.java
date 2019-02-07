package quanticheart.com.realmproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
//      Utils.getObject(this);
//        Utils.createListObjectToRealm(this);
    }

//
//        private void addEmployee() {
//
//            Realm realm = null;
//            try {
//                realm = Realm.getDefaultInstance();
//                realm.executeTransaction(new Realm.Transaction() {
//                    @Override
//                    public void execute(Realm realm) {
//
//                        try {
//
//                            if (!inName.getText().toString().trim().isEmpty()) {
//                                Employee employee = new Employee();
//                                employee.name = inName.getText().toString().trim();
//
//                                if (!inAge.getText().toString().trim().isEmpty())
//                                    employee.age = Integer.parseInt(inAge.getText().toString().trim());
//
//
//                                String languageKnown = inSkill.getText().toString().trim();
//
//                                if (!languageKnown.isEmpty()) {
//                                    Skill skill = realm.where(Skill.class).equalTo(Skill.PROPERTY_SKILL, languageKnown).findFirst();
//
//                                    if (skill == null) {
//                                        skill = realm.createObject(Skill.class, languageKnown);
//                                        realm.copyToRealm(skill);
//                                    }
//
//                                    employee.skills = new RealmList<>();
//                                    employee.skills.add(skill);
//                                }
//
//                                realm.copyToRealm(employee);
//                            }
//
//                        } catch (RealmPrimaryKeyConstraintException e) {
//                            Toast.makeText(getApplicationContext(), "Primary Key exists, Press Update instead", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//            } finally {
//                if (realm != null) {
//                    realm.close();
//                }
//            }
//        }
//
//
//
//
//        private void updateEmployeeRecords() {
//
//            mRealm.executeTransaction(new Realm.Transaction() {
//                @Override
//                public void execute(Realm realm) {
//
//
//                    if (!inName.getText().toString().trim().isEmpty()) {
//
//
//                        Employee employee = realm.where(Employee.class).equalTo(Employee.PROPERTY_NAME, inName.getText().toString()).findFirst();
//                        if (employee == null) {
//                            employee = realm.createObject(Employee.class, inName.getText().toString().trim());
//                        }
//                        if (!inAge.getText().toString().trim().isEmpty())
//                            employee.age = Integer.parseInt(inAge.getText().toString().trim());
//
//                        String languageKnown = inSkill.getText().toString().trim();
//                        Skill skill = realm.where(Skill.class).equalTo(Skill.PROPERTY_SKILL, languageKnown).findFirst();
//
//                        if (skill == null) {
//                            skill = realm.createObject(Skill.class, languageKnown);
//                            realm.copyToRealm(skill);
//                        }
//
//
//                        if (!employee.skills.contains(skill))
//                            employee.skills.add(skill);
//
//                    }
//                }
//            });
//        }
//
//        private void deleteEmployeeRecord() {
//            mRealm.executeTransaction(new Realm.Transaction() {
//                @Override
//                public void execute(Realm realm) {
//                    Employee employee = realm.where(Employee.class).equalTo(Employee.PROPERTY_NAME, inName.getText().toString()).findFirst();
//                    if (employee != null) {
//                        employee.deleteFromRealm();
//                    }
//                }
//            });
//        }
//
//        private void deleteEmployeeWithSkill() {
//            mRealm.executeTransaction(new Realm.Transaction() {
//                @Override
//                public void execute(Realm realm) {
//
//                    RealmResults<Employee> employees = realm.where(Employee.class).equalTo("skills.skillName", inSkill.getText().toString().trim()).findAll();
//                    employees.deleteAllFromRealm();
//                }
//            });
//        }
//
//
//        private void filterByAge() {
//            mRealm.executeTransaction(new Realm.Transaction() {
//                @Override
//                public void execute(Realm realm) {
//
//                    RealmResults<Employee> results = realm.where(Employee.class).greaterThanOrEqualTo(Employee.PROPERTY_AGE, 25).findAllSortedAsync(Employee.PROPERTY_NAME);
//
//                    txtFilterByAge.setText("");
//                    for (Employee employee : results) {
//                        txtFilterByAge.append(employee.name + " age: " + employee.age + " skill: " + employee.skills.size());
//                    }
//                }
//            });
//        }
//
//
//        @Override
//        protected void onDestroy() {
//            super.onDestroy();
//            if (mRealm != null) {
//                mRealm.close();
//            }
//        }
}