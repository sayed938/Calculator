package com.example.claculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Calcu extends AppCompatActivity {
TextView t1,t2;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);


        t1=(TextView) findViewById(R.id.txt1);
        t2=(TextView) findViewById(R.id.txt2);

findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        str=t1.getText().toString();
        t1.setText(str+"1");
    }
});
        findViewById(R.id.b2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"2");
            }
        });
        findViewById(R.id.b3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"3");
            }
        });
        findViewById(R.id.b4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"4");
            }
        });
        findViewById(R.id.b5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"5");
            }
        });
        findViewById(R.id.b6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"6");
            }
        });
        findViewById(R.id.b7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"7");
            }
        });
        findViewById(R.id.b8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"8");
            }
        });
        findViewById(R.id.b9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"9");
            }
        });
        findViewById(R.id.bdot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+".");
            }
        });
        findViewById(R.id.b0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"0");
            }
        });
        findViewById(R.id.badd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"+");
            }
        });
        findViewById(R.id.bmod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"%");
            }
        });
        findViewById(R.id.bdev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"/");
            }
        });
        findViewById(R.id.bsub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"-");
            }
        });
        findViewById(R.id.bmult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=t1.getText().toString();
                t1.setText(str+"*");
            }
        });
        findViewById(R.id.bdel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str=t1.getText().toString();
                if(str.length()>0)
           t1.setText(str.substring(0,(str.length()-1)));

            }
        });
        findViewById(R.id.bclr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
            }
        });
        findViewById(R.id.beql).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

if(t1.getText().toString().length()>0) {
    str = t1.getText().toString();
    Double rs = null;
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
    try {
        rs = (double) engine.eval(str);
    } catch (ScriptException e) {
        Toast.makeText(Calcu.this, "Invalid", Toast.LENGTH_SHORT).show();
    }

    if (rs != null)
        t2.setText(String.valueOf(rs.doubleValue()));
}

            }
        });
    }
}