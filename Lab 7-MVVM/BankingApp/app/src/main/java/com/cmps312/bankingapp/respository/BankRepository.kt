package com.cmps312.bankingapp.respository

import android.content.Context
import com.cmps312.bankingapp.model.Account
import com.cmps312.bankingapp.model.Beneficiary
import com.cmps312.bankingapp.model.Transfer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class BankRepository(private val context: Context){
    private fun readData(filename:String)=
        context.assets.open(filename).bufferReader().use{it.readText()}
fun getTransfers()=
    Json.decodeFromString<List<Transfer>>(readData(filename = "transfers.json"))

    fun getBeneficiaries()=
        Json.decodeFromString<List<Beneficiary>>(readData(filename = "transfers.json"))

}