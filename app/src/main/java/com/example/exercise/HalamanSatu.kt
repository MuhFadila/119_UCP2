package com.example.exercise

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onConfirmButtonClicked: (String, String, String, String) -> Unit,
    onSubmitButtonClicked: () -> Unit,
    onSelectionChanged: (String) -> Unit,

) {
    var nama by remember { mutableStateOf("") }
    var NIM by remember { mutableStateOf("") }
    var konsentrasi by remember { mutableStateOf("") }
    var judul by remember { mutableStateOf("") }
    var DosenYgdiPilih by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 16.dp)
    ) {
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it },
            label = { Text(text = "Nama Mahasiswa") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )

        OutlinedTextField(
            value = NIM,
            onValueChange = { NIM = it },
            label = { Text(text = "NIM") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Phone
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
        )
        OutlinedTextField(
            value = konsentrasi,
            onValueChange = { konsentrasi = it },
            label = { Text(text = "Konsentrasi") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),

        )
        OutlinedTextField(
            value = judul,
            onValueChange = { judul= it },
            label = { Text(text = "Judul Skripsi") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),

            )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            }

            Button(
                onClick = {
                    if (nama.isNotEmpty() && NIM.isNotEmpty() && konsentrasi.isNotEmpty() && judul.isNotEmpty()) {
                        onConfirmButtonClicked(nama, NIM, konsentrasi, judul)
                    }
                }
            ) {
                Text(text = "Submit")
            }
        }
    }
