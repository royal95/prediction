package com.android.test;

import android.annotation.SuppressLint;
import android.app.Activity;


import android.graphics.Bitmap;
import android.graphics.Color;

import android.os.Build;
import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.RequiresApi;




public class result extends Activity implements AdapterView.OnItemSelectedListener{


    String selectedItemTextThree;
    TextView sdate,title;
    TextView stime;
    TextView home,away,home1,away1;
    TextView ftstartnumber,ftendnumber;
    TextView secstartnumber,secendnumber;
    TextView spone;
    TextView sptwo;
    TextView spthree;
    TextView spfour;
    TextView spfive;
    TextView spsix;
    TextView spseven;
    TextView sgoal;
    TextView tpone,tptwo,tpthree,tpfour,tpfive,tpsix,tpseven;
    TextView sleauge;
    TextView ss1,ss2,ss3,ss4,ss5,ss6,ss7;
    TextView tss1,tss2,tss3,tss4,tss5,tss6,tss7;
    String [] plantes={"Plantes","Sun","Mon","Mars","Mer","Jupitar","Venus","Saturn","Rah","Ke"};
    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Spinner spin1 = (Spinner) findViewById(R.id.assignlord);
        Spinner spin2 = (Spinner) findViewById(R.id.asignlord);
        Spinner spin3 = (Spinner) findViewById(R.id.anaklord);
        Spinner spin4 = (Spinner) findViewById(R.id.moonsublord);
        Spinner spin5 = (Spinner) findViewById(R.id.mslord);
        Spinner spin6 = (Spinner) findViewById(R.id.moonnaklord);




