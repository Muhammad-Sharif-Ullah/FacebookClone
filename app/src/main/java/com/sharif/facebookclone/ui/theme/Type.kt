package com.sharif.facebookclone.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

//
//val RelewayFont = FontFamily(
////    Font(R.font.raleway_black),
////    Font(R.font.raleway_bold),
////    Font(R.font.raleway_thin),
////    Font(R.font.raleway_semi_bold),
////    Font(R.font.raleway_medium),
////    Font(R.font.raleway_light),
////    Font(R.font.raleway_regular),
//
//)
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h5 =  TextStyle(
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        lineHeight = 23.sp,
        color = PrimaryC1,
    ),
    h6 =  TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight(700),
        lineHeight = 23.sp,
        color = PrimaryC1,
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)