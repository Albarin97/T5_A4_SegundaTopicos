package com.example.actividad4_aplicacinandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_ingresar;
    TextView txtV_c, txtV_f, txtV_r, txtV_k;
    RadioButton RB_C,RB_R,RB_F,RB_K;
    CheckBox CB_C,CB_F,CB_K,CB_R;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_ingresar =findViewById(R.id.TXT_ING);
        RB_C=findViewById(R.id.C);
        RB_F=findViewById(R.id.F);
        RB_K=findViewById(R.id.K);
        RB_R=findViewById(R.id.R);
        txtV_c =findViewById(R.id.TXT_RES_C);
        txtV_f =findViewById(R.id.TXT_RES_F);
        txtV_k =findViewById(R.id.TXT_RES_K);
        txtV_r =findViewById(R.id.TXT_RES_R);
        CB_C=findViewById(R.id.C_Cb);
        CB_F=findViewById(R.id.F_Cb);
        CB_K=findViewById(R.id.K_Cb);
        CB_R=findViewById(R.id.R_Cb);

        btn =findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(txt_ingresar.getText().toString());
                if (RB_C.isChecked()){
                    if (CB_C.isChecked()){
                        txtV_c.setText(""+x);
                    }
                    if (CB_F.isChecked()){
                        txtV_f.setText(""+(((x* 9)/5) + 32));
                    }
                    if (CB_K.isChecked()){
                        txtV_k.setText((x+273.15)+"");
                    }
                    if (CB_R.isChecked()){
                        txtV_r.setText(""+((x*9)/5 + 491.67));
                    }
                }else if (RB_F.isChecked()){
                    if (CB_F.isChecked()){
                        txtV_f.setText(""+x);
                    }
                    if (CB_C.isChecked()){
                        txtV_c.setText(""+(((x-32) * 5)/9));
                    }
                    if (CB_K.isChecked()){
                        txtV_k.setText(""+((((x-32) * 5)/9)+273.15));
                    }
                    if (CB_R.isChecked()){
                        txtV_r.setText(""+(x+ 459.67));
                    }
                }else if (RB_K.isChecked()){
                    if (CB_K.isChecked()){
                        txtV_k.setText(""+x);
                    }
                    if (CB_C.isChecked()){
                        txtV_c.setText(""+(x- 273.15));
                    }
                    if (CB_F.isChecked()){
                        txtV_f.setText(""+(((x-273.18)* 9/5 + 32)));
                    }
                    if (CB_R.isChecked()){
                        txtV_r.setText(""+(((9*(x-273.15))/9)+491.67));
                    }
                }else if (RB_R.isChecked()){
                    if (CB_R.isChecked()){
                        txtV_r.setText(""+x);
                    }
                    if (CB_C.isChecked()){
                        txtV_c.setText(""+((x-491.67)*5/9));
                    }
                    if (CB_F.isChecked()){
                        txtV_f.setText(""+(x-459.67));
                    }
                    if (CB_K.isChecked()){
                        txtV_k.setText(""+(((5*(x-491.67))/9)+273.15));
                    }
                }

            }
        });
    }
}
