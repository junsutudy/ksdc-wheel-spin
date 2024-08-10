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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.commandiron.spin_wheel_compose.SpinWheel
import com.commandiron.spin_wheel_compose.SpinWheelDefaults
import com.commandiron.spin_wheel_compose.state.rememberSpinWheelState
import dev.ksdc.wheel.ui.theme.WheelTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WheelTheme {
                val names by remember {
                    mutableStateOf(
                        TODO()
                    )
                }

                val size by remember(key1 = names.size) {
                    mutableIntStateOf(names.size)
                }

                val (currentSelection, onCurrentSelectionChange) = remember {
                    mutableStateOf<String?>(
                        null
                    )
                }
                val (currentSelectedIndex, onCurrentSelectedIndexChange) = remember {
                    mutableStateOf<Int?>(
                        null,
                    )
                }

                val spinWheelState = rememberSpinWheelState(
                    pieCount = size,
                )
                val scope = rememberCoroutineScope()
                fun onWheelSpin() {
                    onCurrentSelectionChange(null)
                    scope.launch {
                        spinWheelState.spin { index ->
                            onCurrentSelectionChange(names[index])
                            onCurrentSelectedIndexChange(index)
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

                                    )
                            ),
                            dimensions = SpinWheelDefaults.spinWheelDimensions(
                                spinWheelSize = 550.dp,
                                selectorWidth = 50.dp,
                            ),
                            onClick = { onWheelSpin() },
                        ) { pieIndex ->
                            Text(
                                text = names[pieIndex],
                                style = MaterialTheme.typography.labelSmall,
                            )
                        }
                        AnimatedVisibility(
                            visible = currentSelection != null,
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                if (currentSelection != null)
                                    Text(
                                        text = currentSelection,
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
                                if (currentSelectedIndex != null) {
                                    names.removeAt(currentSelectedIndex)
                                    onCurrentSelectedIndexChange(null)
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
                                modifier = Modifier.padding(all = 16.dp),
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
