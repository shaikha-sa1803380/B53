package com.cmps312.bankingapp.views

import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.cmps312.bankingapp.model.Transfer
import com.cmps312.bankingapp.respository.BankRepository

class BankingViewModel(appContext: Context) : ViewModel() {

    private val bankRepository =BankRepository(appContext)
    val accounts by lazy {bankRepository.getAccounts()}
    val beneficiaries by lazy{bankRepository.getAccounts()}
    var transfers : MutableState<List<Transfer>> = mutableStateOf(listOf)
    int
    {
        transfers.value = bankRepository.getTransfers()

    }
    val addTransfer={
        transfers.value?.let{
            transfers.value = it +newTransfer
        }

    }
}