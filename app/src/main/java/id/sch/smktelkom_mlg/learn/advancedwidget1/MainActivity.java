package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Spinner spJumlah;
    LinearLayout llAnak;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spJumlah = (Spinner) findViewById(R.id.spinnerJumlahAnak);
        Integer [] arJumlah = new Integer[10];
        for (int i = 0; i < 10; i++)
        {
            arJumlah[i]=i+1;
        }
        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arJumlah);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spJumlah.setAdapter(adapter);