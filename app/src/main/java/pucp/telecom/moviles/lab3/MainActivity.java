package pucp.telecom.moviles.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

import pucp.telecom.moviles.lab3.Fragments.DialogFragmentEjemplo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guardarLocalBtn(View view){
        DialogFragmentEjemplo dialogFragmentEjemplo = new DialogFragmentEjemplo();
        dialogFragmentEjemplo.show(getSupportFragmentManager(),"dialog fragment local");
    }

    public void guardarRemotoBtn(View view){
        DialogFragmentEjemplo dialogFragmentEjemplo = new DialogFragmentEjemplo();
        dialogFragmentEjemplo.show(getSupportFragmentManager(),"dialog fragment remoto");

    }

}