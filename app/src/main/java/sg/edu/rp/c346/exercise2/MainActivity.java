package sg.edu.rp.c346.exercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<EmployeeInfo> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.listViewEmployee);
        alEmployeeList = new ArrayList<>();
        EmployeeInfo item1 = new EmployeeInfo("John", "Software Technical Leader", 3400);
        EmployeeInfo item2 = new EmployeeInfo("May", "Programmer", 2200);

        alEmployeeList.add(item1);
        alEmployeeList.add(item2);

        caEmployee = new CustomAdapter(this, R.layout.modifydesign, alEmployeeList);

        lvEmployee.setAdapter(caEmployee);
    }
}
