package dev.ksdc.wheel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.commandiron.spin_wheel_compose.SpinWheel
import com.commandiron.spin_wheel_compose.SpinWheelDefaults
import com.commandiron.spin_wheel_compose.state.rememberSpinWheelState
import dev.ksdc.wheel.ui.theme.WheelTheme
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WheelTheme {
                val names = remember {
                    mutableListOf(
                        "김규하", "김유진", "류현정", "김세환", "권하진", "이석훈", "박현준", "정지원", "성시현", "최지환",
                        "김진현", "김성연", "김대현", "임나현", "안요한", "이상준", "김현지", "남우석", "황동현", "장민호",
                        "권가령", "김은빈", "이상훈", "이서영", "김도원", "김승원", "홍예훈", "경민서", "황수연", "정아영",
                        "이용진", "이규리", "유나연", "김어진", "박예빈", "김수연", "박의엘", "최승우", "박현아", "박태준",
                        "육기준", "이지훈", "한승완", "이유호", "김샛별", "고경석", "이현규", "양병건", "유지우", "최강인",
                        "안용우", "박승덕", "오지훈", "김수현", "유찬홍", "변예현", "원도윤", "이상휘", "박영호", "안병준",
                        "김대운", "김강현", "정선영", "김태윤", "신승빈", "소지연", "성연우", "권강빈", "방준호", "하원",
                        "이지훈", "전건우", "윤유섭", "최형우", "심수연",
                    )
                }

                val size by remember(key1 = names.size) {
                    mutableIntStateOf(names.size)
                }

                val (currentSelectionIndex, onCurrentSelectionIndexChange) = remember {
                    mutableStateOf<Int?>(null)
                }


                val spinWheelState = rememberSpinWheelState(
                    pieCount = size,
                    durationMillis = 6000,
                )

                fun onWheelSpin() {
                    onCurrentSelectionIndexChange(null)
                    runBlocking {
                        spinWheelState.spin { index ->
                            onCurrentSelectionIndexChange(index)
                        }
                    }
                }
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        SpinWheel(
                            state = spinWheelState,
                            colors = SpinWheelDefaults.spinWheelColors(
                                pieColors = listOf(

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),

                                    Color(0xFFef476f),
                                    Color(0xFFf78c6b),
                                    Color(0xFFffd166),
                                    Color(0xFF83d483),
                                    Color(0xFF06d6a0),
                                    Color(0xFF0cb0a9),
                                    Color(0xFF118ab2),
                                    Color(0xFF073b4c),
                                ),
                            ),
                            dimensions = SpinWheelDefaults.spinWheelDimensions(
                                spinWheelSize = 500.dp,
                                selectorWidth = 20.dp,
                            ),
                            onClick = { onWheelSpin() },
                        ) { pieIndex ->
                            val name = names[pieIndex]
                            val style =
                                if (name.contains("추첨됨")) MaterialTheme.typography.labelSmall.copy(
                                    color = Color.Green
                                ) else MaterialTheme.typography.labelSmall
                            Text(
                                text = name,
                                style = style,
                            )
                        }
                        AnimatedVisibility(
                            visible = currentSelectionIndex != null,
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                if (currentSelectionIndex != null) Text(
                                    text = names[currentSelectionIndex],
                                    style = MaterialTheme.typography.displayLarge.copy(
                                        fontWeight = FontWeight.Bold,
                                    ),
                                )
                                Text(
                                    text = "축하드립니다!!",
                                    style = MaterialTheme.typography.titleLarge,
                                )
                            }
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        FilledTonalButton(
                            onClick = {
                                onWheelSpin()
                                if (currentSelectionIndex != null) {
                                    names[currentSelectionIndex] =
                                        "(추첨됨)${names[currentSelectionIndex]}"
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    all = 16.dp,
                                ),
                        ) {
                            Text(
                                text = "얍!",
                                modifier = Modifier.padding(all = 8.dp),
                                style = MaterialTheme.typography.titleLarge.copy(
                                    fontWeight = FontWeight.Bold,
                                ),
                            )
                        }
                    }
                }
            }
        }
    }
}
