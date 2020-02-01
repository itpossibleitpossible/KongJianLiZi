package com.universe_explorer.kongjianlizi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XList extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private int a;
    Handler handler;
    private String[] names = {"50M-Cu-Zn-X","55M-Cu-Zn-X", "60M-Cu-Zn-X", "65M-Cu-Zn-X", "70M-Cu-Zn-X", "75M-Cu-Zn-X", "80M-Cu-Zn-X", "85M-Cu-Zn-X" };
    List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();

    ListView list;
    SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xlist);

        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("names", names[i]);
            listItems.add(listItem);
//            produceList();
            simpleAdapter = new SimpleAdapter(this, listItems, R.layout.simple_item, new String[]{"names"}, new int[]{R.id.name});
            list = (ListView) findViewById(R.id.mylist);
            list.setAdapter(simpleAdapter);
        }

//        produceList();
        list.setOnItemClickListener(this);

    }


   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (id == 0)
        {
            Intent intent = new Intent(XList.this, X50para.class);
            startActivity(intent);
        }

        if (id == 1)
        {
            Intent intent = new Intent(XList.this, X55para.class);
            startActivity(intent);
        }

        if (id == 2)
        {
            Intent intent = new Intent(XList.this, X60para.class);
            startActivity(intent);
        }

        if (id == 3)
        {
            Intent intent = new Intent(XList.this, X65para.class);
            startActivity(intent);
        }

        if (id == 4)
        {
            Intent intent = new Intent(XList.this, X70para.class);
            startActivity(intent);
        }

        if (id == 5)
        {
            Intent intent = new Intent(XList.this, X75para.class);
            startActivity(intent);
        }

        if (id == 6)
        {
            Intent intent = new Intent(XList.this, X80para.class);
            startActivity(intent);
        }

        if (id == 7)
        {
            Intent intent = new Intent(XList.this, X85para.class);
            startActivity(intent);
        }

    }

    @Override
    public void finish() {
        super.finish();
        Toast.makeText(XList.this,"点击屏幕任意位置即可重新开启巡天之旅",Toast.LENGTH_LONG).show();
    }
}



