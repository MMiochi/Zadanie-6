package com.example.formularz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private EditText Password2;
    private TextView EditMessage;
    private Button Confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Password2 = findViewById(R.id.Password2);
        EditMessage = findViewById(R.id.Author);
        Confirm = findViewById(R.id.Confirm);

        Confirm.setOnClickListener(view -> confirm());
    }

    private void confirm() {
        if (!Email.getText().toString().contains("@")) {
            EditMessage.setText("Nieprawidłowy adres e-mail");
        } else if (!Password.getText().toString().equals(Password2.getText().toString())) {
            EditMessage.setText("Hasła się różnią");
        } else {
            EditMessage.setText("Witaj " + Email.getText().toString());
        }
    }
}