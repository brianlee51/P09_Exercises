package sg.edu.rp.c346.exercise2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.employeeList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView  = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        EmployeeInfo currentItem = employeeList.get(position);
        tvName.setText(currentItem.geteName());
        tvSalary.setText(currentItem.geteSalary()+"");
        tvTitle.setText(currentItem.geteTitle());
        return rowView;
    }


}
