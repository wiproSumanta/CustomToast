package org.mopria.customtoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToast extends Toast {
    private Context context;
    private String message;
    
    public CustomToast(Context context, String message) {
        super(context);
        this.context = context;
        this.message = message;
        View view = LayoutInflater.from(context).inflate(R.layout.view_custom_toast, null);
        TextView txtMsg = view.findViewById(R.id.tv_toast_msg);
        txtMsg.setText(message);
        setView(view);
        setDuration(Toast.LENGTH_LONG);
        
    }
}
