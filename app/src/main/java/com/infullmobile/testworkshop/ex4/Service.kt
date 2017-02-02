package com.infullmobile.testworkshop.ex4

import rx.Single

interface Service {
    fun fetchPrice(): Single<String>
}
