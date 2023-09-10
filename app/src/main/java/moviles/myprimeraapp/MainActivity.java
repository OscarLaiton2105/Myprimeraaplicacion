package moviles.myprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verifica el nombre de usuario y la contraseña aquí

                // Si la autenticación es exitosa, navega a la ventana 1
                Intent intent = new Intent(MainActivity.this, Window1Activity.class);
                startActivity(intent);
            }
        });

    }
}