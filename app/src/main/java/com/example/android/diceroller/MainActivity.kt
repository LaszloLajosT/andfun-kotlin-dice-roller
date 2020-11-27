/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // COMPLETED (02) Use findViewById to get a reference to the button
        // and assign it to an immutable variable called rollButton
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let`s Roll"
        // COMPLETED (03) set the OnClickListener for the button
        rollButton.setOnClickListener {
            // COMPLETED (04) Show a Toast when the OnClickListener is called
            Toast.makeText(this, "You pressed the Button!", Toast.LENGTH_SHORT).show()
        }
    }
}
