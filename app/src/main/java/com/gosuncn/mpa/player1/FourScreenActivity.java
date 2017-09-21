package com.gosuncn.mpa.player1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.gosuncn.mpa.R;
import com.gosuncn.mpa.databinding.ActivityFourScreenBinding;
import com.gosuncn.mplay.RtspPlayer;

public class FourScreenActivity extends AppCompatActivity {
    private static final String TAG = "FourScreenActivity";
    ActivityFourScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding= (ActivityFourScreenBinding)DataBindingUtil.setContentView(this, R.layout.activity_four_screen);

        binding.rpPLayer1.setOnRtspPlayResultListener(new RtspPlayer.OnRtspPlayResultListener() {
            @Override
            public void onResult(int playerHandle, int code,String msg) {
                binding.pbLoad1.setVisibility(View.GONE);
                if(code==1){
                    Toast.makeText(FourScreenActivity.this, "一屏播放成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(FourScreenActivity.this, "一屏播放失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
       binding.rpPLayer2.setOnRtspPlayResultListener(new RtspPlayer.OnRtspPlayResultListener() {
            @Override
            public void onResult(int playerHandle, int code,String msg) {
                binding.pbLoad2.setVisibility(View.GONE);
                if(code==1){
                    Toast.makeText(FourScreenActivity.this, "二屏播放成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(FourScreenActivity.this, "二屏播放失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
       binding.rpPLayer3.setOnRtspPlayResultListener(new RtspPlayer.OnRtspPlayResultListener() {
            @Override
            public void onResult(int playerHandle, int code,String msg) {
                binding.pbLoad3.setVisibility(View.GONE);
                if(code==1){
                    Toast.makeText(FourScreenActivity.this, "三屏播放成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(FourScreenActivity.this, "三屏播放失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.rpPLayer4.setOnRtspPlayResultListener(new RtspPlayer.OnRtspPlayResultListener() {
            @Override
            public void onResult(int playerHandle, int code,String msg) {
                binding.pbLoad4.setVisibility(View.GONE);
                if(code==1){
                    Toast.makeText(FourScreenActivity.this, "四屏播放成功", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(FourScreenActivity.this, "四屏播放失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.rpPLayer1.startPlay("rtsp://172.29.1.164:556/realplay://8f5cf6b17e6d474989c0b8196ca8f146:MAIN:TCP?cnid=1&pnid=0&token=&auth=30&redirect=0&transcode=0&resolution=2&bitrate=100&framerate=10&videotype=2&systemformat=2");
        binding.rpPLayer2.startPlay("rtsp://172.29.1.164:556/realplay://69919b66dd3a4e18bd0681dc9742482d:MAIN:TCP?cnid=1&pnid=0&token=&auth=30&redirect=0&transcode=0&resolution=2&bitrate=100&framerate=10&videotype=2&systemformat=2");
        binding.rpPLayer3.startPlay("rtsp://172.29.1.164:556/realplay://91a47c70915e436fbf50b23f47629092:MAIN:TCP?cnid=1&pnid=0&token=&auth=30&redirect=0&transcode=0&resolution=2&bitrate=100&framerate=10&videotype=2&systemformat=2");
        binding.rpPLayer4.startPlay("rtsp://172.29.1.164:556/realplay://43100dd7e48d45038c9bea7920591d83:MAIN:TCP?cnid=1&pnid=0&token=&auth=30&redirect=0&transcode=0&resolution=2&bitrate=100&framerate=10&videotype=2&systemformat=2");
        //TODO
//        binding.rpPLayer1.startPlay("rtsp://218.204.223.237:554/live/1/66251FC11353191F/e7ooqwcfbqjoo80j.sdp");
//        binding.rpPLayer2.startPlay("rtsp://218.204.223.237:554/live/1/67A7572844E51A64/f68g2mj7wjua3la7.sdp");
//        binding.rpPLayer3.startPlay("rtsp://1:1@192.168.15.65:554/xms/realplay/44011201/8/35?streams=1");
//        binding.rpPLayer4.startPlay("rtsp://218.204.223.237:554/live/1/66251FC11353191F/e7ooqwcfbqjoo80j.sdp");
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
