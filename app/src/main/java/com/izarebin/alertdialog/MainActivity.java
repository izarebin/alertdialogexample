package com.izarebin.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog);

        Button button = (Button) findViewById(R.id.btndialog);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

                // ایجاد عنوان برای دیالوگ
                alertDialogBuilder.setTitle("عنوان دیالوگ");

                // ایجاد پیام دیالوگ
                alertDialogBuilder
                        .setMessage("آیا برای خروج از برنامه اطمینان دارید؟")
                        .setCancelable(false)
                        .setPositiveButton("بله",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // درصورتی که برروی دکمه بله زده شود از برنامه خارج خواهد شد
                                // بستن اکتیویتی
                                MainActivity.this.finish();
                            }
                        })
                        .setNegativeButton("خیر",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // درصورتی که برروی دکمه خیر زده شود دیالوگ بسته می شود
                                // دیالوگ باکس بسته خواهد شد
                                dialog.cancel();
                            }
                        });

                // ایجاد دیالوگ
                AlertDialog alertDialog = alertDialogBuilder.create();

                // نمایش دیالوگ
                alertDialog.show();
            }
        });
    }
}
