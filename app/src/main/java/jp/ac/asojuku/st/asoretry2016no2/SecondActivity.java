package jp.ac.asojuku.st.asoretry2016no2;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button Sendbtn = (Button) this.findViewById(R.id.S_button);
        Sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Text = (EditText) findViewById(R.id.Text);
                String title = "メモ";
                Resources res = getResources();
                Uri uri = Uri.parse("mailto:" + res.getString(R.string.addres).toString());

                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra(Intent.EXTRA_SUBJECT, title);
                intent.putExtra(Intent.EXTRA_TEXT,Text.getText().toString());
                startActivity(intent);
            }
        });
    }
}
