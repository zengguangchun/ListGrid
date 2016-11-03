package lvgv.bawei.com.listgrid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;

import lvgv.bawei.com.adapter.GV_Adapter;
import lvgv.bawei.com.adapter.LV_Adapter;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        //初始化控件
        findByID();
        //设置设配器
        myAdapter();

    }

    private void myAdapter() {
        GV_Adapter gv_adapter = new GV_Adapter(MainActivity.this);
        LV_Adapter lv_adapter = new LV_Adapter(MainActivity.this);
        gv.setAdapter(gv_adapter);
        lv.setAdapter(lv_adapter);
    }

    private void findByID() {
        gv = (GridView)findViewById(R.id.gv);
        lv = (ListView)findViewById(R.id.lv);
    }


}
