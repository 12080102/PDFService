package kevin.crunch.pdfservice;

import android.app.Service;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText u1,u2,u3,u4,u5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u1=(EditText)findViewById(R.id.editText);
        u2=(EditText)findViewById(R.id.editText2);
        u3=(EditText)findViewById(R.id.editText3);
        u4=(EditText)findViewById(R.id.editText4);
        u5=(EditText)findViewById(R.id.editText5);
    }

    public void download(View view){
        Intent intent = new Intent(this,MyService.class);
        String[] url = {u1.getText().toString(),u2.getText().toString(),u3.getText().toString(),u4.getText().toString(),u5.getText().toString()};
        intent.putExtra("url",url);
        startActivity(intent);
        finish();
    }

    public void cancel(View view){
        u1.setText("");
        u2.setText("");
        u3.setText("");
        u4.setText("");
        u5.setText("");
    }
}
