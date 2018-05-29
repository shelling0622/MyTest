package lbproject.hcilab.yonsei.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.myBtn);
        myButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void myButtonFunction(View myview){

        Toast.makeText(getApplicationContext(), "yeah", Toast.LENGTH_SHORT).show();

    }

}
