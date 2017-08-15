package sevenieslab.interviewgo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


public class Interview extends AppCompatActivity {
    int data=0;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // data=getIntent().getExtras().getInt("vag");
        Toolbar tool = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tool);
       // getSupportActionBar().setTitle("hiii");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Bundle extras = getIntent().getExtras();
        if(extras != null)
            data = extras.getInt("value");

        if (data==1)
        {
            Fragment frag=new Interview_frag_pos_0();
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction transaction=manager.beginTransaction();
            transaction.add(R.id.cont,frag);
            transaction.commit();
        }
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


    @Override
    public boolean onSupportNavigateUp() {
       super.onBackPressed();
        return true;
    }

}





