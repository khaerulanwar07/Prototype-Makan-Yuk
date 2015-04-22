package com.example.debbyrahardjo.prototype;

/**
 * Created by debbyrahardjo on 22/04/2015.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//[Activity(Theme = "@android:style/Theme.Dialog")]
public class popupDialog extends Activity{

    Button mapsBtn, detailBtn;

    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.popup_dialog);

        mapsBtn = (Button) findViewById(R.id.mapsButton);
        detailBtn = (Button) findViewById(R.id.detailButton);

        addListenerOnMapsButton();
    }

    public void addListenerOnMapsButton(){
        final Context context = this;
        mapsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(context,maps.class);
                startActivity(in);
            }
        });
    }

}
