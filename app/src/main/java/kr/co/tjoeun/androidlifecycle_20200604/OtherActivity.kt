package kr.co.tjoeun.androidlifecycle_20200604

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        Log.d("다른화면", "onCreate 실행됨")

        backBtn.setOnClickListener {
            finish()
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("다른화면", "onDestroy 실행")
    }

}
