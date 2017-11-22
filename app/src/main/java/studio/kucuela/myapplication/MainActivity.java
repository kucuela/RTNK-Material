package studio.kucuela.myapplication;


import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;




public class MainActivity extends AppCompatActivity {

    TextView textView100;
    TextView textView200;
    TextView textView300;
    TextView textView400;
    TextView textView500;
    TextView textView600;
    TextView textView700;
    TextView textView800;
    TextView textView900;
    TextView textView1000;
    private TextView info;
    private EditText input;



    private com.github.clans.fab.FloatingActionButton fab1;
    private com.github.clans.fab.FloatingActionButton fab2;
    private com.github.clans.fab.FloatingActionButton fab3;
    private com.github.clans.fab.FloatingActionButton fab4;
    private com.github.clans.fab.FloatingActionButton fab5;





    Spinner sp;
    ArrayAdapter<String> adapter;
    String numbers[] = { "[nema unosa]","Bojana", "Bojana iz Slankamena", "Bojana iz Krčedina", "Bojana Čorbašilov (Kazahstan)", "Bojana Donosilac Kiše", "Divna Maletin", "Bojana predstavnik Vodenih Ljudi", "Karumba",
            "Tengba", "Pemba", "Minahonda", "Jajanda", "Svetozar", "Jorganče", "Sreten iz kupatila", "Gospodin sa bubama", "Advokat Krtinić", "Odvjetnik Krtilić","Gospodin Rtnić", "Kazuhiro", "Šojićiro",
            "Hirokazu", "Mario Japanac", "General Rivotril", "General Rivotrilko", "Generalko Rivotrilko", "Generalčić Rivotrilčić", "Dona Esperansa","Desanka sa ogledalima","Magacionerka Rajka"};

    Spinner sp1;
    ArrayAdapter<String> adapter1;
    String numbers1[] = { "[nema unosa]","Savino Selo", "Kucura", "Vrbas", "Despotovo", "Beograd", "Novi Sad","Prolaz","Kuća deteta-ptice","Lažni prolaz","U autobusu","U vozu","Na biciklu",
            "U kolima","Negde u prirodi", "Odbijam da Vam dam lokaciju"};

    Spinner sp2;
    ArrayAdapter<String> adapter2;
    String numbers2[] = { "[nema unosa]","Kučuela domaća tip A", "Kučuela domaća tip B (Šizela)", "Kučuela standardna", 
            "Zorka Crnogorka", "Kučuela ostalo", "Ekser", "Spid", "Muskatni oraščić", "Alkohol", "Ostalo"};

    Spinner sp6;
    ArrayAdapter<String> adapter6;
    String numbers6[] = { "[nema unosa]","1","1.25", "1.5","1.75", "2","2.25", "2.5","2.75", "3","3.25", "3.5","3.75", "4","4.25", "4.5","4.75", "5"};

    Spinner sp7;
    ArrayAdapter<String> adapter7;
    String numbers7[] = {"[nema unosa]", "1", "2", "3", "4", "Probilo!"};

    Spinner sp8;
    ArrayAdapter<String> adapter8;
    String numbers8[] = {"[nema unosa]", "More", "Oblaci", "Olujno more", "Olujni oblaci"};

    Spinner sp9;
    ArrayAdapter<String> adapter9;
    String numbers9[] = {"[nema unosa]", "Plava", "Bela", "Žuta", "Narandžasta", "Još uvek je dan"};

    Spinner sp10;
    ArrayAdapter<String> adapter10;
    String numbers10[] = {"[nema unosa]", "Odozgo", "Odozdo", "Od napred", "Od nazad", "S leva", "S desna","Centralno"};

    Spinner sp10a;
    ArrayAdapter<String> adapter10a;
    String numbers10a[] = {"[nema unosa]", "Odozgo", "Odozdo", "Od napred", "Od nazad", "S leva", "S desna","Centralno"};

    Spinner sp10b;
    ArrayAdapter<String> adapter10b;
    String numbers10b[] = {"[nema unosa]", "Zalepilo me", "Ošajdarilo me", "Zakucalo me", "Išaketalo me", "Istabanalo me", "Urokalo me", "Pritislo me", "Izlopatalo me",};


    Spinner sp11;
    ArrayAdapter<String> adapter11;
    String numbers11[] = {"[nema unosa]", "Visoka", "Standardna", "Niska", "Seoski konstantna"};

    Spinner sp12;
    ArrayAdapter<String> adapter12;
    String numbers12[] = { "[nema unosa]","50", "100", "150", "200", "250", "300", "350", "400", "450","500"};

    Spinner sp13;
    ArrayAdapter<String> adapter13;
    String numbers13[] = {"[nema unosa]", "10", "15", "20", "25", "30", "35", "40"};

