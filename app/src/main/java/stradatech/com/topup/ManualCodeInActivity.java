package stradatech.com.topup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ManualCodeInActivity extends AppCompatActivity {
    EditText inputBal;
    TextView textView;
    Button doneBtn;
    String addCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_code_in);

        textView = (TextView) findViewById(R.id.textView4);
        inputBal = (EditText) findViewById(R.id.edit_bal_in);
        doneBtn = (Button) findViewById(R.id.done_btn);

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addCode = inputBal.getText().toString();
                textView.setText(addCode);
            }
        });

    }
}
