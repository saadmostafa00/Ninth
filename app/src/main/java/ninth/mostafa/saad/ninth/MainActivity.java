package ninth.mostafa.saad.ninth;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buStart(View view) {
        Intent i =new Intent(MainActivity.this,Main2Activity.class);
        startActivityForResult(i,77);
    }
    public void onActivityResult(int requestCode ,int resultCode ,Intent data){
        if (requestCode==77 &&resultCode==RESULT_OK ){
String stg1 =data.getExtras().getString("txt_value");
            Toast.makeText(getApplicationContext(), stg1, Toast.LENGTH_LONG).show();
        }

    }
}