    Spinner sp14;
    ArrayAdapter<String> adapter14;
    String numbers14[] = {"[nema unosa]", "Na 9 sati", "Na 10 sati i 10 minuta","Na 11 sati i 5 minuta","Na 12 sati","Na 12 sati i 5 minuta","Na 12 sati i 15 minuta","Nogice u X"};


    Spinner sp16;
    ArrayAdapter<String> adapter16;
    String numbers16[] = {"Nemam ništa da dodam!"};

    Spinner sp17;
    ArrayAdapter<String> adapter17;
    String numbers17[] = {"[nema unosa]","Konveksno (savijeno)", "Konkavno (kontra-savijeno)"};

    Spinner sp18;
    ArrayAdapter<String> adapter18;
    String numbers18[] = {"[nema unosa]","Dobro","Loše","Neutralno","Depresivno","Besno","Euforično","Histerično","Melanholično","Napaljeno","Gladno","Žedno","Umorno","Sveže","Bajato","Jedva gledam na oči",
    "Jedva stojim na nogama","Imao/la sam i boljih dana","Ne mogu da se sastavim","Ne znam di bijem","Sad sam ustao/la","Spičim ovu pa u krevet","Spičim ovu pa na posao","Spičim ovu pa na kurs",
    "Spičim ovu pa idem malo napolje"};












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        info = (TextView) findViewById(R.id.textViewZlodi);
        input = (EditText)findViewById(R.id.editText11);

