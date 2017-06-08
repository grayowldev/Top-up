package stradatech.com.topup;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Network extends AppCompatActivity {
    TopUpFeatures features = new TopUpFeatures();
    Context context;
    String networkCode;
    Button airtel, tmobile;
    String encodedStar = Uri.encode("*");
    String encodedHash = Uri.encode("#");
    String function;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);
        Intent getFunction = getIntent();
        function = getFunction.getStringExtra("function");

        //Create buttons and Check for function: check balance or add balance
        //check previous Activity
        //use function network code


        //Create buttons
        tmobile = (Button) findViewById(R.id.tmo_btn_netAct);
        tmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(Network.this, HomeActivity.class));
                //checkBalance("Tmobile");

                if (function.equals("Add Bal")){
                    addBalance("Tmobile");
                }


            }
        });


/**

 findViewById(R.id.airtel_btn_netAct).setOnClickListener(new View.OnClickListener() {
@Override public void onClick(View view) {
context = getApplication();
Intent intent = getIntent();
String prevAct = intent.getStringExtra("prevAct");
navToAct(prevAct);
//*133#
}
});


 **/
    }


    public void checkBalance(String network) {
        String balCode;
        Uri checkBal;
        switch (network) {
            case "Tmobile":
                balCode = "tel:" + encodedHash + "686" + encodedHash;
                break;
            default:
                balCode = null;
                break;
        }

        if (!balCode.equals(null)) {
            checkBal = Uri.parse(balCode);
            Intent checkbalIntent = new Intent(Intent.ACTION_CALL, checkBal);

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            //Activity activity = (Activity) context;
           // Intent a = new Intent(activity, HomeActivity.class);
            //startActivity(a);
            toHome();
            startActivity(checkbalIntent);
        }

    }

    public void addBalance(String network){
        String addBalCode;
        Uri addBal;
        switch (network) {
            case "Tmobile":
                addBalCode = "tel:" + encodedHash + "225" + encodedHash;
                break;
            default:
                addBalCode = null;
                break;
        }

        if (!addBalCode.equals(null)) {
            addBal = Uri.parse(addBalCode);
            Intent addBalIntent = new Intent(Intent.ACTION_CALL, addBal);

            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            //Activity activity = (Activity) context;
            // Intent a = new Intent(activity, HomeActivity.class);
            //startActivity(a);
            toManualCodeIn();
            startActivity(addBalIntent);
        }
    }

    public void toManualCodeIn(){
        Intent intent = new Intent(getApplicationContext(),ManualCodeInActivity.class);
        startActivity(intent);
    }

    public void toHome(){
        Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
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