        spin1.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, plantes){

            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(aa);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(this);
        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, plantes){

            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(bb);
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin3.setOnItemSelectedListener(this);
        ArrayAdapter cc = new ArrayAdapter(this, android.R.layout.simple_spinner_item, plantes){

            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        cc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(cc);
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin4.setOnItemSelectedListener(this);
        ArrayAdapter dd = new ArrayAdapter(this, android.R.layout.simple_spinner_item, plantes){

            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        dd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin4.setAdapter(dd);
        spin4.setBackgroundColor(Color.RED);
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin5.setOnItemSelectedListener(this);
        ArrayAdapter ee = new ArrayAdapter(this, android.R.layout.simple_spinner_item, plantes){

            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        ee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin5.setAdapter(ee);
        spin5.setBackgroundColor(Color.RED);
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin6.setOnItemSelectedListener(this);
        ArrayAdapter ff = new ArrayAdapter(this, android.R.layout.simple_spinner_item, plantes){

            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        ff.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin6.setAdapter(ff);
        spin6.setBackgroundColor(Color.RED);
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        home1=(TextView) findViewById(R.id.home1);
        home1.setText(""+MainActivity.shome.getText());

        away1=(TextView) findViewById(R.id.away1);
        away1.setText(""+MainActivity.saway.getText());


        sleauge=(TextView)findViewById(R.id.sleague);
        sleauge.setText(""+MainActivity.sleague.getText());
        sgoal=(TextView)findViewById(R.id.sgoal);
        sgoal.setText("Goals-"+MainActivity.selectedItemGoalOne+" - "+MainActivity.selectedItemGoalTwo);
        title=(TextView)findViewById(R.id.title);
        title.setTextColor(Color.RED);
        sdate=(TextView) findViewById(R.id.showdate);
        stime=(TextView)findViewById(R.id.showtime);
        stime.setText("Time : "+MainActivity.atime.getText());

        sdate.setText("Date : "+MainActivity.date.getText());

        ss1=(TextView)findViewById(R.id.ptone);
        ss1.setText(""+MainActivity.ptone);
        ss2=(TextView)findViewById(R.id.ptone2);
        ss2.setText(""+MainActivity.pttwo);
        ss3=(TextView)findViewById(R.id.ptone3);
        ss3.setText(""+MainActivity.ptthree);
        ss4=(TextView)findViewById(R.id.ptone4);
        ss4.setText(""+MainActivity.ptfour);
        ss4.setTextColor(Color.RED);
        ss5=(TextView)findViewById(R.id.ptone5);
        ss5.setText(""+MainActivity.ptfive);
        ss6=(TextView)findViewById(R.id.ptone6);
        ss6.setText(""+MainActivity.ptsix);
        ss7=(TextView)findViewById(R.id.ptone7);
        ss7.setText(""+MainActivity.ptseven);

        tss1=(TextView)findViewById(R.id.etone);
        tss1.setText(""+MainActivity.etone);
        tss2=(TextView)findViewById(R.id.etone2);
        tss2.setText(""+MainActivity.ettwo);
        tss3=(TextView)findViewById(R.id.etone3);
        tss3.setText(""+MainActivity.etthree);
        tss4=(TextView)findViewById(R.id.etone4);
        tss4.setText(""+MainActivity.etfour);
        tss4.setTextColor(Color.RED);
        tss5=(TextView)findViewById(R.id.etone5);
        tss5.setText(""+MainActivity.etfive);
        tss6=(TextView)findViewById(R.id.etone6);
        tss6.setText(""+MainActivity.etsix);
        tss7=(TextView)findViewById(R.id.etone7);
        tss7.setText(""+MainActivity.etseven);


        spone=(TextView)findViewById(R.id.textView3);
        if (MainActivity.ftnamestartnumber==MainActivity.pone){
            spone.setText(""+MainActivity.pone);
            spone.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pone){
            spone.setText(""+MainActivity.pone);
            spone.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pone){
            spone.setText(""+MainActivity.pone);
            spone.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pone){
            spone.setText(""+MainActivity.pone);
            spone.setTextColor(Color.CYAN);
        }
        else spone.setText(""+MainActivity.pone);


        sptwo=(TextView)findViewById(R.id.textView2);
        if (MainActivity.ftnamestartnumber==MainActivity.ptwo){
            sptwo.setText(""+MainActivity.ptwo);
            sptwo.setTextColor(Color.RED);


        }else if (MainActivity.ftnameendnumber==MainActivity.ptwo){
            sptwo.setText(""+MainActivity.ptwo);
            sptwo.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.ptwo){
            sptwo.setText(""+MainActivity.ptwo);
            sptwo.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.ptwo){
            sptwo.setText(""+MainActivity.ptwo);
            sptwo.setTextColor(Color.CYAN);
        }
        else sptwo.setText(""+MainActivity.ptwo);

        spthree=(TextView)findViewById(R.id.textView6);
        if (MainActivity.ftnamestartnumber==MainActivity.pthree){
            spthree.setText(""+MainActivity.pthree);
            spthree.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pthree){
            spthree.setText(""+MainActivity.pthree);
            spthree.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pthree){
            spthree.setText(""+MainActivity.pthree);
            spthree.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pthree){
            spthree.setText(""+MainActivity.pthree);
            spthree.setTextColor(Color.CYAN);
        }
        else spthree.setText(""+MainActivity.pthree);

        spfour=(TextView)findViewById(R.id.textView5);
        if (MainActivity.ftnamestartnumber==MainActivity.pfour){
            spfour.setText(""+MainActivity.pfour);
            spfour.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pfour){
            spfour.setText(""+MainActivity.pfour);
            spfour.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pfour){
            spfour.setText(""+MainActivity.pfour);
            spfour.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pfour){
            spfour.setText(""+MainActivity.pfour);
            spfour.setTextColor(Color.CYAN);
        }
        else spfour.setText(""+MainActivity.pfour);

        spfive=(TextView)findViewById(R.id.textView1);
        if (MainActivity.ftnamestartnumber==MainActivity.pfive){
            spfive.setText(""+MainActivity.pfive);
            spfive.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pfive){
            spfive.setText(""+MainActivity.pfive);
            spfive.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pfive){
            spfive.setText(""+MainActivity.pfive);
            spfive.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pfive){
            spfive.setText(""+MainActivity.pfive);
            spfive.setTextColor(Color.CYAN);
        }
        else spfive.setText(""+MainActivity.pfive);


        spsix=(TextView)findViewById(R.id.textView7);
        if (MainActivity.ftnamestartnumber==MainActivity.psix){
            spsix.setText(""+MainActivity.psix);
            spsix.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.psix){
            spsix.setText(""+MainActivity.psix);
            spsix.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.psix){
            spsix.setText(""+MainActivity.psix);
            spsix.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.psix){
            spsix.setText(""+MainActivity.psix);
            spsix.setTextColor(Color.CYAN);
        }
        else spsix.setText(""+MainActivity.psix);


        spseven=(TextView)findViewById(R.id.textView8);
        if (MainActivity.ftnamestartnumber==MainActivity.pseven){
            spseven.setText(""+MainActivity.pseven);
            spseven.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pseven){
            spseven.setText(""+MainActivity.pseven);
            spseven.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pseven){
            spseven.setText(""+MainActivity.pseven);
            spseven.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pseven){
            spseven.setText(""+MainActivity.pseven);
            spseven.setTextColor(Color.CYAN);
        }
        else spseven.setText(""+MainActivity.pseven);

        tpone=(TextView)findViewById(R.id.textView);
        if (MainActivity.ftnamestartnumber==MainActivity.pone){
            tpone.setText(""+MainActivity.pone);
            tpone.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pone){
            tpone.setText(""+MainActivity.pone);
            tpone.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pone){
            tpone.setText(""+MainActivity.pone);
            tpone.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pone){
            tpone.setText(""+MainActivity.pone);
            tpone.setTextColor(Color.CYAN);
        }
        else tpone.setText(""+MainActivity.pone);


        tptwo=(TextView)findViewById(R.id.textView10);
        if (MainActivity.ftnamestartnumber==MainActivity.ptwo){
            tptwo.setText(""+MainActivity.ptwo);
            tptwo.setTextColor(Color.RED);


        }else if (MainActivity.ftnameendnumber==MainActivity.ptwo){
            tptwo.setText(""+MainActivity.ptwo);
            tptwo.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.ptwo){
            tptwo.setText(""+MainActivity.ptwo);
            tptwo.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.ptwo){
            tptwo.setText(""+MainActivity.ptwo);
            tptwo.setTextColor(Color.CYAN);
        }
        else tptwo.setText(""+MainActivity.ptwo);


        tpthree=(TextView)findViewById(R.id.textView13);
        if (MainActivity.ftnamestartnumber==MainActivity.pthree){
            tpthree.setText(""+MainActivity.pthree);
            tpthree.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pthree){
            tpthree.setText(""+MainActivity.pthree);
            tpthree.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pthree){
            tpthree.setText(""+MainActivity.pthree);
            tpthree.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pthree){
            tpthree.setText(""+MainActivity.pthree);
            tpthree.setTextColor(Color.CYAN);
        }
        else tpthree.setText(""+MainActivity.pthree);


        tpfour=(TextView)findViewById(R.id.textView12);
        if (MainActivity.ftnamestartnumber==MainActivity.pfour){
            tpfour.setText(""+MainActivity.pfour);
            tpfour.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pfour){
            tpfour.setText(""+MainActivity.pfour);
            tpfour.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pfour){
            tpfour.setText(""+MainActivity.pfour);
            tpfour.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pfour){
            tpfour.setText(""+MainActivity.pfour);
            tpfour.setTextColor(Color.CYAN);
        }
        else tpfour.setText(""+MainActivity.pfour);


        tpfive=(TextView)findViewById(R.id.textView15);
        if (MainActivity.ftnamestartnumber==MainActivity.pfive){
            tpfive.setText(""+MainActivity.pfive);
            tpfive.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pfive){
            tpfive.setText(""+MainActivity.pfive);
            tpfive.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pfive){
            tpfive.setText(""+MainActivity.pfive);
            tpfive.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pfive){
            tpfive.setText(""+MainActivity.pfive);
            tpfive.setTextColor(Color.CYAN);
        }
        else tpfive.setText(""+MainActivity.pfive);


        tpsix=(TextView)findViewById(R.id.textView14);
        if (MainActivity.ftnamestartnumber==MainActivity.psix){
            tpsix.setText(""+MainActivity.psix);
            tpsix.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.psix){
            tpsix.setText(""+MainActivity.psix);
            tpsix.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.psix){
            tpsix.setText(""+MainActivity.psix);
            tpsix.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.psix){
            tpsix.setText(""+MainActivity.psix);
            tpsix.setTextColor(Color.CYAN);
        }
        else tpsix.setText(""+MainActivity.psix);


        tpseven=(TextView)findViewById(R.id.textView9);
        if (MainActivity.ftnamestartnumber==MainActivity.pseven){
            tpseven.setText(""+MainActivity.pseven);
            tpseven.setTextColor(Color.RED);

        }else if (MainActivity.ftnameendnumber==MainActivity.pseven){
            tpseven.setText(""+MainActivity.pseven);
            tpseven.setTextColor(Color.BLUE);
        }
        else if(MainActivity.secnamestartnumber==MainActivity.pseven){
            tpseven.setText(""+MainActivity.pseven);
            tpseven.setTextColor(Color.GREEN);
        }
        else if(MainActivity.secnameendnumber==MainActivity.pseven){
            tpseven.setText(""+MainActivity.pseven);
            tpseven.setTextColor(Color.CYAN);
        }
        else tpseven.setText(""+MainActivity.pseven);


        ftstartnumber=(TextView)findViewById(R.id.textView19);
       ftstartnumber.setText(""+MainActivity.ftnamestartnumber);
       ftstartnumber.setTextColor(Color.RED);
       ftendnumber=(TextView)findViewById(R.id.textView21);
        ftendnumber.setText(""+MainActivity.ftnameendnumber);
         ftendnumber.setTextColor(Color.BLUE);

        secstartnumber=(TextView)findViewById(R.id.textView24);
        secstartnumber.setText(""+MainActivity.secnamestartnumber);
        secstartnumber.setTextColor(Color.GREEN);
        secendnumber=(TextView)findViewById(R.id.textView26);
        secendnumber.setText(""+MainActivity.secnameendnumber);
        secendnumber.setTextColor(Color.CYAN);

    }





    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
