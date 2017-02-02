package com.infullmobile.testworkshop.ex4

import rx.Single
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

object MagicService: Service {

    private val myTimeTakingOperations: MyTimeTakingOperations = MyTimeTakingOperations()

    override fun fetchPrice(): Single<String> {
        return Single
                .fromCallable { myTimeTakingOperations.getPrice() }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}
