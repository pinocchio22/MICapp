package com.example.micapp

// 상태에 따라 버튼을 달리 보여주게 하기 위해 사용 할 것임.

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-07-23
 * @desc
 */

enum class State {
    BEFORE_RECORDING,
    ON_RECORDING,
    AFTER_RECORDING,
    ON_PLAYING
}