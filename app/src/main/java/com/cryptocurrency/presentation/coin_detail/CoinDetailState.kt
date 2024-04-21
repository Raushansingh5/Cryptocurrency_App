package com.cryptocurrency.presentation.coin_detail

import com.cryptocurrency.domain.model.Coin
import com.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean=false,
    val coin:CoinDetail ?=null,
    val error:String=""
)
