package com.universe_explorer.kongjianlizi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class XData extends AppCompatActivity {
    ImageView show;
    Button convert, empty, back;
    EditText data;
    String s;
    int a;
    int[] b = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90,91,92,93,94,95};

    public int getint()
    {

        s = data.getText().toString();
        if (s.equals(""))
            return 0;
        a = Integer.valueOf(s);
        return  a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xdata);

        show = findViewById(R.id.show);

        convert = findViewById(R.id.convert);
        empty = findViewById(R.id.empty);
        back = findViewById(R.id.back);
        data = findViewById(R.id.data);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setVisibility(View.VISIBLE);
                int i;
                a = getint();

                    if(a==3)
                        show.setImageResource(R.drawable.a3);
                    else if(a==5)
                        show.setImageResource(R.drawable.a5);
                    else if(a==5)
                        show.setImageResource(R.drawable.a5);
                    else if(a==6)
                        show.setImageResource(R.drawable.a6);
                    else if(a==7)
                        show.setImageResource(R.drawable.a7);
                    else if(a==8)
                        show.setImageResource(R.drawable.a8);
                    else if(a==9)
                        show.setImageResource(R.drawable.a9);
                    else if(a==10)
                        show.setImageResource(R.drawable.a10);
                    else if(a==11)
                        show.setImageResource(R.drawable.a11);
                    else if(a==12)
                        show.setImageResource(R.drawable.a12);
                    else if(a==13)
                        show.setImageResource(R.drawable.a13);
                    else if(a==14)
                        show.setImageResource(R.drawable.a14);
                    else if(a==15)
                        show.setImageResource(R.drawable.a15);
                    else if(a==16)
                        show.setImageResource(R.drawable.a16);
                    else if(a==17)
                        show.setImageResource(R.drawable.a17);
                    else if(a==18)
                        show.setImageResource(R.drawable.a18);
                    else if(a==19)
                        show.setImageResource(R.drawable.a19);
                    else if(a==20)
                        show.setImageResource(R.drawable.a20);
                    else if(a==21)
                        show.setImageResource(R.drawable.a21);
                    else if(a==22)
                        show.setImageResource(R.drawable.a22);
                    else if(a==23)
                        show.setImageResource(R.drawable.a23);
                    else if(a==24)
                        show.setImageResource(R.drawable.a24);
                    else if(a==25)
                        show.setImageResource(R.drawable.a25);
                    else if(a==26)
                        show.setImageResource(R.drawable.a26);
                    else if(a==27)
                        show.setImageResource(R.drawable.a27);
                    else if(a==28)
                        show.setImageResource(R.drawable.a28);
                    else if(a==29)
                        show.setImageResource(R.drawable.a29);
                    else if(a==30)
                        show.setImageResource(R.drawable.a30);
                    else if(a==31)
                        show.setImageResource(R.drawable.a31);
                    else if(a==32)
                        show.setImageResource(R.drawable.a32);
                    else if(a==33)
                        show.setImageResource(R.drawable.a33);
                    else if(a==34)
                        show.setImageResource(R.drawable.a34);
                    else if(a==35)
                        show.setImageResource(R.drawable.a35);
                    else if(a==36)
                        show.setImageResource(R.drawable.a36);
                    else if(a==37)
                        show.setImageResource(R.drawable.a37);
                    else if(a==38)
                        show.setImageResource(R.drawable.a38);
                    else if(a==39)
                        show.setImageResource(R.drawable.a39);
                    else if(a==40)
                        show.setImageResource(R.drawable.a40);
                    else if(a==41)
                        show.setImageResource(R.drawable.a41);
                    else if(a==42)
                        show.setImageResource(R.drawable.a42);
                    else if(a==43)
                        show.setImageResource(R.drawable.a43);
                    else if(a==44)
                        show.setImageResource(R.drawable.a44);
                    else if(a==45)
                        show.setImageResource(R.drawable.a45);
                    else if(a==46)
                        show.setImageResource(R.drawable.a5);
                    else if(a==46)
                        show.setImageResource(R.drawable.a46);
                    else if(a==47)
                        show.setImageResource(R.drawable.a47);
                    else if(a==48)
                        show.setImageResource(R.drawable.a48);
                    else if(a==49)
                        show.setImageResource(R.drawable.a49);
                    else if(a==50)
                        show.setImageResource(R.drawable.a50);
                    else if(a==51)
                        show.setImageResource(R.drawable.a51);
                    else if(a==62)
                        show.setImageResource(R.drawable.a62);
                    else if(a==63)
                        show.setImageResource(R.drawable.a63);
                    else if(a==64)
                        show.setImageResource(R.drawable.a64);
                    else if(a==65)
                        show.setImageResource(R.drawable.a65);
                    else if(a==66)
                        show.setImageResource(R.drawable.a66);
                    else if(a==67)
                        show.setImageResource(R.drawable.a67);
                    else if(a==68)
                        show.setImageResource(R.drawable.a68);
                    else if(a==69)
                        show.setImageResource(R.drawable.a69);
                    else if(a==70)
                        show.setImageResource(R.drawable.a70);
                    else if(a==71)
                        show.setImageResource(R.drawable.a71);
                    else if(a==72)
                        show.setImageResource(R.drawable.a72);
                    else if(a==73)
                        show.setImageResource(R.drawable.a73);
                    else if(a==74)
                        show.setImageResource(R.drawable.a74);
                    else if(a==75)
                        show.setImageResource(R.drawable.a75);
                    else if(a==76)
                        show.setImageResource(R.drawable.a76);
                    else if(a==77)
                        show.setImageResource(R.drawable.a77);
                    else if(a==78)
                        show.setImageResource(R.drawable.a78);
                    else if(a==79)
                        show.setImageResource(R.drawable.a79);
                    else if(a==80)
                        show.setImageResource(R.drawable.a80);
                    else if(a==81)
                        show.setImageResource(R.drawable.a81);
                    else if(a==82)
                        show.setImageResource(R.drawable.a82);
                    else if(a==83)
                        show.setImageResource(R.drawable.a83);
                    else if(a==84)
                        show.setImageResource(R.drawable.a84);
                    else if(a==85)
                        show.setImageResource(R.drawable.a85);
                    else if(a==86)
                        show.setImageResource(R.drawable.a86);
                    else if(a==87)
                        show.setImageResource(R.drawable.a87);
                    else if(a==88)
                        show.setImageResource(R.drawable.a88);
                    else if(a==89)
                        show.setImageResource(R.drawable.a89);
                    else if(a==90)
                        show.setImageResource(R.drawable.a90);
                    else if(a==91)
                        show.setImageResource(R.drawable.a91);
                    else if(a==92)
                        show.setImageResource(R.drawable.a92);
                    else if(a==93)
                        show.setImageResource(R.drawable.a93);
                    else if(a==94)
                        show.setImageResource(R.drawable.a94);
                    else
                        Toast.makeText(XData.this,"原子序数范围为4-95，请输入正确的数据",Toast.LENGTH_SHORT).show();

            }
        });

        empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setText("");
                show.setVisibility(View.GONE);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XData.this.finish();
            }
        });

    }
    public void finish() {
        super.finish();
        Toast.makeText(XData.this,"点击屏幕任意位置即可重新开启巡天之旅",Toast.LENGTH_SHORT).show();
    }
}
