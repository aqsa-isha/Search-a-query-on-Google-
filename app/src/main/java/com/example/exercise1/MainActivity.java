package com.example.exercise1;
import android.app.SearchManager;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button w_visit, g_it;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        w_visit = (Button) findViewById(R.id.wv);
        g_it = (Button) findViewById(R.id.gi);
        et = (EditText) findViewById(R.id.editText1);
        w_visit.setOnClickListener(new OnClickListener() {
            @Override
        public void onClick(View arg0) {
            String url=et.getText().toString();
            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url)); startActivity(intent);
        }
        });
        g_it.setOnClickListener(new OnClickListener() { @Override
        public void onClick(View arg0) {
            String query=et.getText().toString();
            Intent intent=new Intent(Intent.ACTION_WEB_SEARCH); intent.putExtra(SearchManager.QUERY,query); startActivity(intent);
        }
        });

    }

}
