package com.universe_explorer.kongjianlizi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int yourChoice;
    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (ImageView)findViewById(R.id.background);

        showDialog();

        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }

    private void showDialog() {
        final String[] items = {"X射线数据手册", "特征X射线谱"};
        yourChoice = 0;
        android.app.AlertDialog.Builder singleChoiceDialog = new android.app.AlertDialog.Builder(MainActivity.this);
        singleChoiceDialog.setTitle("请选择您需要实现的功能");
        //
        //    第二个参数是默认选项，此处设置为0
        singleChoiceDialog.setSingleChoiceItems(items,
                0,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface
                                                dialog, int which) {
                        yourChoice
                                = which;
                    }
                });

        singleChoiceDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (yourChoice != -1) {
                            if (yourChoice==0)
                            {
                                Intent intent = new Intent(MainActivity.this,XData.class);
                                startActivity(intent);
                            }
                            if (yourChoice==1)
                            {

                                Intent intent = new Intent(MainActivity.this,XList.class);
                                startActivity(intent);

                            }
                        }
                    }
                });

        singleChoiceDialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"点击屏幕任意位置即可重新开启巡天之旅",Toast.LENGTH_SHORT).show();
            }
        });
        singleChoiceDialog.setCancelable(false);
        singleChoiceDialog.show();
    }
}
