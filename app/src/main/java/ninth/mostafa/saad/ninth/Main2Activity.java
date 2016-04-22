package ninth.mostafa.saad.ninth;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void doIt(View view) {
        EditText txt =(EditText)findViewById(R.id.editText);


        Intent i =new Intent();
        String stg =txt.getText().toString();
        i.putExtra("txt_value",stg);

        setResult(Activity.RESULT_OK,i);
        finish();
    }
}
