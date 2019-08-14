package dot.ranjith.phpandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt;
    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        bt=(Button)findViewById(R.id.bt);

/*        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = t1.getText().toString();
                String password = t2.getText().toString();
                String type = "login";             //********* here backeorker can't able to carete object and pass the valuse
                Backgroundworker backgroundworker = new Backgroundworker(this);  //**** so use the onclick in xml and then use it
                backgroundworker.execute(type,username,password);
            }
        });   */
    }// hey guys this is my first commit

    public void Onlogin(View view){
             String username = t1.getText().toString();
             String password = t2.getText().toString();
             String type = "login";

             Backgroundworker backgroundworker = new Backgroundworker(this);
             backgroundworker.execute(type,username,password);
    }
}


