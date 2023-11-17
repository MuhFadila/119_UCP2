package com.example.exercise

import androidx.lifecycle.ViewModel
import com.example.exercise.data.FormulirUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SkripsiViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(FormulirUIState())
    val stateUI: StateFlow<FormulirUIState> = _stateUI.asStateFlow()

    fun setDosen(dosenPilihan: String){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(dosen = dosenPilihan)
        }
    }

    fun setFormulir(nama: String, NIM: String, konsentrasi: String, judul: String){
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = nama,
                NIM = NIM,
                konsentrasi = konsentrasi,
                judul = judul
            )
        }
    }
}
