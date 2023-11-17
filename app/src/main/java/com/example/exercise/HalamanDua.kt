package com.example.exercise

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.exercise.data.FormulirUIState

@Composable
fun HalamanDua (
    SkripsiUIState: FormulirUIState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){
    val items = listOf(
        Pair("Nama Mahasiswa", SkripsiUIState.nama),
        Pair("NIM", SkripsiUIState.NIM),
        Pair("konsentrasi", SkripsiUIState.konsentrasi),
        Pair("Judul Skripsi", SkripsiUIState.judul),

    )}