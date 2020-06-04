package kr.co.tjoeun.androidlifecycle_20200604

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "onCreate 실행됨")


        goToOtherBtn.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume 실행")
    }

}
