package com.abhinav.mybalajinagar;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;

@TargetApi(Build.VERSION_CODES.N)
public class MyTileService extends TileService {

    @Override
    public void onClick() {
        super.onClick();
        startActivity(new Intent(this,Helplines.class));
    }


}
