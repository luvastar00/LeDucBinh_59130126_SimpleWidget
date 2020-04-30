package vn.edu.ntu.ducbinh.leducbinh_59130126_simplewidget;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup grbt;
    Button btxn;
    EditText ten,datee,stk;
    RadioButton nu,nam;
    CheckBox xp,nghe,mot,bep,cafe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }
    private void addViews()
    {
    ten = findViewById(R.id.ten);
    datee = findViewById(R.id.datee);
    grbt = findViewById(R.id.grbt);
    stk = findViewById(R.id.stk);
    btxn = findViewById(R.id.btxn);
    nu = findViewById(R.id.nu);
    nam = findViewById(R.id.nam);
    xp = findViewById(R.id.xp);
    cafe = findViewById(R.id.cafe);
    mot = findViewById(R.id.mot);
    bep = findViewById(R.id.bep);
    nghe = findViewById(R.id.nghe);

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
    int sex = this.grbt.getCheckedRadioButtonId();
            String name = ten.getText().toString().trim();
            String date = datee.getText().toString().trim();
            RadioButton grbt = this.findViewById(sex);
            String st ="";
            if(nghe.isChecked()){
                if (st.length()>0){
                    st+= ",";
                }
                st += "Nghe Nhạc";
            }
             if(xp.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Xem Phim";
        }
             if(bep.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Vào Bếp Nấu Ăn";
        }
             if(mot.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Ở nhà một mình";
        }
             if(cafe.isChecked()){
            if (st.length()>0){
                st+= ",";
            }
            st += "Đi cafe với bạn";
        }
             st +=",";
             st += stk.getText().toString().trim();
         String xuat = name + "\nNgaySinh : " + date + "\nGiới Tính : " + grbt.getText() + "\nSở Thích :" + st ;
        Toast.makeText(getApplicationContext(), xuat, Toast.LENGTH_SHORT).show();
    }

}
