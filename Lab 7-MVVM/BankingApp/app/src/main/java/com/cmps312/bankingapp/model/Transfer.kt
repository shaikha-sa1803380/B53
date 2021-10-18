package com.cmps312.bankingapp.model

import kotlinx.serialization.Serializable
import java.security.SecureRandom
@Serializable
class Transfer(
    val benficiaryName: String? = "",
    val beneficiaryAccountNo: String?= "",
    val fromAccountNo: String?= "",
    val amount : Double?=0.0
val transferId: Int?=0


)