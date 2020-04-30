package vn.edu.ntu.ducbinh.leducbinh_59130126_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup grbt;
    Button btxn;
    CheckBox ckb;
    EditText ten,date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }
    private void addViews()
    {

    }
    private  void addEvent()
    {
btxn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        xacnhan();
    }
});
    }
    private void xacnhan()
    {
        Toast.makeText(getApplicationContext(), ".....", Toast.LENGTH_SHORT).show();
    }
}
