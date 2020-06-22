package pucp.telecom.moviles.lab3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    MediaRecorder recorder;

    public void iniciarGrabacion(View view) throws IOException
    {
        SimpleDateFormat timeStampFormat = new SimpleDateFormat(
                "yyyy-MM-dd-HH.mm.ss");
        String fileName = "audio_" + timeStampFormat.format(new Date())
                + ".mp4";
        recorder = new MediaRecorder();
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        recorder.setOutputFile("/sdcard/"+fileName);
        recorder.prepare();
        recorder.start();
    }

    public void detenerGrabacion(View view) {
        recorder.stop();
        recorder.release();
    }


}