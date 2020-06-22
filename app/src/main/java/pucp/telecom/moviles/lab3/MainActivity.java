package pucp.telecom.moviles.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

import pucp.telecom.moviles.lab3.Fragments.DialogFragmentEjemplo;
import pucp.telecom.moviles.lab3.Fragments.FragmentoLocal;
import pucp.telecom.moviles.lab3.Fragments.FragmentoRemoto;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guardarLocalBtn(View view){
        FragmentoLocal fragmentoLocal = new FragmentoLocal();
        fragmentoLocal.show(getSupportFragmentManager(),"dialog fragment local");
    }

    public void guardarRemotoBtn(View view){
        FragmentoRemoto fragmentoRemoto = new FragmentoRemoto();
        fragmentoRemoto.show(getSupportFragmentManager(),"dialog fragment remoto");

    }



}