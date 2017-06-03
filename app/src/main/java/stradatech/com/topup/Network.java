package stradatech.com.topup;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Network extends AppCompatActivity {
    TopUpFeatures features = new TopUpFeatures();
    Context context;
    String networkCode;
    Button airtel,tmobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);

        //Create buttons and Check for function: check balance or add balance
        //check previous Activity
        //use function network code


        //Create buttons
        tmobile = (Button) findViewById(R.id.tmo_btn_netAct);
        tmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get function
                //
            }
        });










/**

        findViewById(R.id.airtel_btn_netAct).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = getApplication();
                Intent intent = getIntent();
                String prevAct = intent.getStringExtra("prevAct");
                navToAct(prevAct);
                //*133#
            }
        });


**/
    }
/**
    public void navToAct(String prev,String networkCode){
        if (prev.equals("Home")){
            // Changes activity and adds check balance code
            Intent intent = new Intent(context, HomeActivity.class);
            intent.putExtra("code", networkCode);
            startActivity(intent);
        }
    }
 /**
    public void setCode(String code){
        networkCode = code;
    }

    public  void getCode()**/
}
