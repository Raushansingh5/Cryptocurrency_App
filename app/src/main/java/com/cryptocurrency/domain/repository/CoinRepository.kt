package com.cryptocurrency.domain.repository

import com.cryptocurrency.data.remote.dto.CoinDetailDto
import com.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>
    suspend fun getCoinById(coinId:String):CoinDetailDto

}