package com.example.iotapptest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.json.JSONException;
import org.apache.commons.json.JSONObject;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import com.helper.DbHelper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//setContentView(R.layout.table_view);
		//setContentView(R.layout.listlay);
		setContentView(R.layout.runtimelayout);
		//TableLayout tLayout = (TableLayout) findViewById(R.id.table);
		LinearLayout tLayout = (LinearLayout) findViewById(R.id.runtimelayout);
		
		Button button = (Button) findViewById(R.id.OrderButton);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bigbasket.com/choose-city/?next=/"));
				startActivity(browserIntent);
			}
		});
		
		new AppTest().doApp(this,tLayout);	
		
	}
	
}