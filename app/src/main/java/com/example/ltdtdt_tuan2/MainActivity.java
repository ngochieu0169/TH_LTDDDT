package com.example.ltdtdt_tuan2;


        import android.os.Bundle;
        import android.app.Activity;
        import android.content.Intent;
        import android.view.Menu;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen=(Button)
                findViewById(R.id.button);
        btnOpen.setOnClickListener( new View.OnClickListener(){
            public void onClick(View arg0) {
                doOpenChildActivity();
            }
        });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, ChildActivity.class);
        startActivity(myIntent);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}