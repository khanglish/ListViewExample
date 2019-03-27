package khangit.pttbdd.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txtMsg;
    ListView myListView;

    String[] items = {"D0","D01","D012","D013","D014","D015","D016","D017","D018","D019","D0110"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.my_list);
        ArrayAdapter<String> aa = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        myListView.setAdapter(aa);
        txtMsg = findViewById(R.id.txtMsg);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text = "Position: " + position + "\nData: " + items[position];
                txtMsg.setText(text);
            }
        });
    }//onCreate


}
