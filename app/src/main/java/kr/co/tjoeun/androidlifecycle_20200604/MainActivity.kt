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

        var name1 = "조경진"
        var name2 = "아이유"

        name1 = name2

        Log.d("이름", name1)


        goToOtherBtn.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "onPause 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "onDestroy 실행")
    }

}
