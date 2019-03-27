package khangit.pttbdd.listviewexample;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView txtMsg;

    String[] items = {"D0","D01","D012","D013","D014","D015","D016","D017","D018","D019","D0110"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items));
        txtMsg = findViewById(R.id.txtMsg);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text = " Position: " + position + " " + items[position];
        txtMsg.setText(text);
    }

    
}
