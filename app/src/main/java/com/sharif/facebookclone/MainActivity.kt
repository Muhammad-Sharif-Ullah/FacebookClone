package com.sharif.facebookclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.sharif.facebookclone.ui.theme.FacebookCloneTheme
import com.sharif.facebookclone.ui.theme.IconButtonBG

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FacebookCloneTheme {
                TransparentSystemStatusBar()
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        HomeHeadSection()
                        TabBarSection()
                    }
                }
            }
        }
    }
    
    @Composable
    fun TransparentSystemStatusBar() {
        // Remember a SystemUiController
        val systemUiController = rememberSystemUiController()
        val useDarkIcons = !isSystemInDarkTheme()

        DisposableEffect(systemUiController, useDarkIcons) {
            // Update all of the system bar colors to be transparent, and use
            // dark icons if we're in light theme
            systemUiController.setSystemBarsColor(
                color = androidx.compose.ui.graphics.Color.Transparent,
                darkIcons = useDarkIcons
            )

            // setStatusBarColor() and setNavigationBarColor() also exist

            onDispose {}
        }
    }
}


//Top Home HeadSection
@Composable
fun HomeHeadSection() {
    Row(
        modifier = Modifier
            .padding(vertical = 5.dp, horizontal = 10.dp)
            .fillMaxWidth()
            .height(50.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            stringResource(R.string.appName),
            style = MaterialTheme.typography.h5
        )
        Row() {
            IconButton(
                onClick = { /*TODO*/ },
                Modifier
                    .clip(CircleShape)
                    .background(IconButtonBG)
                    .size(40.dp, 40.dp),
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Do User Action")
            }
            Box(modifier = Modifier.width(5.dp))
            IconButton(
                onClick = { /*TODO*/ },
                Modifier
                    .clip(CircleShape)
                    .background(IconButtonBG)
                    .size(40.dp, 40.dp),
            ) {
                Icon(Icons.Filled.Search, contentDescription = "Search Action")

            }
            Box(modifier = Modifier.width(5.dp))
            IconButton(
                onClick = { /*TODO*/ },
                Modifier
                    .clip(CircleShape)
                    .background(IconButtonBG)
                    .size(40.dp, 40.dp),
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.messager_icon),
                    contentDescription = "Messenger Icon",
                    Modifier.size(21.13.dp, 21.13.dp)
                )
            }
        }

    }
}


// TabBar Section
@Composable
fun TabBarSection(

){
    var index by remember {
        mutableStateOf(0)
    }
    TabRow(selectedTabIndex = index, Modifier.padding(vertical = 20.dp)) {
        Tab(selected = index==0, onClick = { index =0 }) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.home_icon),
                contentDescription = "Home Icon",
                Modifier.size(28.dp, 28.dp)
            )
        }
        Tab(selected = index==1, onClick = { index =1 }) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.grouph_icon),
                contentDescription = "Group Icon",
                Modifier.size(28.dp, 28.dp)
            )
        }
        Tab(selected = index==2, onClick = { index =2 }) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.personal_icon),
                contentDescription = "Personal Icon",
                Modifier.size(28.dp, 28.dp)
            )
        }
        Tab(selected = index==3, onClick = { index =3 }) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.video_icon),
                contentDescription = "Video Icon",
                Modifier.size(28.dp, 28.dp)
            )
        }
        Tab(selected = index==4, onClick = { index =4 }) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.notification_icon),
                contentDescription = "Notification Icon",
                Modifier.size(28.dp, 28.dp)
            )
        }
        Tab(selected = index==5, onClick = { index =5 }) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.menu_icon),
                contentDescription = "Menu Icon",
                Modifier.size(28.dp, 28.dp)
            )
        }
    }
}
/// Top Home HeadSection
@Preview(name = "Home Head Section Preview", showBackground = true)
@Composable
fun HomeHeadSectionPreview() {
    FacebookCloneTheme {
        Column {
            HomeHeadSection()
            TabBarSection()
        }
    }
}
