package com.ashish.kumar.game;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Ashish on 21-06-2017.
 */

public class Multi1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multi_1);
    }
    int chances = 0;
    int flag = 0;
    int flag1 = 10;
    int flag2 = 20;
    int flag3 = 30;
    int flag4 = 40;
    int flag5 = 50;
    int flag6 = 60;
    int flag7 = 70;
    int flag8 = 80;
    int flag9 = 90;



    public void check(int n) {
        if ((this.flag5 == this.flag2 && this.flag2 == this.flag8) || ((this.flag4 == this.flag5 && this.flag5 == this.flag6) || ((this.flag1 == this.flag2 && this.flag2 == this.flag3) || ((this.flag1 == this.flag4 && this.flag4 == this.flag7) || ((this.flag7 == this.flag8 && this.flag8 == this.flag9) || ((this.flag9 == this.flag6 && this.flag6 == this.flag3) || ((this.flag7 == this.flag5 && this.flag5 == this.flag3) || (this.flag1 == this.flag5 && this.flag5 == this.flag9)))))))) {
            TextView tv = (TextView) findViewById(R.id.tv2);
            if (this.chances % 2 == 0) {
                tv.setText("Player 2 has won");
            } else {
                tv.setText("Player 1 has won");
            }
            this.flag++;
        }
    }

    public void display1(View view) {
        if (this.flag == 0) {
            Button b1 = (Button) findViewById(R.id.button1);
            if (this.chances % 2 == 0) {
                b1.setText("X");
                this.flag1 = 1;
            } else {
                b1.setText("O");
                this.flag1 = 0;
            }
            this.chances++;
            b1.setClickable(false);
            check(this.flag1);
        }
    }

    public void display2(View view) {
        if (this.flag == 0) {
            Button b2 = (Button) findViewById(R.id.button2);
            if (this.chances % 2 == 0) {
                b2.setText("X");
                this.flag2 = 1;
            } else {
                this.flag2 = 0;
                b2.setText("O");
            }
            this.chances++;
            b2.setClickable(false);
            check(this.flag2);
        }
    }

    public void display3(View view) {
        if (this.flag == 0) {
            Button b3 = (Button) findViewById(R.id.button3);
            if (this.chances % 2 == 0) {
                this.flag3 = 1;
                b3.setText("X");
            } else {
                this.flag3 = 0;
                b3.setText("O");
            }
            this.chances++;
            b3.setClickable(false);
            check(this.flag3);
        }
    }

    public void display4(View view) {
        if (this.flag == 0) {
            Button b4 = (Button) findViewById(R.id.button4);
            if (this.chances % 2 == 0) {
                this.flag4 = 1;
                b4.setText("X");
            } else {
                this.flag4 = 0;
                b4.setText("O");
            }
            this.chances++;
            b4.setClickable(false);
            check(this.flag4);
        }
    }

    public void display5(View view) {
        if (this.flag == 0) {
            Button b5 = (Button) findViewById(R.id.button5);
            if (this.chances % 2 == 0) {
                this.flag5 = 1;
                b5.setText("X");
            } else {
                this.flag5 = 0;
                b5.setText("O");
            }
            this.chances++;
            b5.setClickable(false);
            check(this.flag5);
        }
    }

    public void display6(View view) {
        if (this.flag == 0) {
            Button b6 = (Button) findViewById(R.id.button6);
            if (this.chances % 2 == 0) {
                this.flag6 = 1;
                b6.setText("X");
            } else {
                this.flag6 = 0;
                b6.setText("O");
            }
            this.chances++;
            b6.setClickable(false);
            check(this.flag6);
        }
    }

    public void display7(View view) {
        if (this.flag == 0) {
            Button b7 = (Button) findViewById(R.id.button7);
            if (this.chances % 2 == 0) {
                this.flag7 = 1;
                b7.setText("X");
            } else {
                this.flag7 = 0;
                b7.setText("O");
            }
            this.chances++;
            b7.setClickable(false);
            check(this.flag7);
        }
    }

    public void display8(View view) {
        if (this.flag == 0) {
            Button b8 = (Button) findViewById(R.id.button8);
            if (this.chances % 2 == 0) {
                this.flag8 = 1;
                b8.setText("X");
            } else {
                this.flag8 = 0;
                b8.setText("O");
            }
            this.chances++;
            b8.setClickable(false);
            check(this.flag8);
        }
    }

    public void display9(View view) {
        if (this.flag == 0) {
            Button b9 = (Button) findViewById(R.id.button9);
            if (this.chances % 2 == 0) {
                this.flag9 = 1;
                b9.setText("X");
            } else {
                this.flag9 = 0;
                b9.setText("O");
            }
            this.chances++;
            b9.setClickable(false);
            check(this.flag9);
        }
    }
}