        //MediaPlayer buttonSound1 = MediaPlayer.create(MainActivity.this, R.raw.prdavac);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        fab1 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab2);
        fab3 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab3);
        fab4 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab4);
        fab5 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab5);

        fab1.setOnClickListener(clickListener);
        fab2.setOnClickListener(clickListener);
        fab3.setOnClickListener(clickListener);
        fab4.setOnClickListener(clickListener);
        fab5.setOnClickListener(clickListener);



        






        /*Toast.makeText(getBaseContext(), "Dobrodošli na glavni Rtnk test.",
                Toast.LENGTH_SHORT).show();*/

       // final RippleBackground rippleBackground=(RippleBackground)findViewById(R.id.content1a);
        //FloatingActionButton imageView=(FloatingActionButton)findViewById(R.id.btn_buy);
        //rippleBackground.startRippleAnimation();

        // Enables ActionBar app icon to behave as action to toggle NavigationDrawer
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(false);
            //actionBar.setHomeAsUpIndicator(R.drawable.ic_drawer);
            actionBar.setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayShowTitleEnabled( true );
            getSupportActionBar().setTitle("RTNK");
            actionBar.show();
        }





        //




        //izlistati sve textview objekte

        textView100 = (TextView)findViewById(R.id.textView100);
        textView200 = (TextView)findViewById(R.id.textView200);
        textView300 = (TextView)findViewById(R.id.textview300);
        textView400 = (TextView)findViewById(R.id.textview400);
        textView500 = (TextView)findViewById(R.id.textview500);
        textView600 = (TextView)findViewById(R.id.textview600);
        textView700 = (TextView)findViewById(R.id.textview700);
        textView800 = (TextView)findViewById(R.id.textview800);
        textView900 = (TextView)findViewById(R.id.textview900);
        textView1000 = (TextView)findViewById(R.id.textview1000);

        sp = (Spinner) findViewById(R.id.spinner3);
        sp1=(Spinner)findViewById(R.id.spinner4) ;
        sp2=(Spinner)findViewById(R.id.spinner5) ;
        sp6=(Spinner)findViewById(R.id.spinner6) ;
        sp7=(Spinner)findViewById(R.id.spinner7) ;
        sp8=(Spinner)findViewById(R.id.spinner8) ;
        sp9=(Spinner)findViewById(R.id.spinner9) ;
        sp10=(Spinner)findViewById(R.id.spinner10) ;
        sp10a=(Spinner)findViewById(R.id.spinner10a);
        sp11=(Spinner)findViewById(R.id.spinner11) ;
        sp12=(Spinner)findViewById(R.id.spinner12) ;
        sp13=(Spinner)findViewById(R.id.spinner13) ;
        sp14=(Spinner)findViewById(R.id.spinner14) ;

        sp16=(Spinner)findViewById(R.id.spinner16) ;
        sp17=(Spinner)findViewById(R.id.spinner17) ;
        sp10b=(Spinner)findViewById(R.id.spinner10b) ;
        sp18=(Spinner)findViewById(R.id.spinner18) ;








        // IME
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                        //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });


        //LOKACIJA
        adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers1);
        sp1.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //OPIJAT
        adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers2);
        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTN
        adapter6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers6);
        sp6.setAdapter(adapter6);
        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //KACA
        adapter7 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers7);
        sp7.setAdapter(adapter7);
        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //MORE
        adapter8 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers8);
        sp8.setAdapter(adapter8);
        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //SVETLA
        adapter9 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers9);
        sp9.setAdapter(adapter9);
        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARAC
        adapter10 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10);
        sp10.setAdapter(adapter10);
        sp10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //UDARACa
        adapter10a = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10a);
        sp10a.setAdapter(adapter10a);
        sp10a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)

            {
                if (arg2==0){

            }
            else {




            }}
            public void onNothingSelected(AdapterView<?> arg0)
            {

            }
        });

        //UDARACa
        adapter10b = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers10b);
        sp10b.setAdapter(adapter10b);
        sp10b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //AKTIV
        adapter11 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers11);
        sp11.setAdapter(adapter11);
        sp11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //ZAKRIVLJENOST
        adapter17 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers17);
        sp17.setAdapter(adapter17);
        sp17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTNK
        adapter12 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers12);
        sp12.setAdapter(adapter12);
        sp12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //RTNKACA
        adapter13 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers13);
        sp13.setAdapter(adapter13);
        sp13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });

        //ROZE
        adapter14 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers14);
        sp14.setAdapter(adapter14);
        sp14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });



        //STAIMATEDADODATe
        adapter16 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers16);
        sp16.setAdapter(adapter16);
        sp16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });


        ////STANJE DUHA
        adapter18 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, numbers18);
        sp18.setAdapter(adapter18);
        sp18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3)
            {
                //Toast.makeText(getBaseContext(), sp.getSelectedItem().toString(),
                //Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {
                // TODO Auto-generated method stub
            }
        });






    }



    //FAB DUGMAD NOVA IMPLEMENTACIJA

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fab1: //PODELI REZULTATE

                    Intent sendIntent = new Intent();
                    String date = String.valueOf(android.text.format.DateFormat.format("EE,dd.MMMM, HH:mm", new java.util.Date()));
                    String inputText = input.getText().toString();
                    info.setText(inputText);
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "REZULTATI TESTA"+"\n\nVREME: "+date+"\nKORISNIK: " + sp.getSelectedItem().toString()+"\nLOKACIJA: "
                            +sp1.getSelectedItem().toString()+"\nOPIJAT: "+sp2.getSelectedItem().toString()
                            +"\nSTANJE DUHA: "+sp18.getSelectedItem().toString()+
                            "\n\nRTN: "+sp6.getSelectedItem().toString()+"\nKACA: "+sp7.getSelectedItem().toString()+"\nMORE/OBLACI: "
                            +sp8.getSelectedItem().toString()+"\nSVETLA: "+sp9.getSelectedItem().toString()+"\nUDARAC: "+sp10b.getSelectedItem().toString()+"\n"+sp10.getSelectedItem().toString()+"/"+sp10a.getSelectedItem().toString()
                            +"\nAKTIVNOST: "+sp11.getSelectedItem().toString()+"\nZAKRIVLJENOST: "+sp17.getSelectedItem().toString()+"\n\nRTN KRTINIĆ: "+sp12.getSelectedItem().toString()+"\nKACA KRTINIĆ: "
                            +sp13.getSelectedItem().toString()+"\nNOGICE: "+sp14.getSelectedItem().toString()+"\nŠTA IMATE DA DODATE: "+"\n"+sp16.getSelectedItem().toString()+"\n\nI NA KRAJU SVEGA — UVOD: "+"\n"+input.getText());
                    sendIntent.setType("text/plain");

                    startActivity(sendIntent);



                    break;
                case R.id.fab2:

                    final MediaPlayer mp12 = MediaPlayer.create(MainActivity.this, R.raw.prdavac);
                    mp12.start();



                    break;
                case R.id.fab3:

                    final MediaPlayer mp1 = MediaPlayer.create(MainActivity.this, R.raw.standard);
                    mp1.start();


                    break;
                case R.id.fab4:

                    final MediaPlayer mp2 = MediaPlayer.create(MainActivity.this, R.raw.domacinski);
                    mp2.start();






                    break;

                case R.id.fab5:

                    Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                    whatsappIntent.setType("text/plain");
                    whatsappIntent.setPackage("com.whatsapp");
                    whatsappIntent.putExtra(Intent.EXTRA_TEXT, "*CING CING*");
                    startActivity(whatsappIntent);






                    break;


            }
        }
    };












    // Method(s) that manage Toolbar.

    // onCreateOptionsMenu method initialize the contents of the Activity's Toolbar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    // Overrides setTitle method to support older api levels
    @Override
    public void setTitle(CharSequence title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_create) {
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
            finish();






            return true;
        }

        return super.onOptionsItemSelected(item);
    }









}
//KRAJ