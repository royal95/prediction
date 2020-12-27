package com.android.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.text.LineBreaker;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;

import javax.xml.transform.Result;

public class MainActivity<string> extends Activity implements AdapterView.OnItemSelectedListener {
    String selectedItemTextOne,selectedItemTextTwo,selectedItemTextThree,valone,valtwo,valthree,valfour,selectedItemTextFour;
    public static EditText date;
    public static EditText atime,sleague,shome,saway;
    String ftnamestart,ftnameend,secnamestart,secnameend;
    public static String selectedItemGoalOne,selectedItemGoalTwo;
    public  static String ftnamestartnumber,ftnameendnumber,secnamestartnumber,secnameendnumber;
  String numberone;
  String numbertwo;
   String numberthree;
   String numberfour;
    public static String pone,ptwo,pthree,pfour,pfive,psix,pseven;
    public static String ptone,pttwo,ptthree,ptfour,ptfive,ptsix,ptseven;
    public static String etone,ettwo,etthree,etfour,etfive,etsix,etseven;
    String[] goala={"","0","1","2","3","4","5","6","7","8","9"};
    int one,two,three,four,five,six,seven,eight,zero,total,onenumber,twonumber,threenumber;
    String[] bankNames = {"မွေးနံ","တနင်္ဂနွေ","တနင်္လာ", "အင်္ဂါ", "ဗုဒ္ဓဟူး", "ရာဟု","ကြာသပတေး", "သောကြာ","စနေ"};
    String [] pnumber={"ပေါင်းကိန်း","၁","၂","၃","၄","၅","၆","၈","၀"};
    String[] snumber = {"နာမည်အစ","၀ (တ,ထ,ဇ,န)","၁ (အ,ဥ,ဧ)", "၂ (က,ခ,ဂ,ဃ,င)", "၃ (စ,ဆ,ဇ,စျ,ည)", "၄ (လ,ယ)","၅ (ပ,ဖ,ဘ,မ)", "၆ (သ,ဟ)","၈ (၀,ရ)"};
    String[] enumber = {"နာမည်အဆုံး","၀ (တ,ထ,ဇ,န)","၁ (အ,ဥ,ဧ)", "၂ (က,ခ,ဂ,ဃ,င)", "၃ (စ,ဆ,ဇ,စျ,ည)", "၄ (လ,ယ)","၅ (ပ,ဖ,ဘ,မ)", "၆ (သ,ဟ)","၈ (၀,ရ)"};
    String[] day={"Day","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static Integer seconds;
    public static Integer minutes,hour;
    private Button button;
    DatePickerDialog datePickerDialog;
    int conmin,addmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, result.class);
                MainActivity.this.startActivity(activityChangeIntent);
                openActivity2();


            }
        });
        Spinner goal1 = (Spinner) findViewById(R.id.goalspin);
        goal1.setOnItemSelectedListener(this);
        ArrayAdapter goal = new ArrayAdapter(this, android.R.layout.simple_spinner_item, goala){
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
        goal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        goal1.setAdapter(goal);
        goal1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItemGoalOne = (String) parent.getItemAtPosition(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Spinner spingoal2 = (Spinner) findViewById(R.id.goalspin2);
        spingoal2.setOnItemSelectedListener(this);
        ArrayAdapter goal2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,  goala){
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
        goal2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spingoal2.setAdapter(goal2);
        spingoal2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItemGoalTwo = (String) parent.getItemAtPosition(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Spinner spin8=(Spinner) findViewById(R.id.fourthspinner);

        spin8.setOnItemSelectedListener(this);
        ArrayAdapter kk = new ArrayAdapter(this, android.R.layout.simple_spinner_item, day){

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
        kk.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin8.setAdapter(kk);
        spin8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItemTextFour = (String) parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Spinner spin1 = (Spinner) findViewById(R.id.firstspinner);
        Spinner spin2 = (Spinner) findViewById(R.id.secondspinner);
        Spinner spin3 = (Spinner) findViewById(R.id.spinnerone);
        Spinner spin4 = (Spinner) findViewById(R.id.spinnertwo);
        Spinner spin5 = (Spinner) findViewById(R.id.spinnerthree);
        Spinner spin6 = (Spinner) findViewById(R.id.spinnerfour);
        Spinner spin7 = (Spinner) findViewById(R.id.thirdspinner);
       spin1.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, bankNames){

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
                selectedItemTextOne = (String) parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(this);
        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, bankNames){
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
                 selectedItemTextTwo = (String) parent.getItemAtPosition(position);
                // If user change the default selection
                // First item is disable and it is used for hint

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spin7.setOnItemSelectedListener(this);
        ArrayAdapter gg = new ArrayAdapter(this, android.R.layout.simple_spinner_item, pnumber){
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
        gg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin7.setAdapter(gg);
        spin7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 selectedItemTextThree = (String) parent.getItemAtPosition(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spin3.setOnItemSelectedListener(this);
        ArrayAdapter cc= new ArrayAdapter(this, android.R.layout.simple_spinner_item, snumber){
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
                ftnamestart= (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        spin4.setOnItemSelectedListener(this);
        ArrayAdapter dd= new ArrayAdapter(this, android.R.layout.simple_spinner_item, enumber){
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
        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ftnameend = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin5.setOnItemSelectedListener(this);
        ArrayAdapter ee= new ArrayAdapter(this, android.R.layout.simple_spinner_item, snumber){
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
        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secnamestart= (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spin6.setOnItemSelectedListener(this);
        ArrayAdapter ff= new ArrayAdapter(this, android.R.layout.simple_spinner_item, enumber){
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
        spin6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                secnameend= (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        date = (EditText) findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender

                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                date.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
       sleague=(EditText)findViewById(R.id.league);
        sleague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sleague.setText("");
            }
        });
        shome=(EditText)findViewById(R.id.home);
        shome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shome.setText("");
            }
        });
        saway=(EditText)findViewById(R.id.away);
        saway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saway.setText("");
            }
        });

        atime = (EditText) findViewById(R.id.time);
        atime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        atime.setText(selectedHour + "." + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });
    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {

    }

    public void openActivity2() {
        if(ftnamestart=="၀ (တ,ထ,ဇ,န)"){

            ftnamestartnumber=String.valueOf("0");
        }
        else if(ftnamestart=="၁ (အ,ဥ,ဧ)"){

            ftnamestartnumber=String.valueOf("1");
        }
        else if(ftnamestart=="၂ (က,ခ,ဂ,ဃ,င)"){

            ftnamestartnumber=String.valueOf("2");
        }
        else if(ftnamestart=="၃ (စ,ဆ,ဇ,စျ,ည)"){

            ftnamestartnumber=String.valueOf("3");
        }
        else if(ftnamestart=="၄ (လ,ယ)"){

            ftnamestartnumber=String.valueOf("4");

        }
        else if(ftnamestart=="၅ (ပ,ဖ,ဘ,မ)"){

            ftnamestartnumber=String.valueOf("5");
        }
        else if(ftnamestart=="၆ (သ,ဟ)"){
            ftnamestartnumber=String.valueOf("6");
        }
        else {
            ftnamestartnumber=String.valueOf("4");
        }


        if(ftnameend=="၀ (တ,ထ,ဇ,န)"){

            ftnameendnumber=String.valueOf("0");
        }
        else if(ftnameend=="၁ (အ,ဥ,ဧ)"){

            ftnameendnumber=String.valueOf("1");
        }
        else if(ftnameend=="၂ (က,ခ,ဂ,ဃ,င)"){

            ftnameendnumber=String.valueOf("2");
        }
        else if(ftnameend=="၃ (စ,ဆ,ဇ,စျ,ည)"){

            ftnameendnumber=String.valueOf("3");
        }
        else if(ftnameend=="၄ (လ,ယ)"){

            ftnameendnumber=String.valueOf("4");

        }
        else if(ftnameend=="၅ (ပ,ဖ,ဘ,မ)"){

            ftnameendnumber=String.valueOf("5");
        }
        else if(ftnameend=="၆ (သ,ဟ)"){

            ftnameendnumber=String.valueOf("6");
        }
        else {
            ftnameendnumber=String.valueOf("4");
        }




        if(secnamestart=="၀ (တ,ထ,ဇ,န)"){

            secnamestartnumber=String.valueOf("0");
        }
        else if(secnamestart=="၁ (အ,ဥ,ဧ)"){

            secnamestartnumber=String.valueOf("1");
        }
        else if(secnamestart=="၂ (က,ခ,ဂ,ဃ,င)"){

            secnamestartnumber=String.valueOf("2");
        }
        else if(secnamestart=="၃ (စ,ဆ,ဇ,စျ,ည)"){

            secnamestartnumber=String.valueOf("3");
        }
        else if(secnamestart=="၄ (လ,ယ)"){

            secnamestartnumber=String.valueOf("4");

        }
        else if(secnamestart=="၅ (ပ,ဖ,ဘ,မ)"){

            secnamestartnumber=String.valueOf("5");
        }
        else if(secnamestart=="၆ (သ,ဟ)"){

            secnamestartnumber=String.valueOf("6");
        }
        else {
            secnamestartnumber=String.valueOf("4");
        }


        if(secnameend=="၀ (တ,ထ,ဇ,န)"){

            secnameendnumber=String.valueOf("0");
        }
        else if(secnameend=="၁ (အ,ဥ,ဧ)"){

            secnameendnumber=String.valueOf("1");
        }
        else if(secnameend=="၂ (က,ခ,ဂ,ဃ,င)"){

            secnameendnumber=String.valueOf("2");
        }
        else if(secnameend=="၃ (စ,ဆ,ဇ,စျ,ည)"){

            secnameendnumber=String.valueOf("3");
        }
        else if(secnameend=="၄ (လ,ယ)"){

            secnameendnumber=String.valueOf("4");

        }
        else if(secnameend=="၅ (ပ,ဖ,ဘ,မ)"){

            secnameendnumber=String.valueOf("5");
        }
        else if(secnameend=="၆ (သ,ဟ)"){

            secnameendnumber=String.valueOf("6");
        }
        else {
            secnameendnumber=String.valueOf("4");
        }

        valone=selectedItemTextOne;
        valtwo=selectedItemTextTwo;
        valthree=selectedItemTextThree;

        if(valone=="တနင်္ဂနွေ"){
            one=6;
            numberone=String.valueOf(one);
        }else if(valone=="တနင်္လာ"){
            two=15;
            numberone=String.valueOf(two);
        }else if(valone=="အင်္ဂါ"){
            three=8;
            numberone=String.valueOf(three);
        }
        else if(valone=="ဗုဒ္ဓဟူး"){
            four=17;
            numberone=String.valueOf(four);
        }
        else if(valone=="ရာဟု"){
            five=12;
            numberone=String.valueOf(five);
        }
        else if(valone=="ကြာသပတေး"){
            six =19;
            numberone=String.valueOf(six);
        }
        else  if(valone=="သောကြာ"){
            seven=21;
            numberone=String.valueOf(seven);
        }else{
            eight=10;
            numberone=String.valueOf(eight);
        }
        if(valtwo=="တနင်္ဂနွေ"){
            one=6;
            numbertwo=String.valueOf(one);
        }else if(valtwo=="တနင်္လာ"){
            two=15;
            numbertwo=String.valueOf(two);
        } else if(valtwo=="အင်္ဂါ"){
            three=8;
            numbertwo=String.valueOf(three);
        }
        else if(valtwo=="ဗုဒ္ဓဟူး"){
            four=17;
            numbertwo=String.valueOf(four);
        }
        else if(valtwo=="ရာဟု"){
            five=12;
            numbertwo=String.valueOf(five);
        }
        else if(valtwo=="ကြာသပတေး"){
            six =19;
            numbertwo=String.valueOf(six);
        }
        else if(valtwo=="သောကြာ"){
            seven=21;
            numbertwo=String.valueOf(seven);
        } else {
            eight=10;
            numbertwo=String.valueOf(eight);
        }
        if(valthree=="၁"){
            one=1;
            numberthree=String.valueOf(one);
        }
        else if(valthree=="၂"){
            two=2;
            numberthree=String.valueOf(two);
        }
        else if(valthree=="၃"){
            three=3;
            numberthree=String.valueOf(three);
        }
        else if(valthree=="၄"){
            four=4;
            numberthree=String.valueOf(four);
        }
        else if(valthree=="၅"){
            five=5;
            numberthree=String.valueOf(five);
        }
        else if(valthree=="၆"){
            six=6;
            numberthree=String.valueOf(six);
        }
        else if(valthree=="၈"){
            eight=8;
            numberthree=String.valueOf(eight);
        }
        else {
            zero=0;
            numberthree=String.valueOf(zero);
        }
        onenumber = Integer.valueOf(numberone);
        twonumber = Integer.valueOf(numbertwo);
        threenumber = Integer.valueOf(numberthree);
        total=(onenumber+twonumber+threenumber)%7;

        int min=threenumber*60;
        if (total==0){
            pone=String.valueOf("0");
            ptwo=String.valueOf("1");
            pthree=String.valueOf("2");
            pfour=String.valueOf("3");
            pfive=String.valueOf("4");
            psix=String.valueOf("5");
            pseven=String.valueOf("6");

        }
        else if(total==1){
            pone=String.valueOf("1");
            ptwo=String.valueOf("2");
            pthree=String.valueOf("3");
            pfour=String.valueOf("4");
            pfive=String.valueOf("5");
            psix=String.valueOf("6");
            pseven=String.valueOf("0");

        }
        else if(total==2){
            pone=String.valueOf("2");
            ptwo=String.valueOf("3");
            pthree=String.valueOf("4");
            pfour=String.valueOf("5");
            pfive=String.valueOf("6");
            psix=String.valueOf("0");
            pseven=String.valueOf("1");

        }
        else if(total==3){
            pone=String.valueOf("3");
            ptwo=String.valueOf("4");
            pthree=String.valueOf("5");
            pfour=String.valueOf("6");
            pfive=String.valueOf("0");
            psix=String.valueOf("1");
            pseven=String.valueOf("2");

        }
        else if(total==4){
            pone=String.valueOf("4");
            ptwo=String.valueOf("5");
            pthree=String.valueOf("6");
            pfour=String.valueOf("0");
            pfive=String.valueOf("1");
            psix=String.valueOf("2");
            pseven=String.valueOf("3");

        }
        else if(total==5){
            pone=String.valueOf("5");
            ptwo=String.valueOf("6");
            pthree=String.valueOf("0");
            pfour=String.valueOf("1");
            pfive=String.valueOf("2");
            psix=String.valueOf("3");
            pseven=String.valueOf("4");

        }
        else {
            pone=String.valueOf("6");
            ptwo=String.valueOf("0");
            pthree=String.valueOf("1");
            pfour=String.valueOf("2");
            pfive=String.valueOf("3");
            psix=String.valueOf("4");
            pseven=String.valueOf("5");

        }

        valfour=selectedItemTextFour;
        String t5=atime.getText().toString();
        Float t4=Float.valueOf(t5);
        int timepickerminute=Integer.valueOf((int) ((t4*100)%100));
        int thour=Integer.valueOf((int) ((t4*100)/100))*60;
        int timepickerhour = 0;
        if(timepickerhour>720){
            timepickerhour=720-thour;
        }else timepickerhour=timepickerhour;

        if(timepickerhour<0){
            timepickerhour=timepickerhour*(-1);
        }else timepickerhour=timepickerhour;
         conmin=timepickerhour+timepickerminute;
        addmin=conmin+110;
        if(valfour=="Sunday"){

            if (conmin<40){
                ptone=String.valueOf("5");
                pttwo=String.valueOf("2");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("1");
                ptfive=String.valueOf("4");
                ptsix=String.valueOf("0");
                ptseven=String.valueOf("3");


                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }


            }

            else if(conmin>40&conmin<233)
            {
                ptone=String.valueOf("1");
                pttwo=String.valueOf("5");
                ptthree=String.valueOf("2");
                ptfour=String.valueOf("4");
                ptfive=String.valueOf("0");
                ptsix=String.valueOf("3");
                ptseven=String.valueOf("6");

                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }

            }
            else if(conmin>233&conmin<299){
                ptone=String.valueOf("4");
                pttwo=String.valueOf("1");
                ptthree=String.valueOf("5");
                ptfour=String.valueOf("0");
                ptfive=String.valueOf("3");
                ptsix=String.valueOf("6");
                ptseven=String.valueOf("2");

                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }

            }
            else if(conmin>299&conmin<352) {
                ptone=String.valueOf("0");
                pttwo=String.valueOf("4");
                ptthree=String.valueOf("1");
                ptfour=String.valueOf("3");
                ptfive=String.valueOf("6");
                ptsix=String.valueOf("2");
                ptseven=String.valueOf("5");

                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }

            }

            else if(conmin>352&conmin<491)  {
                ptone=String.valueOf("3");
                pttwo=String.valueOf("0");
                ptthree=String.valueOf("4");
                ptfour=String.valueOf("6");
                ptfive=String.valueOf("2");
                ptsix=String.valueOf("5");
                ptseven=String.valueOf("1");

                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }

            }
            else if(conmin>491&conmin<590)  {
                ptone=String.valueOf("6");
                pttwo=String.valueOf("3");
                ptthree=String.valueOf("0");
                ptfour=String.valueOf("2");
                ptfive=String.valueOf("5");
                ptsix=String.valueOf("1");
                ptseven=String.valueOf("4");
                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }

            }
            else    {
                ptone=String.valueOf("2");
                pttwo=String.valueOf("6");
                ptthree=String.valueOf("3");
                ptfour=String.valueOf("5");
                ptfive=String.valueOf("1");
                ptsix=String.valueOf("4");
                ptseven=String.valueOf("0");
                if(addmin>40&addmin<233)
                {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>233&addmin<299){
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>299&addmin<352) {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }

                else if(addmin>352&addmin<491)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>491&addmin<590)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else   if (addmin>590& addmin<720){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");

                }
            }
        }
        else if(valfour=="Monday"){

            if (conmin<99){
                ptone=String.valueOf("6");
                pttwo=String.valueOf("3");
                ptthree=String.valueOf("0");
                ptfour=String.valueOf("2");
                ptfive=String.valueOf("5");
                ptsix=String.valueOf("1");
                ptseven=String.valueOf("4");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }



            }

            else if(conmin>99&conmin<225)
            {
                ptone=String.valueOf("2");
                pttwo=String.valueOf("6");
                ptthree=String.valueOf("3");
                ptfour=String.valueOf("5");
                ptfive=String.valueOf("1");
                ptsix=String.valueOf("4");
                ptseven=String.valueOf("0");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }
            }
            else if(conmin>225&conmin<265){
                ptone=String.valueOf("5");
                pttwo=String.valueOf("2");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("1");
                ptfive=String.valueOf("4");
                ptsix=String.valueOf("0");
                ptseven=String.valueOf("3");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }
            }
            else if(conmin>265&conmin<458) {
                ptone=String.valueOf("1");
                pttwo=String.valueOf("5");
                ptthree=String.valueOf("2");
                ptfour=String.valueOf("4");
                ptfive=String.valueOf("0");
                ptsix=String.valueOf("3");
                ptseven=String.valueOf("6");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }
            }

            else if(conmin>458&conmin<524)  {
                ptone=String.valueOf("4");
                pttwo=String.valueOf("1");
                ptthree=String.valueOf("5");
                ptfour=String.valueOf("0");
                ptfive=String.valueOf("3");
                ptsix=String.valueOf("6");
                ptseven=String.valueOf("2");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }
            }
            else if(conmin>524&conmin<577)  {
                ptone=String.valueOf("0");
                pttwo=String.valueOf("4");
                ptthree=String.valueOf("1");
                ptfour=String.valueOf("3");
                ptfive=String.valueOf("6");
                ptsix=String.valueOf("2");
                ptseven=String.valueOf("5");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }
            }
            else    {
                ptone=String.valueOf("3");
                pttwo=String.valueOf("0");
                ptthree=String.valueOf("4");
                ptfour=String.valueOf("6");
                ptfive=String.valueOf("2");
                ptsix=String.valueOf("5");
                ptseven=String.valueOf("1");
                if(addmin>99&addmin<225)
                {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>225&addmin<265){
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>265&addmin<458) {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }

                else if(addmin>458&addmin<524)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>524&addmin<577)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else  if(addmin>577&addmin<720) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else{
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");

                }
            }

        }
        else if(valfour=="Tuesday"){
            if (conmin<53){
                ptone=String.valueOf("0");
                pttwo=String.valueOf("4");
                ptthree=String.valueOf("1");
                ptfour=String.valueOf("3");
                ptfive=String.valueOf("6");
                ptsix=String.valueOf("2");
                ptseven=String.valueOf("5");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");

            }}

            else if(conmin>53&conmin<192)
            {
                ptone=String.valueOf("3");
                pttwo=String.valueOf("0");
                ptthree=String.valueOf("4");
                ptfour=String.valueOf("6");
                ptfive=String.valueOf("2");
                ptsix=String.valueOf("5");
                ptseven=String.valueOf("1");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
            }
            else if(conmin>192&conmin<291){
                ptone=String.valueOf("6");
                pttwo=String.valueOf("3");
                ptthree=String.valueOf("0");
                ptfour=String.valueOf("2");
                ptfive=String.valueOf("5");
                ptsix=String.valueOf("1");
                ptseven=String.valueOf("4");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
            }
            else if(conmin>291&conmin<417) {
                ptone=String.valueOf("2");
                pttwo=String.valueOf("6");
                ptthree=String.valueOf("3");
                ptfour=String.valueOf("5");
                ptfive=String.valueOf("1");
                ptsix=String.valueOf("4");
                ptseven=String.valueOf("0");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
            }

            else if(conmin>417&conmin<456)  {
                ptone=String.valueOf("5");
                pttwo=String.valueOf("2");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("1");
                ptfive=String.valueOf("4");
                ptsix=String.valueOf("0");
                ptseven=String.valueOf("3");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
            }
            else if(conmin>456&conmin<649)  {
                ptone=String.valueOf("1");
                pttwo=String.valueOf("5");
                ptthree=String.valueOf("2");
                ptfour=String.valueOf("4");
                ptfive=String.valueOf("0");
                ptsix=String.valueOf("3");
                ptseven=String.valueOf("6");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
            }
            else    {
                ptone=String.valueOf("4");
                pttwo=String.valueOf("1");
                ptthree=String.valueOf("5");
                ptfour=String.valueOf("0");
                ptfive=String.valueOf("3");
                ptsix=String.valueOf("6");
                ptseven=String.valueOf("2");
                if(addmin>53&addmin<192)
                {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else if(addmin>192&addmin<291){
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>291&addmin<417) {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }

                else if(addmin>417&addmin<456)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else if(addmin>456&addmin<649)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else  if(addmin>649&addmin<720)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else{
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
            }
        }
        else if(valfour=="Wednesday"){
            if (conmin<193){
                ptone=String.valueOf("1");
                pttwo=String.valueOf("5");
                ptthree=String.valueOf("2");
                ptfour=String.valueOf("4");
                ptfive=String.valueOf("0");
                ptsix=String.valueOf("3");
                ptseven=String.valueOf("6");

                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                    {
                        etone=String.valueOf("4");
                        ettwo=String.valueOf("1");
                        etthree=String.valueOf("5");
                        etfour=String.valueOf("0");
                        etfive=String.valueOf("3");
                        etsix=String.valueOf("6");
                        etseven=String.valueOf("2");
                    }


            }

            else if(conmin>193&conmin<259)
            {
                ptone=String.valueOf("4");
                pttwo=String.valueOf("1");
                ptthree=String.valueOf("5");
                ptfour=String.valueOf("0");
                ptfive=String.valueOf("3");
                ptsix=String.valueOf("6");
                ptseven=String.valueOf("2");
                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
            }
            else if(conmin>259&conmin<312){
                ptone=String.valueOf("0");
                pttwo=String.valueOf("4");
                ptthree=String.valueOf("1");
                ptfour=String.valueOf("3");
                ptfive=String.valueOf("6");
                ptsix=String.valueOf("2");
                ptseven=String.valueOf("5");
                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
            }
            else if(conmin>312&conmin<451) {
                ptone=String.valueOf("3");
                pttwo=String.valueOf("0");
                ptthree=String.valueOf("4");
                ptfour=String.valueOf("6");
                ptfive=String.valueOf("2");
                ptsix=String.valueOf("5");
                ptseven=String.valueOf("1");
                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
            }

            else if(conmin>451&conmin<550)  {
                ptone=String.valueOf("6");
                pttwo=String.valueOf("3");
                ptthree=String.valueOf("0");
                ptfour=String.valueOf("2");
                ptfive=String.valueOf("5");
                ptsix=String.valueOf("1");
                ptseven=String.valueOf("0");
                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
            }
            else if(conmin>550&conmin<676)  {
                ptone=String.valueOf("2");
                pttwo=String.valueOf("6");
                ptthree=String.valueOf("3");
                ptfour=String.valueOf("5");
                ptfive=String.valueOf("1");
                ptsix=String.valueOf("4");
                ptseven=String.valueOf("0");
                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
            }
            else    {
                ptone=String.valueOf("5");
                pttwo=String.valueOf("2");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("1");
                ptfive=String.valueOf("4");
                ptsix=String.valueOf("0");
                ptseven=String.valueOf("3");
                if(addmin>193&addmin<259)
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else if(addmin>259&addmin<312){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>312&addmin<451) {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }

                else if(addmin>451&addmin<550)  {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("0");
                }
                else if(addmin>550&addmin<676)  {
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else    if(addmin>676&addmin<720)  {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
                else
                {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
            }
        }
        else if(valfour=="Thursday"){
            if (conmin<126){
                ptone=String.valueOf("2");
                pttwo=String.valueOf("6");
                ptthree=String.valueOf("3");
                ptfour=String.valueOf("5");
                ptfive=String.valueOf("1");
                ptsix=String.valueOf("4");
                ptseven=String.valueOf("0");

                if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>359&addmin<425) {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else if(addmin>425&addmin<478)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>478&addmin<617)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else  if(addmin>617&addmin<720)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else{

                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }


            }

            else if(conmin>126&conmin<166)
            {
                ptone=String.valueOf("5");
                pttwo=String.valueOf("2");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("1");
                ptfive=String.valueOf("4");
                ptsix=String.valueOf("0");
                ptseven=String.valueOf("3");

                if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                etone=String.valueOf("1");
                ettwo=String.valueOf("5");
                etthree=String.valueOf("2");
                etfour=String.valueOf("4");
                etfive=String.valueOf("0");
                etsix=String.valueOf("3");
                etseven=String.valueOf("6");
            }
            else if(addmin>359&addmin<425) {
                etone=String.valueOf("4");
                ettwo=String.valueOf("1");
                etthree=String.valueOf("5");
                etfour=String.valueOf("0");
                etfive=String.valueOf("3");
                etsix=String.valueOf("6");
                etseven=String.valueOf("2");
            }

            else if(addmin>425&addmin<478)  {
                etone=String.valueOf("0");
                ettwo=String.valueOf("4");
                etthree=String.valueOf("1");
                etfour=String.valueOf("3");
                etfive=String.valueOf("6");
                etsix=String.valueOf("2");
                etseven=String.valueOf("5");
            }
            else if(addmin>478&addmin<617)  {
                etone=String.valueOf("3");
                ettwo=String.valueOf("0");
                etthree=String.valueOf("4");
                etfour=String.valueOf("6");
                etfive=String.valueOf("2");
                etsix=String.valueOf("5");
                etseven=String.valueOf("1");
            }
            else  if(addmin>617&addmin<720)  {
                etone=String.valueOf("0");
                ettwo=String.valueOf("3");
                etthree=String.valueOf("6");
                etfour=String.valueOf("2");
                etfive=String.valueOf("5");
                etsix=String.valueOf("1");
                etseven=String.valueOf("4");
            }
            else{

                etone=String.valueOf("5");
                ettwo=String.valueOf("2");
                etthree=String.valueOf("6");
                etfour=String.valueOf("1");
                etfive=String.valueOf("4");
                etsix=String.valueOf("0");
                etseven=String.valueOf("3");
            }
            }
            else if(conmin>166&conmin<359){
                ptone=String.valueOf("1");
                pttwo=String.valueOf("5");
                ptthree=String.valueOf("2");
                ptfour=String.valueOf("4");
                ptfive=String.valueOf("0");
                ptsix=String.valueOf("3");
                ptseven=String.valueOf("6");

               if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>359&addmin<425) {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else if(addmin>425&addmin<478)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>478&addmin<617)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else  if(addmin>617&addmin<720)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else{

                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            }
            else if(conmin>359&conmin<425) {
                ptone=String.valueOf("4");
                pttwo=String.valueOf("1");
                ptthree=String.valueOf("5");
                ptfour=String.valueOf("0");
                ptfive=String.valueOf("3");
                ptsix=String.valueOf("6");
                ptseven=String.valueOf("2");
                if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>359&addmin<425) {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else if(addmin>425&addmin<478)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>478&addmin<617)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else  if(addmin>617&addmin<720)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else{

                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            }

            else if(conmin>425&conmin<478)  {
                ptone=String.valueOf("0");
                pttwo=String.valueOf("4");
                ptthree=String.valueOf("1");
                ptfour=String.valueOf("3");
                ptfive=String.valueOf("6");
                ptsix=String.valueOf("2");
                ptseven=String.valueOf("5");
                if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>359&addmin<425) {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else if(addmin>425&addmin<478)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>478&addmin<617)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else  if(addmin>617&addmin<720)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else{

                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            }
            else if(conmin>478&conmin<617)  {
                ptone=String.valueOf("3");
                pttwo=String.valueOf("0");
                ptthree=String.valueOf("4");
                ptfour=String.valueOf("6");
                ptfive=String.valueOf("2");
                ptsix=String.valueOf("5");
                ptseven=String.valueOf("1");
                if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>359&addmin<425) {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else if(addmin>425&addmin<478)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>478&addmin<617)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else  if(addmin>617&addmin<720)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else{

                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            }
            else    {
                ptone=String.valueOf("0");
                pttwo=String.valueOf("3");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("2");
                ptfive=String.valueOf("5");
                ptsix=String.valueOf("1");
                ptseven=String.valueOf("4");
                if(addmin>126&addmin<166)
                {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            else if(addmin>166&addmin<359){
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>359&addmin<425) {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }

                else if(addmin>425&addmin<478)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else if(addmin>478&addmin<617)  {
                    etone=String.valueOf("3");
                    ettwo=String.valueOf("0");
                    etthree=String.valueOf("4");
                    etfour=String.valueOf("6");
                    etfive=String.valueOf("2");
                    etsix=String.valueOf("5");
                    etseven=String.valueOf("1");
                }
                else  if(addmin>617&addmin<720)  {
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else{

                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }
            }
        }

        else if(valfour=="Friday"){
            if (conmin<139){
                ptone=String.valueOf("3");
                pttwo=String.valueOf("0");
                ptthree=String.valueOf("4");
                ptfour=String.valueOf("6");
                ptfive=String.valueOf("2");
                ptsix=String.valueOf("5");
                ptseven=String.valueOf("1");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }

            }

            else if(conmin>139&conmin<238)
            {
                ptone=String.valueOf("6");
                pttwo=String.valueOf("3");
                ptthree=String.valueOf("0");
                ptfour=String.valueOf("2");
                ptfive=String.valueOf("5");
                ptsix=String.valueOf("1");
                ptseven=String.valueOf("4");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
            }
            else if(conmin>238&conmin<364){
                ptone=String.valueOf("2");
                pttwo=String.valueOf("6");
                ptthree=String.valueOf("3");
                ptfour=String.valueOf("5");
                ptfive=String.valueOf("1");
                ptsix=String.valueOf("4");
                ptseven=String.valueOf("0");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
            }
            else if(conmin>364&conmin<404) {
                ptone=String.valueOf("5");
                pttwo=String.valueOf("2");
                ptthree=String.valueOf("6");
                ptfour=String.valueOf("1");
                ptfive=String.valueOf("4");
                ptsix=String.valueOf("0");
                ptseven=String.valueOf("3");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
            }

            else if(conmin>404&conmin<597)  {
                ptone=String.valueOf("1");
                pttwo=String.valueOf("5");
                ptthree=String.valueOf("2");
                ptfour=String.valueOf("4");
                ptfive=String.valueOf("0");
                ptsix=String.valueOf("3");
                ptseven=String.valueOf("6");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
            }
            else if(conmin>597&conmin<663)  {
                ptone=String.valueOf("4");
                pttwo=String.valueOf("1");
                ptthree=String.valueOf("5");
                ptfour=String.valueOf("0");
                ptfive=String.valueOf("3");
                ptsix=String.valueOf("6");
                ptseven=String.valueOf("2");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
            }
            else    {
                ptone=String.valueOf("0");
                pttwo=String.valueOf("4");
                ptthree=String.valueOf("1");
                ptfour=String.valueOf("3");
                ptfive=String.valueOf("6");
                ptsix=String.valueOf("2");
                ptseven=String.valueOf("5");
                if(addmin>139&addmin<238)
                {
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
                else if(addmin>238&addmin<364){
                    etone=String.valueOf("2");
                    ettwo=String.valueOf("6");
                    etthree=String.valueOf("3");
                    etfour=String.valueOf("5");
                    etfive=String.valueOf("1");
                    etsix=String.valueOf("4");
                    etseven=String.valueOf("0");
                }
                else if(addmin>364&addmin<404) {
                    etone=String.valueOf("5");
                    ettwo=String.valueOf("2");
                    etthree=String.valueOf("6");
                    etfour=String.valueOf("1");
                    etfive=String.valueOf("4");
                    etsix=String.valueOf("0");
                    etseven=String.valueOf("3");
                }

                else if(addmin>404&addmin<597)  {
                    etone=String.valueOf("1");
                    ettwo=String.valueOf("5");
                    etthree=String.valueOf("2");
                    etfour=String.valueOf("4");
                    etfive=String.valueOf("0");
                    etsix=String.valueOf("3");
                    etseven=String.valueOf("6");
                }
                else if(addmin>597&addmin<663)  {
                    etone=String.valueOf("4");
                    ettwo=String.valueOf("1");
                    etthree=String.valueOf("5");
                    etfour=String.valueOf("0");
                    etfive=String.valueOf("3");
                    etsix=String.valueOf("6");
                    etseven=String.valueOf("2");
                }
                else    if(addmin>663&addmin<720){
                    etone=String.valueOf("0");
                    ettwo=String.valueOf("4");
                    etthree=String.valueOf("1");
                    etfour=String.valueOf("3");
                    etfive=String.valueOf("6");
                    etsix=String.valueOf("2");
                    etseven=String.valueOf("5");
                }
                else{
                    etone=String.valueOf("6");
                    ettwo=String.valueOf("3");
                    etthree=String.valueOf("0");
                    etfour=String.valueOf("2");
                    etfive=String.valueOf("5");
                    etsix=String.valueOf("1");
                    etseven=String.valueOf("4");
                }
            }
        }

        else {
            if (conmin < 66) {
                ptone = String.valueOf("4");
                pttwo = String.valueOf("1");
                ptthree = String.valueOf("5");
                ptfour = String.valueOf("0");
                ptfive = String.valueOf("3");
                ptsix = String.valueOf("6");
                ptseven = String.valueOf("2");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }


            } else if (conmin > 66 & conmin < 119) {
                ptone = String.valueOf("0");
                pttwo = String.valueOf("4");
                ptthree = String.valueOf("1");
                ptfour = String.valueOf("3");
                ptfive = String.valueOf("6");
                ptsix = String.valueOf("2");
                ptseven = String.valueOf("5");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
            } else if (conmin > 119 & conmin < 258) {
                ptone = String.valueOf("3");
                pttwo = String.valueOf("0");
                ptthree = String.valueOf("4");
                ptfour = String.valueOf("6");
                ptfive = String.valueOf("2");
                ptsix = String.valueOf("5");
                ptseven = String.valueOf("1");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
            } else if (conmin > 258 & conmin < 357) {
                ptone = String.valueOf("6");
                pttwo = String.valueOf("3");
                ptthree = String.valueOf("0");
                ptfour = String.valueOf("2");
                ptfive = String.valueOf("5");
                ptsix = String.valueOf("1");
                ptseven = String.valueOf("4");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
            } else if (conmin > 357 & conmin < 483) {
                ptone = String.valueOf("2");
                pttwo = String.valueOf("6");
                ptthree = String.valueOf("3");
                ptfour = String.valueOf("5");
                ptfive = String.valueOf("1");
                ptsix = String.valueOf("4");
                ptseven = String.valueOf("0");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
            } else if (conmin > 483 & conmin < 523) {
                ptone = String.valueOf("5");
                pttwo = String.valueOf("2");
                ptthree = String.valueOf("6");
                ptfour = String.valueOf("1");
                ptfive = String.valueOf("4");
                ptsix = String.valueOf("0");
                ptseven = String.valueOf("3");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
            } else {
                ptone = String.valueOf("1");
                pttwo = String.valueOf("5");
                ptthree = String.valueOf("2");
                ptfour = String.valueOf("4");
                ptfive = String.valueOf("0");
                ptsix = String.valueOf("3");
                ptseven = String.valueOf("6");
                if(addmin>66&addmin<119)
                {
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
                else if(addmin>119&addmin<258){
                    etone = String.valueOf("3");
                    ettwo = String.valueOf("0");
                    etthree = String.valueOf("4");
                    etfour = String.valueOf("6");
                    etfive = String.valueOf("2");
                    etsix = String.valueOf("5");
                    etseven = String.valueOf("1");
                }
                else if(addmin>258&addmin<357) {
                    etone = String.valueOf("6");
                    ettwo = String.valueOf("3");
                    etthree = String.valueOf("0");
                    etfour = String.valueOf("2");
                    etfive = String.valueOf("5");
                    etsix = String.valueOf("1");
                    etseven = String.valueOf("4");
                }

                else if(addmin>357&addmin<483)  {
                    etone = String.valueOf("2");
                    ettwo = String.valueOf("6");
                    etthree = String.valueOf("3");
                    etfour = String.valueOf("5");
                    etfive = String.valueOf("1");
                    etsix = String.valueOf("4");
                    etseven = String.valueOf("0");
                }
                else if(addmin>483&addmin<523)  {
                    etone = String.valueOf("5");
                    ettwo = String.valueOf("2");
                    etthree = String.valueOf("6");
                    etfour = String.valueOf("1");
                    etfive = String.valueOf("4");
                    etsix = String.valueOf("0");
                    etseven = String.valueOf("3");
                }
                else    if(addmin>523&addmin<720){
                    etone = String.valueOf("1");
                    ettwo = String.valueOf("5");
                    etthree = String.valueOf("2");
                    etfour = String.valueOf("4");
                    etfive = String.valueOf("0");
                    etsix = String.valueOf("3");
                    etseven = String.valueOf("6");
                }
                else{
                    etone = String.valueOf("0");
                    ettwo = String.valueOf("4");
                    etthree = String.valueOf("1");
                    etfour = String.valueOf("3");
                    etfive = String.valueOf("6");
                    etsix = String.valueOf("2");
                    etseven = String.valueOf("5");
                }
            }
        }
}}
