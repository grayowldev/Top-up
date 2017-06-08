package stradatech.com.topup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    TopUpFeatures features = new TopUpFeatures();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.check_balance_button_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toNetwork = new Intent(HomeActivity.this,Network.class);
                toNetwork.putExtra("prevAct", "Home");
                startActivity(toNetwork);
            }
        });

        findViewById(R.id.add_bal_btn_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toNetwork = new Intent(HomeActivity.this,Network.class);
                toNetwork.putExtra("function", "Add Bal");
                startActivity(toNetwork);
            }
        });
    }
}
